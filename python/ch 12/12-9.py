#9,10
import sqlite3
con = sqlite3.connect('addr.db')

cursor = con.cursor()

#cursor.execute("SELECT * FROM user ORDER BY NAME DESC")
cursor.execute("SELECT * FROM user ORDER BY PHONE DESC")
table = cursor.fetchall()
for record in table:
    print("이름 %s, 전화: %s, 주소: %s" % record)


cursor.close()
con.close()
