count = 0

while True:
    print("###친구 연락처 관리###\n1.연락처 출력\n2.연락처 등록\n3.연락처 삭제\n4.끝내기")
    menu = int(input("메뉴 번호를 입력하세요 => "))

    if menu == 4:
        break
    elif menu==2:
        f1 = open("addressbook.txt", 'a')
        name = input("이름을 입력하세요 => ")
        age = input("나이를 입력하세요 => ")
        num = input("전화번호를 입력하세요 => ")
        f1.write(str(count+1)+": "+name+"\t"+age+"\t"+num+"\n")
        count+=1
        f1.close()
    elif menu==1:

        f1 = open("addressbook.txt", 'r')
        rd = f1.read()
        print(rd)
        f1.close()
    else:
        f1 = open("addressbook.txt", 'r')
        lines = f1.readlines()
        f1.close()
        f2 = open("addressbook.txt", 'w')
        delete = int(input("삭제할 행 번호는? "))
        for i in range(len(lines)):
            if lines[i]!=lines[delete-1]:
                f2.write(lines[i])

                #print(lines[i])
        f2.close()


        # for line in lines:
        #     if line.find(delete):
        #         f1.write(lines-line)
        #삭제를 어떻게 할지 모르겠음.
