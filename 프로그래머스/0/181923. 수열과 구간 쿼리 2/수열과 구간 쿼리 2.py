def solution(arr, queries):
    result = []
    for i in range(0, len(queries)):
        s = queries[i] [0]
        e = queries[i] [1]
        k = queries[i] [2]
        temp = []
        for j in range(s, e+1):
            if arr[j] > k:
                temp.append(arr[j])
        if temp:
            result.append(min(temp))
        else:
            result.append(-1)
    return result