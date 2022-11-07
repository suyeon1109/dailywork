class Human:
    def __init__(self, age, name):
        self.age = age
        self.name = name
    
    def intro(self):
        print(str(self.age)+"살", self.name+"입니다.")

class Student(Human):
    def __init__(self, age, name, stunum):
        super().__init__(age,name)
        self.stunum = stunum

    def intro(self):
        super().intro()
        print("학번 :", str(self.stunum)+"입니다")

    def study(self):
        print("하늘천 따지 검을현 누를황")

kim = Human(29,"김우치")
kim.intro()

lee = Student(45,"이길동", 930011)
lee.intro()
lee.study()
