import sqlite3

con = sqlite3.connect('addr.db')
cursor = con.cursor()

cursor.execute("SELECT * FROM user ORDER BY NAME ASC")
record = cursor.fetchone()
print("한주완은 %s에 살고 있습니다." % record)

cursor.close()
con.close()
