def char_prn(ch,count):
    for i in range(count):
        print(str(ch), end='')
    print()

ch = input("문자: ")
count = int(input("숫자: "))
char_prn(ch,count)