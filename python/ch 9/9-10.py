from turtle import update


dic = {'boy':'소년' , 'school': '학교' , 'book':'책'}
dic2 = {'student':'학생' , 'teacher': '선생님' , 'book':'서적'}

# dic3 = dic | dic2
# print(dic3)

dic.update(dic2)
print(dic)