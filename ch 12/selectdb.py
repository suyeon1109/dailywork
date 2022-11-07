import sqlite3

con = sqlite3.connect('addr.db')
cursor = con.cursor()

cursor.execute("SELECT * FROM tblAddr") # * = 모두 다 (원래 필드이름)
table = cursor.fetchall() #테이블 = 리스트 /// fetchone -> 한 줄씩 (한 레코드씩) 읽기
for record in table:
    print("이름 %s, 전화 %s, 주소 %s" %record) # 필드명

cursor.close()
con.close()

#select = 검색