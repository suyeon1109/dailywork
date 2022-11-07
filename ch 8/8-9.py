#9
# idnum = input("주민번호: ")
# if idnum[7] == "1" or idnum[7]=="3":
#     gender = "남자"
# else:
#     gender = "여자"
# print(idnum[:2]+"년생", gender)

#10
idnum = input("주민번호: ")
if idnum[7]=="1" or idnum[7]=="2":
    cen = "19"
else:
    cen = "20"

if idnum[7] == "1" or idnum[7]=="3":
    gender = "남자"
else:
    gender = "여자"

print(cen+idnum[:2]+"년생", gender)