import random
import time

w = ["cat", "dog", "fox", "monkey", "mouse", "panda", "frog", "snake", "wolf"]
n = 1

input("[타자게임] 준비되면 엔터! ")
start = time.time()

q = random.choice(w)
while n<=5:
    print("*문제%d" % n)
    print(q)
    x = input()
    if x == q:
        print("통과")
        n+=1
        q = random.choice(w)
    else:
        print("오타! 다시 도전")
    
end = time.time()
et = end-start
print("타자시간: %2f초" % et)