string = list(input("문자열 입력: "))

alphabet = dict()

for ch in "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ":
    alphabet[ch]=0

for ch in string:
    if ch not in alphabet:
        alphabet[ch]=1
    else:
        alphabet[ch] += 1

k_list = []

for key in alphabet.keys():
    k_list.append((key))

k_list.sort()

count=1

for key in k_list:
    if count%6==0 or key=="Z":
            print(str(key)+":", alphabet[key])
            count=1
    else:
        print(str(key)+":", alphabet[key], end="\t")
    count+=1




# get(값,0)

"""
for
"""