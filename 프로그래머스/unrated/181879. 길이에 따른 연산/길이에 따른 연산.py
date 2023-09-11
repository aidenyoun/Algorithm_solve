def solution(num_list):
    b = 0
    c = 1
    if len(num_list) >= 11:
        for a in num_list:
            b += a
    else:
        for a in num_list:
            c *= a
            b = c
    return b