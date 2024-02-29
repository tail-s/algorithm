def solution(num, total):
    answer = []

    tmp = sum(range(1, num))
    start = (total - tmp) // num

    for i in range(start, start + num):
        answer.append(i)

    return answer