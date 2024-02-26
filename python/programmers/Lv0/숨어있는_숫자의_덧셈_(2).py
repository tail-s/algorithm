import re

def solution(my_string):
    answer = 0
    #     for i in my_string:
    #         if i.isalpha():
    #             my_string = my_string.replace(i, " ")
    #     my_string = my_string.split()

    #     answer = sum(list(map(int, my_string)))

    # 정규식 학습하기
    num = re.findall(r'\d+', my_string)
    num = list(map(int, num))
    answer = sum(num)

    return answer