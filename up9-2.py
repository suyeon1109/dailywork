string = input("문자열 입력: ")
letter = input("제외할 문자: ")
for i in range(len(string)):
    if string[i] == letter:
        print(string[0:i-1])