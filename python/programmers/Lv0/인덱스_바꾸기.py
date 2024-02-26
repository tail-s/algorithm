def solution(my_string, num1, num2):
    answer = ''
    arr = list(my_string)
    arr[num1], arr[num2] = arr[num2], arr[num1]
    return answer.join(arr)