inputhp = input("전화번호 입력")
# s = ""
# writehp = s.join(inputhp.split('-'))
writehp = inputhp.replace("-", "")
print("저장된 전회번호:", writehp)