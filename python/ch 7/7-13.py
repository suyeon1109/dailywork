def myabs(x):
    if x >=0:
        absolv = x
    else:
        absolv = -x
    return absolv

print("절대값을 구해줍니다! \n")
while True:
    a = int(input("정수입력(종료:0): "))
    if a==0:
        break
    else:
        print("절대값 =", myabs(a))