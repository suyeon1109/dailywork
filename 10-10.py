#9,10,11
 
import random
import time
marklist = ["+", "-", "*"]
counts = 0
cnts=0

while True:
    a = random.randint(10,99)
    b = random.randint(10,99)
    d = random.choice(marklist)

    start = time.time()

    question = "%d %s %d=?" % (a,d,b)
    c = int(input(question))

    end = time.time()
    et = end-start

    if c == 0:
        break

    if d =="+":
        if c==a+b:
            if et>10:
                print("시간초과로 틀렸습니다")
            else:
                print("장답입니다")
                counts+=1
        else:
            print("틀렸습니다")
            cnts +=1
    
    elif d =="-":
        if c==abs(a-b):
            if et>10:
                print("시간초과로 틀렸습니다")
            else:
                print("장답입니다")
                counts+=1
        else:
            print("틀렸습니다")
            cnts +=1

    elif d =="*":
        if c==a*b:
            if et>10:
                print("시간초과로 틀렸습니다")
            else:
                print("장답입니다")
                counts+=1
        else:
            print("틀렸습니다")
            cnts +=1
    
    
print("%d개 맞췄습니다." % counts)
print("%d개 틀렸습니다." % cnts)