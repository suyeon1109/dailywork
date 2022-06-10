#2,3
string = input("문자열 입력: ")
letter = input("제외할 문자: ")
for i in range(len(string)):
    if string[i].lower() == letter.lower():
        print(string[0:i]+string[i+1:])