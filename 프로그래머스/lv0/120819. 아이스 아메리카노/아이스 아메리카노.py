def solution(money):
    answer = []
    a = money // 5500
    answer.append(a)
    answer.append(money - 5500*a)
    return answer