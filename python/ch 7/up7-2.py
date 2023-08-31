def printrev(*nums):
    for i in range(len(nums)-1,-1,-1):
        print(nums[i], end=" ")
    print("")

printrev(10,20,30,40,50)
printrev(11,12,13,14,15,16,17,18,19,20)