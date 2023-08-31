import sqlite3

con = sqlite3.connect('addr.db')
cursor = con.cursor()

cursor.execute("DROP TABLE IF EXISTS tblAddr")
cursor.execute("""CREATE TABLE tblAddr
    (count CHAR(4) PRIMARY KEY, name CHAR(16), age TEXT, num CHAR(14))""")
con.commit()

cursor.close()
con.close()