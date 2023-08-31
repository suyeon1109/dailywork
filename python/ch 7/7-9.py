def mypow(d,n):
    product = 1
    for i in range(n):
        product *= d
    return product


print("LA=",mypow(3,4))