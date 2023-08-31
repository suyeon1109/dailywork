chk = 1
string = input("문자열 입력: ")

for i in range(len(string)):
    if len(string) == 1:
        chk=1
    elif string[i] == string[-(i+1)]:
        chk = 1
    else:
        chk = 2


if chk==1:
    print("회문")
else:
    print("회문아님")