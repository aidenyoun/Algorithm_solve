def solution(n, t):
    answer = n
    a = 0
    while(True):
        answer *= 2
        a += 1
        if a == t:
            break
    return answer