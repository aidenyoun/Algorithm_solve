def solution(n):
    factors = []
    i = 2
    while i * i <= n:
        if n % i == 0:
            if i not in factors:
                factors.append(i)
            while n % i == 0:
                n //= i
        i += 1
    if n > 1 and n not in factors:
        factors.append(n)
    return factors