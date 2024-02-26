def solution(babbling):
    answer = 0
    list = ["aya", "ye", "woo", "ma"]
    for word in babbling:
        for i in list:
            if i*2 not in word:
                word = word.replace(i, "x")
        word = word.replace("x", "")
        answer += 1 if len(word) == 0 else 0
    return answer