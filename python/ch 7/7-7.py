def calcstep(begin,end,step):
    sum=0
    for i in range(begin, end+1,step):
        sum+=i
    return sum

print("1 ~ 10 =", calcstep(1,10,2))
print("2 ~ 10 =", calcstep(2,10,2))
print("3 ~ 10 =", calcstep(3,10,3))