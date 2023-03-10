def solution(i, j, k):      # 1 , 13 ,1 -> 6
    answer = 0

    for a in range(i, j+1):
        b = str(a)
        for c in range(0, len(b)):
            if b[c] == str(k):
                answer += 1

    return answer