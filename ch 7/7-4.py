def calcstep(begin,end,step):
    sum=0
    for i in range(begin,end+1,step):
        sum += i
    print(begin,'~',end,'=',sum)

calcstep(1,10,2)
calcstep(2,10,2)
calcstep(3,10,3)