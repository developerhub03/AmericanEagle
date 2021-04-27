package com.americaneagle;

import java.util.Scanner;
import java.util.Stack;

public class PoliticianProblem {

	static int MATRIX[][];

	// Returns true if a knows b, false otherwise
	static boolean knows(int a, int b) {
		boolean res = (MATRIX[a][b] == 1) ? true : false;
		return res;
	}

	// Returns -1 if celebrity is not present. If present, returns id (value from 0
	// to n-1).
	static int findPolitician(int n) {
		Stack<Integer> st = new Stack<>();
		int c;

		// Step 1 :Push everybody onto stack
		for (int i = 0; i < n; i++) {
			st.push(i);
		}

		while (st.size() > 1) {
			// Step 2 :Pop off top two persons from the stack, discard one person based on
			// return status of knows(A, B).
			int a = st.pop();
			int b = st.pop();

			// Step 3 : Push the remained person onto stack.
			if (knows(a, b)) {
				st.push(b);
			}

			else
				st.push(a);
		}

		c = st.pop();

		// Step 5 : Check if the last person is celebrity or not
		for (int i = 0; i < n; i++) {
			// If any person doesn't know 'c' or 'a' doesn't know any person, return -1
			if (i != c && (knows(c, i) || !knows(i, c)))
				return -1;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		MATRIX = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				MATRIX[i][j] = sr.nextInt();
			}
		}
		if (n >= 2 && n <= 100) {
			int result = findPolitician(n);
			if (result == -1) {
				System.out.println(result);
				System.out.println("There is no Politician");
			} else
				System.out.println(result);
		} else {
			System.out.println("Graph length must between 2 and 100");
		}

	}

}
