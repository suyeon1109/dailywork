string = list(input("문자열 입력: "))

alphabet = dict()

for ch in string:
    if ch.isalpha()==False:
        continue
    if ch not in alphabet:
        alphabet[ch]=1
    else:
        alphabet[ch] += 1

for i in range(len(alphabet)):
    print()

# print(ord("A"))
# print(ord("Z"))