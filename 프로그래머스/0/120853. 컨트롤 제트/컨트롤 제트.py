def solution(s):
    tmp = list(s.split())
    tmp1 = 0
    for i in range(0, len(tmp)):
        if tmp[i] == "Z":
            tmp1 -= int(tmp[i-1])
        else:
            tmp1 += int(tmp[i])
    return tmp1
    