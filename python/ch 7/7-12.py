def printsum(*nums):
    sum = 0
    for i in range(len(nums)):
        sum+=nums[i]
    print("합계=", sum)






printsum(1,2,3)
printsum(5,7,9,11,13)
printsum(8,9,6,2,9,7,5,8)