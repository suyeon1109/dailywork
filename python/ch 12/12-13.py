import sqlite3
con = sqlite3.connect('addr.db')
cursor = con.cursor()
cursor.execute("SELECT * FROM user ORDER BY PHONE ASC")

read = cursor.fetchmany(size = 2)
for each in read:
    print("이름: %s, 전화: %s, 주소: %s" % each)
