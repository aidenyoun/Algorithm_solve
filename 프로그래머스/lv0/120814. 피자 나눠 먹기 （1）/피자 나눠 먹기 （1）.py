def solution(n):
    pizza = 1
    
    if n > 7:
        if n % 7 == 0:
            pizza += (n // 7) - 1
        else:
            pizza += (n // 7)
        
    return pizza