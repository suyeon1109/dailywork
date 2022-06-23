def solution(n):
    ans = list(map(int, str(n)))
    print(ans)
    answer = []
    for i in range(len(ans)-1,-1,-1):
        answer.append(ans[i])
    return answer

print(solution(12345))


# def digit_reverse(n):
#     return list(map(int, reversed(str(n))))