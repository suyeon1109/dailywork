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
# 아아아아아아아아아아아아아ㅏ아아앙아ㅏ짜증나 앙무겂도 맘엠ㅇ안ㅇ들어!!!!!!!!!!!!!!!!!!! 되는게없어 요즘에 개짜증나게 어우챠ㅓ우처우처ㅜㄴ아ㅓ춴우차ㅓ눙처ㅏㅇ누차ㅓ 진짜 개짜증나 


for i in range(len(temp)):
    print(intlist[i], end='')
    print(temp[i], end='')
print()