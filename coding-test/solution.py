# def solution(cards1, cards2, goal):
#     for each in goal:
#         if len(cards1)!=0:
#             if each==cards1[0]:
#                 cards1.pop(0)
#             else:
#                 if len(cards2)!=0:
#                     if each==cards2[0]:
#                         cards2.pop(0)
#                     else:
#                         return "No"
#                 else:
#                     return "No"
#         else:
#             if len(cards2)!=0:
#                 if each==cards2[0]:
#                     cards2.pop(0)
#                 else:
#                     return "No"
#             else:
#                 return "No"
        
#     return "Yes"

# print(solution(["i", "drink", "water"],["want", "to"],["i", "want", "to", "drink", "water"]))
# print(solution(["i", "water", "drink"],["want", "to"],["i", "want", "to", "drink", "water"]))


#def solution(s):
    # length = []
    # x = s[0]
    # countx=1
    # countnonx=0
    # for i in range(1,len(s)):
    #     if s[i]==x:
    #         countx+=1
    #     else:
    #         countnonx+=1

    #     if countx==countnonx:
    #         length.append(s[s.index(x):i+1])
    #         print(s[s.index(x):i+1])
    #         countx=0
    #         countnonx=0
    #         if i!=len(s)-1:
    #             x = s[i+1]
    # return len(length)


    # length = 0
    # x = s[0]
    # countx=0
    # countnonx=0

    # for i in s:
    #     if i==x:
    #         countx+=1
    #     else:
    #         countnonx+=1

    #     if countx==countnonx:
    #         length+=1
    #         countx=0
    #         countnonx=0
    #         if i!=len(s)-1:
    #             x = 
    # return length


#     answer=0
#     a=0
#     b=0
#     for i in s:
#         if a == b:
#             answer += 1
#             temp = i
#         if i==temp:
#             a += 1
#         else:
#             b += 1
            
#     return answer

# print(solution("banana"))
# print(solution("abracadabra"))
# print(solution("aaabbaccccabba"))






def solution(my_string, queries):
    # answer = ""
    reverse = ""
    for i in range(len(queries)):
        for j in range(queries[i][1]-queries[i][0]+1):
            reverse+=my_string[queries[i][1]-j]
        # print("reverse:", reverse)
        my_string=my_string[:queries[i][0]]+reverse+my_string[queries[i][1]+1:]
        # print("my_string",my_string)
        reverse=""
    return my_string

"""
reverse: mr
reverse: progmrer
reverse: aspro
reverse: maspr
"""

print("answer",solution("rermgorpsam", [[2, 3], [0, 7], [5, 9], [6, 10]]))