#11,12
operation = ['A','a','S','s','M', 'm','D','d']

while True:
    ch = input("더하기(A), 빼기(S), 곱하기(M), 나누기(D) \n원하는 연산 선택: ")
    if ch in operation:
        op=ch
        break
    else:
        print("A,S,M,D 중 하나만 입력하세요.")
        continue

a = int(input("첫 번째 숫자: "))
b = int(input("두 번째 숫자: "))

if op in operation[:2]: print("정답:", a+b)      # operation[] 인덱싱 안하고 in ['A','a'] 로 해도 됨
elif op in operation[2:4]: print("정답:", a-b)
elif op in operation[4:6]: print("정답:", a*b)
elif op in operation[6:]: print("정답:", a/b)