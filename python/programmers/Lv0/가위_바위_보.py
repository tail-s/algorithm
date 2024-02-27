def solution(rsp):
    answer = ''
    d = {'2':'0', '0':'5', '5':'2'}
    for i in rsp:
        answer += d[i]
    return answer