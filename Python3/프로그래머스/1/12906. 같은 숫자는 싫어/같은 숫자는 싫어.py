def solution(arr):
    answer = []
    temp = ''
    for i in arr:
        if temp != i:
            answer.append(i)
        temp = i
    return answer