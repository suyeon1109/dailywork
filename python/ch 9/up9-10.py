large = [0 for n in range(26)]
small = [0 for n in range(26)]
string = input("문자열 입력: ")

for i in range(len(string)):
    for j in range(65,91):
        while True:
            if chr(j)== string[i]:
                large[i] = chr(j)
            else:
                break

print(large)


for i in range(len(string)):
    for j in range(97,123):
        while True:
            if chr(j)== string[i]:
                small[i] = chr(j)
            else:
                break
print(small)

for i in range(len(large)):
    print(chr(i+65)+":", large[i])

for i in range(len(small)):
    print(chr(i+97)+":", small[i])

# print(ord('a'))
# print(ord('z'))



# for i in range(len(string)):
#     if string[i] <= 'Z' and string[i]>="A":
#         count = string.count(string[i])
#         large_2 = []
#         for each in large:
#             large_1 = large[ord[i]-65].replace("0", count)
#             large_2.append(large_1)

#     elif string[i] <= 'z' and string[i] >= "a":
#         counts = string.count(string[i])
#         small_2 = []
#         for small[ord(string[i])-97] in small:
#             small_1 = small[ord[i]-97].replace("0", count)
#             small_2.append(small_1)

# for i in range(len(large_2)):
#     print(chr(i+65)+":", large_2[i])
#     print(chr(i+97)+":", small_2[i])
# 어 내인생 왜이래? 어쩔어쩔어쩔티비~~~~~~~~ 되는게 아~~~~~~~~무것도없어요 난 ㄱ    ㅐ바보똥멍청이야 ㅑ ㅗㅁㅅㄷ ㅡㅛ ㅣㅑㄹㄷ ㄱㄷ미ㅣㅛ 