import random

while True:
    com = [random.randint(1,9), random.randint(0,9), random.randint(0,9)]
    while com[1]==com[2] or com[0]==com[1] or com[0]==com[2]:
        com = [random.randint(1,9), random.randint(0,9), random.randint(0,9)]

    print(com)

    count = 1
    while True:
        print(str(count)+"회 도전입니다")
        u = list(input("3자리 숫자를 입력하세요(첫자리 0제외): "))
        while len(u)>=4 or len(u)<3:
            u = list(input("3자리 숫자를 다시 입력하세요(첫자리 0제외): "))

        user = [int (i) for i in u]

        if com==user:
            print("빙고 맞췄습니다!\n"+str(count)+"회에 맞추셨군요!")
            break

        elif count>=9:
            print("9회 이내에 못맞췄으니 다음 기회에..")
            break


        count1 = 0
        count2 = 0

        for i in range(len(com)):
            for j in range(len(user)):
                if com[i]==user[j]:
                    if i==j:
                        count1+=1
                    else:
                        count2+=1

        print("입력하신", str(user[0])+str(user[1])+str(user[2])+"은(는)", str(count1)+"스트라익", str(count2)+"볼 입니다.")

        count+=1


    ans = input("계속 하시려면 아무 키나 종료는 q를 입력하세요. ")
    if ans == "q":
        break


    
    """
        if com==user:
        print("빙고 맞췄습니다!\n"+str(count)+"회에 맞추셨군요!")
        ans = input("계속 하시려면 아무 키나 종료는 q를 입력하세요. ")
        if ans == "q":
            break
        else:
            count=1
        elif count>=9:
            ans = input("계속 하시려면 아무 키나 종료는 q를 입력하세요. ")
            if ans == "q":
                break
            else:
                count=1
    """