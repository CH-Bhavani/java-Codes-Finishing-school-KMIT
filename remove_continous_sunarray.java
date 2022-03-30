In a school assembly, the students of class-3 stood in a line in random order of their heights.
the teacher wants remove few students, so that the line remains in increasing order of their heights.

help the teacher to print the count of students to be removed from the line.

Note: the teacher has to remove the continous subsequence.

example:
input =8
2 3 4 11 5 3 4 6
output=3

The shortest subsequence teacher  can remove is [11,5,3] of length 3. 
The remaining student heights after that will be [2,3,4,4,6].


Another correct solution is to remove the subsequence [4,11,5].
The remaining student heights after that will be [2,3,3,4,6].


input =5
5 4 3 2 1
output =4
Explanation: Since the heights are strictly decreasing, we can only keep a single student. Therefore we need to remove a subsequence of students count 4, either [5,4,3,2] or [4,3,2,1].
