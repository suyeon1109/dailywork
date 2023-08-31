#5
f1 = open("test.txt", "w")
f1.write("Life is too short!")
f1.close()

f2 = open("test.txt", 'r')
rows = f2.readlines()
for row in rows:
    print(row,end="")
f2.close()

#6
path = r"/Users/mac/Documents/GitHub/test.txt"

with open(path, "r", encoding='utf-8') as f:
    row = f.readline()
    print(row)