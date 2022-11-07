import random

def leveloperator():
    while True:
        while True:
            lev = input("난이도를 입력허세요(1,2,3): ")
            if lev == '1' or lev=='2' or lev=='3':
                return lev
                #break
            else:
                print("1,2,3 중 하나만 입력하세요.")

def inputoperator():
    while True:
        op = input("더하기(+), 빼기(-), 곱하기(*), 나누기(/): ")
        if op == '+' or op=='-' or op=='*' or op =='/':
            return op
            #break
        else:
            print("+,-,*,/ 중 하나만 입력하세요.")


def calculator(lev,op,cnt):
    right = 0
    wrong = 0
    for i in range(1,cnt+1):
        if lev == '1':
            num1 = random.randint(1,10)
            num2 = random.randint(1,10)
        elif lev =='2':
            num1 = random.randint(1,100)
            num2 = random.randint(1,10)
        elif lev == '3':
            num1 = random.randint(10,100)
            num2 = random.randint(1,10)

        ans = int(input(str(i)+"번: "+str(num1)+op+str(num2)+" = "))

        if op=='+':
            result = num1+num2
        elif op == '*':
            result = num1*num2
        elif op=='-':
            result = num1-num2
        elif op =='/':
            result = num1/num2

        if ans == result:
            right += 1
        else:
            wrong += 1

    print("정답수:", right)
    print("오답수:", wrong)


lev = leveloperator()
cnt = int(input("몇 문제를 푸시겠습니까?: "))
op = inputoperator()
calculator(lev,op,cnt)