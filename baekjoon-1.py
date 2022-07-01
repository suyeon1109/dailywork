numbers = int(input())
weight = []
height = []

for i in range(numbers):
    w,h = map(int,input().split())
    weight.append(w)
    height.append(h)

we = weight
he = height

rank = []

for i in range(numbers):
    count1 = 1
    for j in range(numbers):
        if weight[i] < we[j] and height[i] < he[j]:
            #print(weight[i], we[j], height[i], he[j])
            count1+=1
    rank.append(count1)


for i in range(len(rank)):
    print(rank[i], end=" ")
