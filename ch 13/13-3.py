#import sys
class Calculator:
    #def __init__(self):
    #    self.value = 0

    def add(self,val):
        self.value += val

# class UpgradeCalculator(Calculator):
#     def minus(self, val):
#         self.value -= val

#     def printvalue(self):
#         print("value =",self.value)


cal = Calculator()
cal.add(10)
cal.minus(7)
cal.printvalue()
