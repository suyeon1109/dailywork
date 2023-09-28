"""
A fruit seller is packing boxes of apples. Apples are classified into scores 
from 1 to k depending on their condition, with k being the best quality apple 
and 1 being the worst quality apple. The price of a box of apples is determined as follows:

Each box is packed with m apples.
If the lowest score of apples in the box is p (1 ≤ p ≤ k), then the price of a 
box of apples is p * m. We want to calculate the maximum profit that a fruit 
seller can make if he sells as many apples as possible (apples are only sold 
in boxes, and any excess apples are discarded).

For example, if k = 3, m = 4, and the scores of 7 apples are [1, 2, 3, 1, 2, 3, 1], 
then the apple box consists of [2, 3, 2, 3] as follows: You can make one and sell 
it for maximum profit.

(lowest apple score) x (number of apples in a box) x (number of boxes) = 2 x 4 x 1 = 8
Given the maximum score k of apples, the number m of apples in one box, and the scores 
of apples, please complete the solution function that returns the maximum profit that 
the fruit seller can obtain.
"""

# my solution
def solution1(k, m, score):
    answer = 0
    score.sort(reverse=True)
    # print(score)
    while len(score)%m!=0:
        score.pop(-1)
    # print(score)
    for i in range(0,len(score),m):
        answer+=score[i+m-1]*m
    return answer

# others'
def solution2(k, m, score):
    return sum(sorted(score)[len(score)%m::m])*m

solution3 = lambda _, m, s: sum(sorted(s)[-m::-m]) * m


print(solution1(4,3,[4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]))
print(solution1(3,4,[1, 2, 3, 1, 2, 3, 1]))