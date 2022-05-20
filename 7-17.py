def answer(num1,num2):
    print(num1,"+",num2,"= ?")
    while True:
        a = int(input("정답을 입력하시오: "))
        if a == num1 + num2:
            print("참 잘했어요")
            break
        else:
            print("틀렸습니다")

def plusquiz(count):
    for i in range(count):
        num1 = int(input("첫번째 숫자를 입력하시오: "))
        num2 = int(input("두번째 숫자를 입력하시오: "))
        answer(num1,num2)

count=int(input("몇 문제에 도전 하시겠습니까? "))
plusquiz(count)