def line(count):
    for x in range(count):
        print('-', end='')
    print()

num = int(input("선의 길이 입력: "))
line(num)