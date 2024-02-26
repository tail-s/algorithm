def solution(my_string):
    answer = 0
    # list = my_string.split()
    # answer += int(list[0])
    # for i in range(1, len(list), 2):
    #     answer += int(list[i + 1]) if list[i] == "+" else -int(list[i + 1])
    answer = eval(my_string)
    return answer