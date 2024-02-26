# input() : 한 줄의 문자열을 입력
# map() : 리스트의 모든 원소에 각각 특정한 함수를 적용할 때 사용
#
# 공백을 기준으로 구분된 데이터를 입력 받을 때
# data = list(map(int, input().split()))
# 공백을 기준으로 구분된 데이터가 많지 않다면
# a, b, c = map(int, input().split())
#
# 파일 입출력
# sys.stdin = open("input.txt", "r")


# 더 빠르게 입력 받기
# sys.stdin.readline()사용
# 단, 입력 후 엔터가 사용되므로 rstrip()을 함께 사용
#
# import sys
# 공백으로 구분된 2개 숫자 입력받기
# N, M = map(int, sys.stdin.readline().split())
# 2차원 리스트 입력 받기
# board = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]
# 문자열 입력 받기
# data = sys.stdin.readline().rstrip()


# f-string (python 3.6 이상 가능)
# 문자열 앞에 젚두사 f를 붙여서 사용, 중괄호 안에 변수명을 기입하여 간단히 문자열과 정수를 함께 넣을 수 있음
# answer = 5
# print(f"정답은 {answer} 입니다.")
#
# 리스트 출력시 대괄호 제거하기 : * 사용
# 백준을 풀다보면 리스트에 담긴 값을 출력해야 하는 경우가 있는데, 파이썬에서 단순히 리스트를 출력하면 대괄호와 함께 출력이 된다.
# 따라서 아래와 같은 방법을 사용한다.
# result = [1, 2, 3]
#
# 기본적인리스트 출력 시
# print(result)
# [1, 2, 3]
#
# for loop로 원소를 하나씩 출력
# for i in range(len(result)):
#     print(result[i], end=" ")
# 1 2 3
#
# 리스트의 원소를 언패킹 시켜서 출력
# print(*result)
# 1 2 3


# N * M 크기의 2차원 리스트 초기화 및 입력받기
# 시뮬레이션 문제에서 주어지는 입력 중 가장 많은 형태의 입력을 list comprehension으로 받을 수 있다.
# N * M 리스트 초기화 ex) 해당 좌표에 방문 체크하는 배열
# visited = [[False]*m for _ in range(n)]
#
# 입력
# 5 9
# 0 0 0 0 0 0 0 0 0
# 0 0 0 0 0 0 0 0 0
# 0 0 0 0 0 0 0 0 0
# 0 0 0 0 0 0 0 0 0
# 0 0 0 0 0 0 0 0 0
#
# n, m = map(int, input().split())
# board = [list(map(int, input().split())) for _ in range(n)]