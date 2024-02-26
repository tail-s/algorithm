def solution(babbling):
    answer = 0
    list = ["aya", "ye", "woo", "ma"]
    for word in babbling:
        for target in list:
            word = word.replace(target, "x")
        word = word.replace("x", "")
        answer += 1 if len(word) == 0 else 0

    return answer