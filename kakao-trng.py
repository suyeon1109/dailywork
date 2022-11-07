# def solution(n, lost, reserve):
#     answer = n - len(lost) + len(reserve)
#     total=0
#     # if answer > n:
#     #     answer-=(answer - n)
#     for i in range(len(lost)):
#         for j in range(len(reserve)):
#             if lost[i] != reserve[j]+1 and lost[i] != reserve[j]-1:
#                 total+=1
#                 if len(lost) == total:
#                     break
#                 else:
#                     answer-=total
                
        
#         # try:
#         #     if lost[i] == reserve[i]-1 or lost[i] == reserve[i]+1:
#         #         answer = len(reserve)-len(lost)+1
#         # except: pass
        
#     # a = 2*len(reserve) - len(lost)
#     # answer=a//n
    
    
#     """
#     총 합 = n - len(lost) + len(reserve)
#     1. 서로 앞뒤 번호가 맞는지 체크
#     1-1. 맞으면 +1
#     2. lost reserve 둘다 있는 애가 있는지
#     2-1. 있으면 그 값을 두 리스트에서 다 빼기?
#     """
#     return answer




"""
아파트 동호수를 다음과 같은 두 리스트 변수를 활용해서 출력하세요.
단, 각 동과 동 사이에는 구분이 되도록 한 라인씩 띄워서 출력하세요
"""

dong = ['101동', '102동', '103동', '104동']
hos = ['101호', '102호', '103호', '104호', '105호']

for i in range(len(dong)):
    for j in range(len(hos)):
        print(dong[i], hos[j])
    print()




"""
prices 변수에 입력된 값을 원 화로 바꿔서 계산해주세요.

환율: 달러 당 1282원
출력: 128200원
"""

prices = '100 달러'

print(str(int(prices[:-3])*1282)+"원")



"""
다음 리스트에서 음수 데이터를 삭제하고, 양수만 가진 리스트 변수로 만들고,
해당 변수를 출력하시오.
"""

num_list = [0,-11,31,22,-11,33,-44,-55]
temp = []

for i in range(len(num_list)):
    if num_list[i] >= 0:
        temp.append(num_list[i])

# for i in range(len(num_list)):
#     print(num_list[i], end=", ")

print(temp)