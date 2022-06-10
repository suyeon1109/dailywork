intlist = [6,2,2,3,4,2,6,5,3,1]
temp = [0 for n in range(10)]

# print(temp)

for i in range(len(intlist)):
    print(intlist[i], end='')
print()

count=0

temp = intlist


# for i in range(len(intlist)):
#     a = intlist[i]
#     for j in range(len(intlist)):
#         if a == intlist[j]:
#             temp.remove(a)
# intlist 는 냅두고 temp에서 똑같은걸 지우는거고 for문 range도 쭉 len(intlist) 로 돌리는데 index out of range 가 대체 왜 나와?


for i in range(len(temp)):
    print(intlist[i], end='')
    print(temp[i], end='')
print()