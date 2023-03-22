def solution(s):
    answer = True

    s1 = s.lower()
    p = 0
    y = 0

    for i in s1:
        if i == 'p':
            p += 1
        elif i == 'y':
            y += 1

    if p == y:
        return True
    elif p != y:
        return False