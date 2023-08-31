
# n,k = map(int,input().split())
# coin_list=[]
# ans=0

# for i in range(10):
#     a=int(input())
#     coin_list.append(a)

# # list=[]

# # for coins in coin_list:

# #     # klist=[]
# #     # for i in range(len(str(k))):
# #     #     m=len(str(k))-1
# #     #     klist.append(int(str(k)[i])*10**m)
# #     #     m-=1
        
# #     # for ks in klist:
# #     #     mn=ks//coins
# #     #     if mn<10:
# #     #         ans+=mn
# #     #         k-=coins*mn
# #     while k>=0:
# #         mn=k//coins
# #         if mn<10 and mn>=1:
# #             ans+=mn
# #             k-=coins*mn

# #             print(k,ans, coins)

# # print(ans)




# def solution(arr):
#     ans=[]
#     # for i in range(len(arr)):
#     #     for j in range(len(arr)):
#     #         if i!=j:
#     #             a = arr[i] + arr[j]
#     #             list.append(a)
            
#     for i in range(len(arr)):
#         if arr[i] not in ans:
#             ans.append(arr[i])

#     ans.sort()
                
#     return ans


# print(solution([2,1,3,4,1]))

# # [2,3,4,5,6,7]


def solution(arr):
    ans=[]
    list=[]
            
    for i in range(len(arr)):
        try:
            if arr[i]!=arr[i+1] or arr[i]!=arr[i-1]:
                ans.append(arr[i])
        except:
            pass
                
    return list
    
print(solution([1,1,3,3,0,1,1]))

