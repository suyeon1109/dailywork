# ()안에 들어가는거 = argument, parameter

def sub(num, lang):
    # if lang=="kor":
    #     print("제곱은 :",num**2)
    # elif lang=="eng":
    #     print("square :",num**2)
    print(lang, num**2)


intnum = 10
sub(5,"제곱은:")
sub(intnum,"square:")