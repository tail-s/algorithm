def solution(quiz):
    answer = []
    for target in quiz:
        list = target.split("=")
        answer.append("O" if eval(list[0]) == int(list[1]) else "X")
    return answer