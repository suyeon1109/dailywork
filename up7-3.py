def inputoperator():
    while True:
        op = input("더하기(+), 빼기(-), 곱하기(*), 나누기(/): ")
        if op == '+' or op=='-' or op=='*' or op =='/':
            return op
            break
        else:
            print("+,-,*,/ 중 하나만 입력하세요.")


def calculator(op,a,b):
    if op=='+':
        print("정답:", a+b)
    elif op == '*':
        print("정답:", a*b)
    elif op=='-':
        print("정답:", a-b)
    elif op =='/':
        while True:
            # a = int(input("첫 번째 숫지: "))
            # num2 = int(input("두 번째 숫지: "))
            if b!=0:
                print("정답:", a/b)
                break
            elif b==0:
                print("0으로 나눌 수 없습니다.")
                c = float(input("두 번째 숫지: "))
                b = c

while True:
    op = inputoperator()
    num1 = float(input("첫 번째 숫지: "))
    num2 = float(input("두 번째 숫지: "))
    calculator(op,num1,num2)
    end = input("계속(아무키나), 종료(Q/q): ")
    if end=='Q' or end=='q':
        break