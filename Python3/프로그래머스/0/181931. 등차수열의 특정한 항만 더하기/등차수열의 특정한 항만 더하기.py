def solution(a, d, included):
    answer = 0
    idx = 0
    
    for i in included:
        if i == True:
            answer += (a + d * idx)
            idx += 1
        elif i == False:
            idx += 1

    return answer