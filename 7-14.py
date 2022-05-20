def oddsum(start,end):
    sum = 0
    for i in range(start,end+1):
        if i%2!=0:
            sum+=i
        # else:
        #     sum+=0
    return sum


def evensum(start,end):
    sum=0
    for i in range(start,end+1):
        if i%2==0:
            sum+=i
        # else:
        #     sum+=0
    return sum



start = int(input("시작수: "))
end = int(input("끝수: "))
print("홀수합 =", oddsum(start,end))
print("짝수합 =", evensum(start,end))