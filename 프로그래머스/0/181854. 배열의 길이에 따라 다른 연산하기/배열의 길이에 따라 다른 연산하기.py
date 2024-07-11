def solution(arr, n):
    answer = []
    if len(arr) % 2 == 0:
        for i in range(1, len(arr)):
            if i % 2 > 0:
                arr[i] += n
    else:
        arr[0] += n
        for i in range(1, len(arr)):
            if i % 2 == 0:
                arr[i] += n
    return arr