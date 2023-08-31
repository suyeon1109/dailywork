class FourCal:
    def setdata(self,first,second):
        self.first = first
        self.second = second

    def add(self):
        result1 = self.first+self.second
        return result1

    def sub(self):
        result2 = abs(self.first - self.second)
        return result2

    def mul(self):
        result3 = self.first * self.second
        return result3

    def div(self):
        result4 = self.first / self.second
        return result4

a = FourCal()
b = FourCal()
a.setdata(6,2)
b.setdata(3,8)

# print(a)
# print(b)

print("object a:", a.first ,'+', a.second , '=', a.add())
print("object a:", a.first ,'-', a.second , '=', a.sub())
print("object a:", a.first ,'*', a.second , '=', a.mul())
print("object a:", a.first ,'/', a.second , '=', a.div())


print("object b:", b.first ,'+', b.second , '=', b.add())
print("object b:", b.first ,'-', b.second , '=', b.sub())
print("object b:", b.first ,'*', b.second , '=', b.mul())
print("object b:", b.first ,'/', b.second , '=', b.div())