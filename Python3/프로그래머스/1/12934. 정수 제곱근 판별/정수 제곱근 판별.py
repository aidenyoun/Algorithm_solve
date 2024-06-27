def solution(n):
    answer = 0
    sqrt = pow(n, 1/2)
    if sqrt % 1 == 0:
        answer = pow((sqrt+1), 2)
    else:
        answer = -1
        
    return answer