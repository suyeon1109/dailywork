"""
There is a coke problem that was popular a long time ago:
There is a supermarket that gives you a bottle of Coke if you bring two empty Coke bottles. 
If I bring 20 empty bottles, how many bottles will I get?
However, if you have less than 2 empty bottles, you cannot receive Coke.

While solving the problem, Sangbin found the perfect answer to the cola problem. 
Sangbin's solution is shown in the picture below. First, take 20 empty bottles of Coke 
and receive 10 bottles. After drinking all 10 bottles you received, take them to receive 5 bottles. 
After drinking all 4 of the 5 bottles, take them back to receive 2 bottles, and after drinking all 2 bottles, 
take them back to receive 1 bottle. When you receive bottles 1 and 5, you can receive another bottle 
if you drink the remaining bottle and take it back. In this case, Sangbin can receive a total of 
10 + 5 + 2 + 1 + 1 = 19 bottles of cola.

Sangbin, who was working hard at solving the problem, thought about the generalized cola problem. 
This problem is to calculate how many bottles of Coke you can get if you bring n empty bottles, 
given that there is a supermarket that gives you B bottles of Coke if you bring in empty bottles A. 
As with the existing Coke problem, if you have less than a empty bottle, you cannot receive additional 
empty bottles. Sangbin thought hard, but couldn't find an answer to the generalized cola problem. 
Please help Sangbin and create a program that solves the general coke problem.

Parameters include a, the number of bottles that must be given to the mart to receive cola, b, 
the number of cola bottles that the mart gives if you bring an empty bottle a, and n, the number 
of empty bottles that Sangbin has. Please write a solution function to return the number of bottles 
of cola that Sangbin can receive.
"""


def solution(a, b, n):
    answer = 0
    while (n>=a):
        # print("전",answer)
        answer += n//a*b
        # print("후",answer)
        # print("전",n)
        n=n%a+n//a*b
        # print("후",n)
    return answer


"""
other versions

1.
solution = lambda a, b, n: max(n - b, 0) // (a - b) * b
"""