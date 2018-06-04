# Lab-A9
This repository contains five programs: DigitCount, DigitMatch, Fibonacci, Multiplication, WriteSequence

The Fibonacci program contains a recursive method that takes in a single integer (x >= 0) and returns the appropriate Fibonacci number of the Fibonacci number series.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

The Multiplication program contains a recursive method called mult that solves a multiplication problem recursively.
The method takes in two arguments - the numbers to be multiplied.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

The DigitMatch program contains a recursive method called countMatch that counts the matching digits recursively.
The method accepts two non-negative integers as parameters and returns the number of digits that match between them. Two digits match if they are equal and have the same position relative to the end of the number (i.e. starting with the ones digit). In other words, the method should compare the last digits of each number, the second-to-last digits of each number, the third-to-last digits of each number, and so forth, counting how many pairs match. For example, for the call of countMatch(1072503891, 62530841), the method would compare as follows:
1 0 7 2 5 0 3 8 9 1
|  |  |  |   |  |  |  |
6 2 5 3 0 8 4 1

The method should return 4 in this case because 4 of these pairs match (2-2, 5-5, 8-8, and 1-1). 

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

The WriteSequence program contains  a class called WriteSequence that has a write method that accepts an integer n as a parameter and prints a symmetric sequence of n numbers with descending integers ending in 1 followed by ascending integers beginning with 1.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

The DigitCount program contains a class called DigitCount that generates a random number and counts the digits in the number. It has three methods:
A constructor that takes a seed and initializes a random number generator to the given seed
Method generateNewNumber(int max) generates a new random number between 0 and max-1 and returns it
Method countDigits(int num) returns the number of digits in num.
