class Calculator:
    def __init__(self):
        self.value = 0
        
    def add(self,val):
        self.value += val

class MaxLimitCalculator(Calculator):
    def add(self,val):
        self.value+=val
        if self.value>100:
            self.value = 100
        else:
            pass
    
    def printvalue(self):
        print(self.value)


cal = MaxLimitCalculator()

cal.add(50)
cal.printvalue()

cal.add(30)
cal.printvalue()

cal.add(60)
cal.printvalue()