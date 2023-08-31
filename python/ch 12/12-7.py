f2 = open("test2.txt", 'r')
rows = f2.readlines()
lines = ""
for row in rows:
    lines += row
lines = lines.replace("java", "python")
print(lines)
f2.close()