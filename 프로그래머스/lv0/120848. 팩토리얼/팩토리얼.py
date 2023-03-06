def solution(n):
    answer = 1
    a = 1
    for i in range(1, 11):
        if a <= n:
            if a * i > n:
                break
            else:
                a *= i
                answer = i
        elif a > n:
            break
        
    return answer