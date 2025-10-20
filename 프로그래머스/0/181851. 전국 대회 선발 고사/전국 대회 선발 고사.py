def solution(rank, attendance):
    answer = 0
    tmp = []
    for number, attend in enumerate(attendance):
        if attend is True:
            student_rank = rank[number]
            tmp.append([student_rank, number])
            
    tmp.sort()
    
    a = tmp[0][1]
    b = tmp[1][1]
    c = tmp[2][1]

    return a * 10000 + b * 100 + c