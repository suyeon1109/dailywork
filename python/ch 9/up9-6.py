score = [[1,2, 3, 4, 0],
        [5, 6, 7, 8, 0],
        [9,10,11,12, 0],
        [0, 0, 0, 0, 0]]

# for i in range(len(score)-1):
#     rowsum = ' '.join(str(each) for each in score[i])
#     print(rowsum, sum(score[i]))
#     score[i].append(sum(score[i]))
#     # print(score)
#     # 여기서 프린트 해서 확인했을때도 score에 각 row의 합도 append 됬는데 왜 밑에서 range(6) 이 index out of range 인지 모르겠음.

# for i in range(6):
#     print(score[0][i] + score[1][i] + score[2][i] + score[3][i], end = " ")

# for i in range(1,len(score)+1):
#     for each in score[i-1]:
#         score[i-1].append(sum(each))
#         print(each)

# for i in range(len(score)):
#     print(score[0][i] + score[1][i] + score[2][i] + score[3][i], end = " ")


for i in range(len(score)):
    rowsum = 0
    for j in range(len(score[i])):
        rowsum+=score[i][j]
    score[i].append(rowsum)

print(score)

for i in range(len(score)):
    colsum = []
    for j in range(len(score[i])):
        sum = score[0][i] + score[1][i] + score[2][i] + score[3][i]
#     colsum.append(sum)
# score.append(colsum)

print(score)


for i in range(len(score)):
    for j in range(len(score[i])):
        if score[i][j] > 0:
            print(score[i][j], end=" ")
    print("")


# 1. 78 왜 안찍히는지
# 2. 두번째 for 문 제대로 append 되게 하기

# append x, [0,0,0,0,..] replace해서 사용