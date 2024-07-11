def solution(numbers):
    answer = []
    tmp = []
    for i in range(0, len(numbers)):
        for j in range(1, len(numbers)):
            if i == j:
                pass
            else:
                answer.append(numbers[i]+numbers[j])
    tmp = list(set(answer))
    tmp.sort()  
    return tmp