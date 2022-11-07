li = []
for i in range(1,6):
    score = int(input(str(i) + "번 학생의 성적을 입력하세요: "))
    li.append(score)

print("입력값은:", li)

li.sort()
print("정렬값은:", li)