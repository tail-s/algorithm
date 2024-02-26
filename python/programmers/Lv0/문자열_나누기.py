def solution(s):
    answer = 0
    xcnt = 0
    ycnt = 0
    for i in s:
        if (xcnt == ycnt):
            answer += 1
            last = i
        if (last == i):
            xcnt += 1
        else:
            ycnt += 1

    return answer