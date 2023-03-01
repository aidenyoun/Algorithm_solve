def solution(array):
    a = len(array)
    array.sort()
    answer = array[a//2]
    return answer