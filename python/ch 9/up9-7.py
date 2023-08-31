score = []
for i in range(1,11):
    scores = int(input(str(i) + "번째 정수: "))
    score.append(scores)

print("정렬 전:", score)

maximum = score[0]
li=[]
for i in range(len(score)):
    if maximum < score[i]:
        maximum = score[i]
        li.append(maximum)
li.reverse()
#이 부분이 왜 안먹는지 이유를 모르겠음


print("정렬 후: ", li)