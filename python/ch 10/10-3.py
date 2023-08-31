import time

for dan in range(2, 10): 
    for i in range(1, 10):  
        print(dan, "*",i, "=", dan * i)
        time.sleep(0.2)
    time.sleep(1)