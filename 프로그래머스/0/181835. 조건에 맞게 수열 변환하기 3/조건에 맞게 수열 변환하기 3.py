def solution(arr, k):
    answer = []
    
    if (k % 2 == 1):
        return [i * k for i in arr]
    elif (k % 2 == 0):
        return [i + k for i in arr]
    
    return arr