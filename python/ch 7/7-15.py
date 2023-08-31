def toupper(char):
    char = chr(ord(char)-32)
    return char

def tolower(char):
    char = chr(ord(char)+32)
    return char


while True:
    char = input("문자입력(quit: 종료): ")
    if char=="quit":
        break
    elif char>='a' and char<='z':
        print(char+"의 대문자:",toupper(char))
    elif char >='A' and char<="Z":
        print(char+"의 소문자:",tolower(char))
    else:
        print("잘못된 값을 입력하셨습니다.")

# print(ord("a"))
# print(ord("z"))
# print(ord("A"))
# print(ord("Z"))