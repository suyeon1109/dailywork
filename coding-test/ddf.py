# def solution(n, arr1, arr2):
#     arr_1=[]
#     arr_2=[]
#     for each in arr1:
#         a = str(bin(each))
#         a=a[2:]
#         if len(a)!=n:
#             a = "0"*(n-len(a))+a
#         arr_1.append(a)
#     print(arr_1)
        
#     for each in arr2:
#         b = str(bin(each))
#         b=b[2:]
#         if len(b)!=n:
#             b = "0"*(n-len(b))+b
#         arr_2.append(b)
#     print(arr_2)
    
#     ans=[]
#     ans1=[]
#     list=[]
#     list1=[]

#     for i in range(len(arr_1)):
#         for j in range(len(arr_1)):
#             print(arr_1[i][j])
#             if arr_1[i][j]==1:
#                 list.append("#")
#             elif arr_1[i][j]==0:
#                 list.append(" ")


#             print(arr_2[i][j])
#             if arr_2[i][j]==1:
#                 list1.append("#")
#             elif arr_2[i][j]==0:
#                 list1.append(" ")
#         ans.append(list)
#         ans1.append(list1)
#         list=[]
#         list1=[]

#     print(ans)
#     print(ans1)

#     for i in range(len(arr_1)):
#         for j in range(len(arr_1)):
#             if arr_1[i][j] == "#" or arr_2[i][j] == "#":
#                 arr_1[i][j] == "#"
#             else:
#                 arr_1[i][j] == " "

#     answer = arr_1
#     print(answer)
#     return answer

# solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28])







def solution(s):
    if len(s)%2!=0:
        answer=s[len(s)-(len(s)//2)-1]
    else:
        a=(len(s)//2)-1
        b=len(s)//2
        answer=s[a:b+1]
    return answer

print(solution("abcde"))
print(solution("qwer"))





def solution(n):
    if n==1:
        answer=[[1,2]]
    elif n==2:
        answer=[ [1,2], [1,3], [2,3] ]
    elif n==3:
        answer=[ [1,2], [1,3], [2,3],   [1,2], [3,1], [3,2],   [1,2] ]
    elif n==4:
        answer=[ [1,2], [1,3], [2,3],   [1,2], [3,1], [3,2],   [1,2], [2,3], [2,1], [3,2], [2,3],   [1,2], [1,3],  ]

        