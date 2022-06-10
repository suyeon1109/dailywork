str = "89점"

try:
    # score = int(str)
    # print(score)
    a = str[5]
except ValueError as e:
    print("invalid literal for int() with base 10: '%s'" %str)
except IndexError as e:
    print("string index out of range")
print("작업완료")