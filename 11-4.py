# num1 = input("첫 번째 수를 입력하시오: ")
# num2 = input("두 번째 수를 입력하시오: ")

while True:
    try:
        num1 = int(input("첫 번째 수를 입력하시오: "))
        num2 = int(input("두 번째 수를 입력하시오: "))
        print("결과:", num1/num2)
    except ZeroDivisionError:
        print("0으로 나눌 수 없습니다.")
        continue

    finally:
        print()
    break