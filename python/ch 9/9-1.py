score = []
sum = 0

for i in range(5):
    element = int(input("성적"+str(i+1)+": "))
    score.append(element)
    sum+=element
    average=sum/len(score)

print("입력값은: ",score)
print("총점: ",sum)
print("평균: ", average)