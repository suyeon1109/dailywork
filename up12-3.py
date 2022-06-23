f1 = open("secret.txt", "w")
f1.write("defghij mklnopq rstuvwx yzabc")
f1.close()


f2 = open("secret.txt", "r")
text = f2.read() 
f2.close()

f3 = open("secret.txt", "w")

for i in range(len(text)):
    if text[i]>="d" and text[i]<="z":
        f3.write(chr(ord(text[i])-3))
    elif text[i]>="a" and text[i]<="c":
        f3.write(chr(ord(text[i])+23))
    else:
        f3.write(" ")

f3.close()