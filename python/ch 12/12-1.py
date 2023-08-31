try:
    f= open("live.txt", "rt")
    while True:
        text = f.read(10)
        if not text:  #if len(text) ==0:
            break
        print(text, end="")
    
except FileNotFoundError:
    print("파일이 없습니다.")
finally:
    f.close()