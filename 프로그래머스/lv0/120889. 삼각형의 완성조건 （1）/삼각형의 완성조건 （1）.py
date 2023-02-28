def solution(sides):
    answer = 0
    a = max(sides)
    sides.remove(a)
    if sides[0] + sides[1] > a:
        answer += 1
    else:
        answer += 2
    return answer