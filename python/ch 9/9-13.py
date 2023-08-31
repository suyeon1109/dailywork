score = list()
for i in range(1,6):
    scores = int(input("성적: "))
    score.append(scores)
print("입력값은:", score)

for i in range(len(score)):
    if i ==1:
        score[i] = 0
    elif score[i]>=90:
        score[i] =100
    else:
        score[i]+=10


print("수정값은:", score)