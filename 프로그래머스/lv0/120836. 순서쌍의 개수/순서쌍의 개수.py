def solution(n):
    answer = list(range(1, n+1))
    a = 0
    for i in range(0, len(answer)):
        if n % answer[i] == 0:
            a += 1
            
    return a