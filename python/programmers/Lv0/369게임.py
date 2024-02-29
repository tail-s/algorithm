import re

def solution(order):
    answer = 0
    answer += len(re.findall("[369]", str(order)))
    return answer