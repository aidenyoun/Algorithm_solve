def solution(n, k):
    answer = 0
    if n >= 10:
        k -= 1*(n//10)
    answer = (n * 12000) + (k * 2000)
    return answer