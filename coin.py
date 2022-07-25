
n,k = map(int,input().split())
coin_list=[]
ans=0

for i in range(10):
    a=int(input())
    coin_list.append(a)

list=[]

for coins in coin_list:

    # klist=[]
    # for i in range(len(str(k))):
    #     m=len(str(k))-1
    #     klist.append(int(str(k)[i])*10**m)
    #     m-=1
        
    # for ks in klist:
    #     mn=ks//coins
    #     if mn<10:
    #         ans+=mn
    #         k-=coins*mn
    while k>=0:
        mn=k//coins
        if mn<10 and mn>=1:
            ans+=mn
            k-=coins*mn

            print(k,ans, coins)

print(ans)