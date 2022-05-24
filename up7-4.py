import random

def inputoperator():
    while True:
        op = input("더하기(+), 빼기(-), 곱하기(*), 나누기(/): ")
        if op == '+' or op=='-' or op=='*' or op =='/':
            return op
            break
        else:
            print("+,-,*,/ 중 하나만 입력하세요.")

def calculator(op):
    num1 = random.randint(1,100)
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
        
        ans = float(input("정답을 입력하시오: "))
        
        if ans == result:
            print("참 잘했어요.")
            break
        else:
            print("틀렸습니다.")


while True:
    op = inputoperator()
    calculator(op)
    end = input("계속(아무키나), 종료(Q/q): ")
    if end=='Q' or end=='q':
        break