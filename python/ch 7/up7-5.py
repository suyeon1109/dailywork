import random

def leveloperator():
    while True:
        while True:
            lev = input("난이도를 입력허세요(1,2,3): ")
            if lev == '1' or lev=='2' or lev=='3':
                return lev
                break
            else:
                print("1,2,3 중 하나만 입력하세요.")


def inputoperator():
    while True:
        op = input("더하기(+), 빼기(-), 곱하기(*), 나누기(/): ")
        if op == '+' or op=='-' or op=='*' or op =='/':
            return op
            break
        else:
            print("+,-,*,/ 중 하나만 입력하세요.")


def calculator(lev,op):
    if lev == '1':
        num1 = random.randint(1,10)
        num2 = random.randint(1,10)
    elif lev=='2':
        num1 = random.randint(1,100)
        num2 = random.randint(1,10)
    elif lev=='3':
        num1 = random.randint(10,100)
        num2 = random.randint(1,10)

    print(num1,op,num2,"=?")
    while True:
        if op=='+':
            result = num1+num2
        elif op == '*':
            result = num1*num2
        elif op=='-':
            result = num1-num2
        elif op =='/':
            result = num1/num2
        
        ans = int(input("정답을 입력하시오: "))
        
        if ans == result:
            print("참 잘했어요.")
            break
        else:
            print("틀렸습니다.")


while True:
    lev = leveloperator()
    op = inputoperator()
    calculator(lev,op)
    end = input("계속(아무키나), 종료(Q/q): ")
    if end=='Q' or end=='q':
        break