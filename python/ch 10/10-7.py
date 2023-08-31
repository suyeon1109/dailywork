#7,8

import random
num = random.randint(1,101)
count = 0
while True:
    response = int(input("숫자를 입력하세요(끝낼때 0): "))
    
    #count+=1
    if response == num:
        print(str(count+1)+"번만에 맞췄습니다")
        break
    elif response>num:
        print("입력한 숫자보다 더 작습니다.")
    elif response<num:
        print("입력한 숫자보다 더 큽니다.")
    count+=1