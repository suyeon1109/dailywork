while True:
    num1 = input("첫번째 숫자를 입력하시오: ")
    if num1.isdecimal():
        break
    else:
        print("숫자만 입력하세요: ")

while True:
    num2 = input("두번째 숫자를 입력하시오: ")
    if num2.isdecimal():
        break
    else:
        print("숫자만 입력하세요: ")

while True:
    print(num1,'+',num2,'= ? ')
    ans = int(input("정답을 입력하시오: "))

    if ans == int(num1)+int(num2):
        print("참 잘했어요")
        break
    else:
        print("틀렸어요")
        