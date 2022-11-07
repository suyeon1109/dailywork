score = []
sum=0

for i in range(1,6):
    scores = int(input(str(i) + "번 학생의 성적을 입력하세요: "))
    score.append(scores)
    sum+=scores

print("평균 =", sum/5)

exc = []
for each in score:
    if each >= sum/5:
        exc.append(each)
    
print("평균이상 =", str(len(exc))+"명")