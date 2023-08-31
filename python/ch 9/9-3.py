score = [[88,76,92,98], [65,70,58,82], [82,80,78,88]]

for each in score:
    sum=0
    for i in range(len(each)):
        sum+=each[i]
    print("총점 %5.2f, 평균 %5.2f" % (sum, sum/len(each)))  #%.2f 도 ㄱㄴ

print("전체평균 ", )

#%f 에서 소수점 두자리만 남기는 방법?? #써도 안됬음