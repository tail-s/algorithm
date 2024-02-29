def solution(i, j, k):
    answer = 0
    for target in range(i, j+1):
        answer += str(target).count(str(k))
        # for sep in str(target):
        #    answer += 1 if str(k) in sep else 0
    return answer