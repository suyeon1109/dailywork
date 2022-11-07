import sqlite3
con = sqlite3.connect('addr.db')
cursor = con.cursor()
cursor.execute("SELECT * FROM user ORDER BY NAME DESC")

read = cursor.fetchmany(size = 2)
for each in read:
    print("이름: %s, 전화: %s, 주소: %s" % each)


"""
이름 한주완, 전화: 444-1092, 주소: 대전
이름 한경은, 전화: 555-1004, 주소: 수원

라고 나오는데 뭐가 문제인걸까요 (서로 주소만 바뀌어서 찍힘)
"""
