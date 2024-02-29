def solution(chicken):
    answer = 0
    while (chicken >= 10):
        tmp = 0
        tmp = chicken // 10  # 서비스 주문 가능 횟수!
        # chicken -= tmp * 10 # 서비스 주문 했으니 쿠폰을 빼줘!
        chicken %= 10
        chicken += tmp  # 하지만 그 서비스조차 쿠폰을 주지!
        answer += tmp  # 서비스 시킨만큼 정답에 더해줘!

    return answer