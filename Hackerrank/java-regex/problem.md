## Java Regex
Write a class called MyRegex which will contain a string pattern. 
You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. 
Use the following definition of an IP address:

**IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. 
Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.**

Some valid IP address:
000.12.12.034 <br> 
121.234.12.12 <br> 
23.45.12.56 <br> 

Some invalid IP address:

000.12.234.23.23 <br> 
666.666.23.23 <br> 
.213.123.23.32 <br> 
23.45.22.32. <br> 
I.Am.not.an.ip <br> 

In this problem you will be provided strings containing any combination of ASCII characters. You have to write a regular expression to find the valid IPs.

Just write the MyRegex class which contains a String . The string should contain the correct regular expression.

(MyRegex class MUST NOT be public)

### Sample Input:

![input](https://github.com/yassinelakhdachi/CP_Chronicles/assets/94399032/e13f5740-3ae2-42d8-94c8-4f4b7e4000b4)


### Sample Output:


![output](https://github.com/yassinelakhdachi/CP_Chronicles/assets/94399032/bf13d2aa-5248-4298-b58e-01fb4adf932d)

