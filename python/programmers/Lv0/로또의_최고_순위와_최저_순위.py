def solution(lottos, win_nums):
    answer = []
    match = 0
    zero = 0
    for i in lottos:
        if (i == 0):
            zero += 1
            continue
        for j in win_nums:
            if (i in win_nums):
                match += 1
                break
    best = 7 - match - zero if (match + zero != 0) else 6
    worst = 7 - match if (match != 0) else 6
    answer.append(best)
    answer.append(worst)
    return answer