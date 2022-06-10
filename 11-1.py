while True:
    str = input("점수를 입력하세요: ")
    try:
        score = int(str)
        print("입력한 점수:", score)
        print("작업완료")
        break
    except:
        print("정수로 입력하세요!")