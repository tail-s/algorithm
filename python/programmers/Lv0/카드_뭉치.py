def solution(cards1, cards2, goal):
    answer = 'Yes'
    # for i in goal:
    #     if cards1 and cards1[0] == i:
    #         del cards1[0]
    #     elif cards2 and cards2[0] == i:
    #         del cards2[0]
    #     else:
    #         return "No"

    index1 = 0
    index2 = 0

    for i in goal:
        if index1 < len(cards1) and cards1[index1] == i:
            index1 += 1
        elif index2 < len(cards2) and cards2[index2] == i:
            index2 += 1
        else:
            return "No"

    return answer