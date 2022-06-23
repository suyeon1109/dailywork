class FourCal:
    def setdata(self, first, second):
        self.first = first
        self.second = second

a = FourCal()
b = FourCal()

a.setdata(6,2)
print(a.first)

b.setdata(3,7)
print(b.first)

print(a.first)