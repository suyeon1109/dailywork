import random

while True:
    a = random.randint(1,9)
    b = random.randint(1,9)
    question = "%d+%d=?" % (a,b)
    c = int(input(question))

    if c==a+b:
        print("장답입니다")
    else:
        print("틀렸습니다")