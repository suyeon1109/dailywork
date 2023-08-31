oklist=['yes','y','ok','예','당근']
ans = input("결제하시겠습니까?")

for i in range(len(oklist)):
    if ans == oklist[i]:
        print("구입해주셔서 감사합니다.")
    else:
        print("안녕히가세요.")
        break