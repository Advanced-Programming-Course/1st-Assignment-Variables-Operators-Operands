# 1st Assignment: Variables, Operators & Operands

### 1. Casting
#### In the input, two decimal numbers are given to you, write a program that in the output, displays the product and the sum of these two numbers without considering their decimal parts, in that order.
##### Example input
```
1.7664553
15.73
```
##### Example output
```
15
16
```

### 2. Even & Odd
#### In the input, 5 integer numbers are given, write a program that displays the count of even numbers in the input in the output.
##### Example input
```
2
3
2
5
7
```
##### Example output
```
2
```

### 3. String Addition
#### In the input, 2 strings are given as input, where each string is composed of one letter and one digit, in that order. Write a program that converts the digit present in these strings to an integer variable and displays the sum of them in the output.
##### Example input
```
A1
b2
```
##### Example output
```
3
```

### 4. Large Decimals
#### Run the code below and consider its output:
```
double a = 13.123456789012345;
float b = (float) a;
System.out.println(a);
System.out.println(b);
```
#### The float and double data types are used to store decimal numbers with 7 and 15 digits of precision, respectively. However, in some cases, we need to use numbers with much higher precision (for example, consider the decimal digits of the number pi). Search to find what solution has been developed in Java for this problem? Do you think strings can be used to solve this issue?

### 5. JVM & String Pool
#### Consider the following code snippet:
```
String s1 = "hello world!";
String s2 = "hello world!";
System.out.println(s1 == s2);
```
#### It's obvious that the output printed in the terminal will be "true" because the string values are equal!
#### Now, write and run this code:
```
String s1 = "hello world!";
String s2 = new String("hello world!");
System.out.println(s1 == s2);
```
#### You will see that the terminal prints "false"! This means that Java does not consider these two variables equal! Research the concept of the string pool in Java and how strings are stored, and explain why the first example returns "true" while the second example returns "false". Is there a way to get "true" as output in the second example without changing the first two lines?

### 6. Chef
#### An instant noodle chef has invented a cooking method that takes exactly 1 minute to prepare each packet. As the name suggests, cooking one packet takes exactly 1 minute on one stove. The restaurant has X stoves, and in each minute, only 1 packet (of noodles) can be cooked on one stove. If each customer orders exactly 1 packet of noodles, how many customers can the chef serve in Y minutes?
#### Input:
#### The input consists of a single line containing two natural numbers X and Y, separated by a space.  
#### 1 ≤ X, Y ≤ 1000

#### Output:
#### Your program's output should be a single number representing the maximum number of customers the chef can serve in Y minutes.
##### Sample Input 1
```
3 7
```
##### Sample Output 1
```
21
```
##### Sample Input 2 
```
7 8
```
##### Sample Output 2 
```
56
```

### 7. Swapping
#### Your code will be checked manually in addition to automated testing.  
#### Time Limit: 1 second  
#### Memory Limit: 256 MB  
#### You need to swap (exchange) the values of two given variables without using any auxiliary memory.
#### Input:
#### The input consists of a single line containing two natural numbers **n** and **m** (in that order), separated by a space.  
#### 1 ≤ n, m ≤ 100000
#### Output:
#### Your program's output should consist of the two swapped numbers.
##### Sample Input 1
```
1 2
```
##### Sample Output 1 
```
2 1
```
##### Sample Input 2   
```
10 15
```
##### Sample Output 2 
```
15 10
```

### 8. Reversal
#### Without using any conditional or iterative structures.
#### Time Limit: 1 second  
#### Memory Limit: 256 MB  
#### Write a program that takes a four-digit number **n** as input and prints its reverse.
#### Input:
#### The input consists of a single line containing a natural number n.  
#### 1000 ≤ n ≤ 10000
#### Output:
#### Print the reversed number.
##### Sample Input 1
```
159
```
##### Sample Output 1  
```
951
```
##### Sample Input 2 
```
2100
```
##### Sample Output 2 
```
12
```

### 9. Logic
#### Simplify the following logical expression and determine the final value of the variable flag:

```
Boolean flag = (2 > 3 || false) && (true || false) || (51 % 17 == 0)
```

### 10. Average

#### Five integers will be provided as input. Write a program that displays the average and the sum of these numbers in order.
##### Example input
```
1
3
4
6
1
```
##### Example Output 
```
3
15
```
