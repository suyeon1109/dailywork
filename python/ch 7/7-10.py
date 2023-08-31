def mtable(dan):
    print(dan , "단")
    for i in range(1,10):
        print(dan,'*', i, '=', dan*i)


dan = int(input("원하는 단: "))
mtable(dan)