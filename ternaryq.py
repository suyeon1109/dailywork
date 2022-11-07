"""
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.
"""


def solution(n):
    rev_base = ''

    while n > 0:
        n, mod = divmod(n, 3)
        rev_base += str(mod)
    rev_base=(int(rev_base,3))

    return rev_base

# def solution(n):
#     n = solution(n,3)
#     reversed_n = 0

#     while n != 0:
#         digit = n % 10
#         reversed_n = reversed_n * 10 + digit
#         n //= 10
    
#     reversed_n = int('reversed_n',10)
#     return reversed_n