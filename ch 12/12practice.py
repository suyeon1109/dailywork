f = open("live.txt", "wt")
f.write("""삶이 그대를 속일지라도
슬퍼하거나 노하지 말라!
우울한 날들을 견디면
믿으라, 기쁨의 날이 오리니""")
f.close()

try:
    f = open("live.txt", "rt")
    text = f.read()
    print(text)
except FileNotFoundError:
    print("파일이 없습니다.")
finally: #무조건 실행 에러가 나든 안나든
    f.close()