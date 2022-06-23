# balance = 8000

# def deposit(money):
#     global balance
#     balance+=money

# def inquire():
#     print("잔액은 %d원입니다." % balance)

# deposit(1000)
# inquire()



class Account:
    def __init__(self,balance):
        self.balance = balance

    def deposit(self,money):
        self.balance+=money
        # return self.balance

    def inquire(self):
        print("잔액은 %d원입니다." % self.balance)



sinhan = Account(8000)
sinhan.deposit(1000)
sinhan.inquire()

nonghyup = Account(12000000)
nonghyup.inquire()