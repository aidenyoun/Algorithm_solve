def solution(emergency):
    tmp = emergency[:]
    emergency.sort(reverse = True)
    answer = []
    for i in tmp: # 3 76 24
        a = emergency.index(i)+1 # 76 24 3
        answer.append(a)
    return answer