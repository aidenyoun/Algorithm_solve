def solution(before, after):
    answer = 0
    a = sorted(before)
    a1 = sorted(after)
    if a == a1:
        answer = 1
    return answer