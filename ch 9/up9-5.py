temp = []
sum = 0

for i in range(1,11):
    temps = int(input(str(i) + "일 온도 입력: "))
    temp.append(temps)
    sum+=temps

print("평균 온도:", sum/len(temp))

mintemp = temp[0]
maxtemp = temp[0]

for i in range(len(temp)):
    if mintemp>temp[i]:
        mintemp = temp[i]
    if maxtemp<temp[i]:
        maxtemp = temp[i]


print("최고온도:", maxtemp)
print("최저온도:", mintemp)