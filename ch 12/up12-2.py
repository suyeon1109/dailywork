f1 = open("plaintext.txt", "w")

f1.write("abcdefg jhiklmn opqrstu vwxyz")
f1.close()


f2 = open("plaintext.txt", "r")
text = f2.read() 
f2.close()

f3 = open("plaintext.txt", "w")

for i in range(len(text)):
    if text[i]>="a" and text[i]<"x":
        f3.write(chr(ord(text[i])+3))
    elif text[i]>="x" and text[i]<="z":
        f3.write(chr(ord(text[i])-23))
    else:
        f3.write(" ")

f3.close()



"""
try:
    f3.write(chr(ord(text[i])+3))
except:
    if text[i]>="x" and text[i]<="z":
        f3.write(chr(ord(text[i])-23))
    else:
        f3.write(" ")
"""

"""
n=3
try:
    f3.write(chr(ord(text[i])+n))
except:
    if text[i] in ["x", "y", "z"]:
        n = 23
        f3.write(chr(ord(text[i])-n))
    else:
        f3.write(" ")
"""

"""
for i in range(len(text)):
    if text[i]>="a" and text[i]<"x":
        n = 3
    elif text[i]>="x" and text[i]<="z":
        n = -23
    else:
        f3.write(" ")
    f3.write(chr(ord(text[i])+n))
f3.close()
"""