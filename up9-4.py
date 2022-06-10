buf = []
string = input("문자열 입력: ")

n = len(string)
for i in range(n):
    buf.append(string[n-i-1])

for s in buf:
    print(s, end='')

print()