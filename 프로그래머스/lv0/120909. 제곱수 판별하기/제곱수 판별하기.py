def solution(n):
    answer = 0
    for i in range(1,10000):
        if int(i)*int(i) == n:
            answer = 1
            break
        else:
            answer = 2
    return answer