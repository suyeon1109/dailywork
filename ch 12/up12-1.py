f1 = open("proverbs.txt", "w")

text = ["All's well that ends well.",
"Bad news travels fast",
"Well begun is half done.",
"Birds of a feather flock together."]

for i in range(len(text)):
    f1.write(text[i]+"\n")
f1.close()

f2 = open("proverbs.txt", "w")
for i in range(len(text)):
    f2.write(str(i+1)+": "+text[i]+"\n")
f2.close()