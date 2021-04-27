# AmericanEagle

# Find the Politician
Description:  
Suppose you are at a party with n people (labeled from 0 to n - 1), and among them, there may exist one politician. The definition of a politician is that all the other n - 1 people know him/her, but he/she does not know any of them.
Now you want to find out who the politician is or verify that there is not one. The only thing you are allowed to do is to ask questions like: "Hi, A. Do you know B?" to get information about whether A knows B. You need to find out the politician (or verify there is not one) by asking as few questions as possible (in the asymptotic sense).
You are given a helper function boolean knows(a, b). You can use this function in your code to get whether A knows B, or not.
Implement a function int findPolitician(n). There will be exactly one politician if he/she is in the party. Return the politician’s label if there is a politician in the party. If there is no politician, return -1.  
Example 1:  
Input: graph = [[1,1,0],[0,1,0],[1,1,1]]  
Output: 1  
Explanation: There are three persons labeled with 0, 1 and 2. graph[i][j] = 1 means person i knows person j, otherwise graph[i][j] = 0 means person i does not know person j. The politician is the person labeled as 1 because both 0 and 2 know him but 1 does not know anybody.  
Example 2:  
Input: graph = [[1,0,1],[1,1,0],[0,1,1]]  
Output: -1  
Explanation: There is no politician.  
Constraints:  
• n == graph.length  
• n == graph[i].length  
• 2 <= n <= 100  
• graph[i][j] is 0 or 1.  
• graph[i][i] == 1  


# Running Program:
1) Run the PoliticianProblem.java file as regular java file and then give the input to code as below
Input to the Code:  
4  
0 0 1 0  
0 0 1 0  
0 0 1 0  
0 0 1 0
