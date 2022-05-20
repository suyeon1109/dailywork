def scoreproc(*score):
    valid = 0
    error = 0

    for each in score:
        if each <0 or each>100:
            error+=1
            continue
        else:
            print(each)
            valid+=1


    print("정상처리: ", valid)
    print("오류처리: ", error)
    print("성적 처리 끝")

scoreproc(99,101,86)
scoreproc(92,86, 68, -1, 56)