def getmax(*nums):
    max = nums[0]
    for each in nums:
        if each > max:
            max = each
    return max

print("MAX =", getmax(8,9,0,6,2))
print("큰수는", getmax(19,21,7))