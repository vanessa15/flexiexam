--- Clone the GIT REPOSITORY - Import into Eclipse as Existing Project ---

--- After Creating the solution either Fork the repository or email us ---

--- Email Michelle : michelle.ison@flexisourceit.com.au and Jireh.Legaspi@flexisourceit.com.au ---

Define a function "LookAndSay" as follows 
 Read off the digits of the input counting the number of digits in groups of the same digit.
 
 Ex. 
 
 LookAndSay(1) = 11  		Because 1 is read off as one 1 or "11"
 
 LookAndSay(11) = 21 		Because 11 is read off as two 1's or "21"
 
 LookAndSay(21) = 1211 		Because 21 is read off as one 2's then one 1's or "1211"
 
 LookAndSay(1211) = 111221 	Because 1211 is read off as one 1's then 2 one's then two 2's or "111221"
 
 LookAndSay(111221) = 312211	Because 111221 is read off as 3 one's then two 2's then one 1's or "312211"
 
 
 We define a "Look and Say" sequence as repeatedly call the "LookAndSay" function on its output.
 
Given the number "start" and the number of iteration "n", calculate the "nth" number in a "LookAndSay" starting from "start".

 
 Based from the previous Example. If the start is "11" and n = 2 
 
 The input will look like this LookAndSay("11", 2) = Then the output is 1211 because LookAndSay(LookAndSay(11)) = 1211; 
 
 We will use String representation to avoid Number overflow.
 
 Create the LookAndSay Method defined below and pass all the Unit tests.
 
