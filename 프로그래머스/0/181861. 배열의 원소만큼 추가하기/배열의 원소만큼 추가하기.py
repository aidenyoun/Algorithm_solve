def solution(arr):
    answer = []
    for i in range(len(arr)):
        tmp = arr[i]
        for k in range(0, tmp):
            answer.append(tmp)
    return answer