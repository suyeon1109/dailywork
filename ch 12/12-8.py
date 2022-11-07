"""
테이블 - 전체           
레코드 - 한 라인 줄. 한 건  
필드 - 하나하나           
 테이블 여러개 = 데이터베이스
""" 

f1 = open("insave.txt", "a")

while True:
    text = input("저장할 내용을 입력(종료: $%): ")
    if text =="$%":
        break
    else:
        f1.write(text+"\n")
f1.close()