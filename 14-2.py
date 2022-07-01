import sqlite3

while True:
    print("###친구 연락처 관리###\n1.연락처 출력\n2.연락처 등록\n3.연락처 삭제\n4.끝내기")
    menu = int(input("메뉴 번호를 입력하세요 => "))

    if menu == 4:
        break
    elif menu==2:
        con = sqlite3.connect('addr.db')
        cursor = con.cursor()
        count = input("번호: ")
        name = input("이름을 입력하세요 => ")
        age = input("나이를 입력하세요 => ")
        num = input("전화번호를 입력하세요 => ")
        pr = "INSERT INTO tblAddr VALUES ('"+str(count)+"','"+str(name)+"','"+str(age)+"','"+str(num)+"')"
        cursor.execute(pr)
    elif menu==1:
        con = sqlite3.connect('addr.db')
        cursor = con.cursor()
        cursor.execute("SELECT * FROM tblAddr")
        table = cursor.fetchall()
        #print(table)
        for i in range(1,len(table)):
            print("%s:  %s\t%s\t%s"% table[i])
    else:
        con = sqlite3.connect('addr.db')
        cursor = con.cursor()
        delete = int(input("삭제할 행 번호는? "))
        d = "DELETE FROM tblAddr WHERE count = "+str(delete)
        cursor.execute(d)

    con.commit()

    cursor.close()
    con.close()

# cursor.execute("INSERT INTO tblAddr VALUES (str(count+1),': ',name, age, num)")
