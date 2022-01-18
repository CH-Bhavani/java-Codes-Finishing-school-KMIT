/*

Shanmukha creating a special strings.
A string is said to be a special string, if all the letters appeared 
even number of times, or only one letter appeared odd number of times.

For example: "adda" and "iaaff" are special strings.
but "iaf" is not a special string.

You are given a word W, where W conatins the letters from a to j.
Our task is to findout, the number of non-empty special strings, 
which are substrings of word W can be formed.
if a substring appeared more than once, count each appearance separately.

NOTE: subsequences are not allowed.

Input Format:
-------------
A String W, the word.

Output Format:
--------------
Print an integer, number of special strings.


Sample Input-1:
---------------
egg

Sample Output-1:
----------------
5

Explanation:
------------
The special strings formed from the word "egg" are:
'e'gg, e'g'g, eg'g', e'gg', 'egg'.


Sample Input-2:
---------------
bajaj

Sample Output-2:
----------------
9

Explanation:
------------
The special strings formed from the word "bajaj" are:
'b'ajaj, b'a'jaj, baj'a'j, ba'j'aj, baja'j', b'aja'j, ba'jaj', b'ajaj', 'bajaj'.



*/
