def solution(strArr):
    answer = []
    for i in range(len(strArr)):
        if i == 0:
            answer.append(strArr[0].lower())
        elif i % 2 == 0:
            answer.append(strArr[i].lower())
        else:
            answer.append(strArr[i].upper())
    return answer