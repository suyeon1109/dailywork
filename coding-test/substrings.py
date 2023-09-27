"""
Given strings t and p consisting of numbers, complete a function solution that returns 
the number of times in t that the number represented by this substring is less than or 
equal to the number represented by p among substrings with the same length as p.

For example, if t="3141592" and p="271", the substrings of length 3 for t are 
314, 141, 415, 159, 592. Among the numbers represented by this string, 
there are two numbers less than or equal to 271: 141 and 159.
"""

def solution(t, p):
    answer = 0
    length = len(p)
    compare = []
    for i in range(len(t)-length+1):
        substring = t[i:i+length]
        compare.append(int(substring))
    print(compare)
    
    for each in compare:
        if each<=int(p):
            answer+=1
    return answer

"""
other versions:

1.
def solution(t, p):
    return len([t[i: i+len(p)] for i in range(len(t)-len(p)+1) if int(t[i: i+len(p)]) <= int(p)])

2.
def solution(t, p):
    answer = 0

    for i in range(len(t) - len(p) + 1):
        if int(p) >= int(t[i:i+len(p)]):
            answer += 1

    return answer
"""


"""
advanced version -- finding substrings that has the 
equal or smaller value for sum of each index with that of p
"""

def solution2(t, p):
    answer = 0
    p_sum = 0
    length = len(p)
    for i in range(length):
        p_sum += int(p[i])
    print(p_sum)
    
    segments = []
    for i in range(len(t)-length+1):
        segments.append(t[i:i+length])
    print(segments)
    
    compare = []
    for each in segments:
        each_sum=0
        for i in range(length):
            each_sum+=int(each[i])
        compare.append(each_sum)
    print(compare)
    
    for each in compare:
        if each<=p_sum:
            answer+=1
    return answer