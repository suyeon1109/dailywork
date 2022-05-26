inkey = input("찾으려는 키: ")
dic = {'boy':'소년' , 'school': '학교' , 'book':'책'}

if inkey=='boy' or inkey == 'school' or inkey=='book':
    print("사전에 있는 단어입니다.")
    print("값:", dic[inkey])
else:
    print("이 단어는 사전에 없습니다.")
