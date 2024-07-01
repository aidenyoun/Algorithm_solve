def solution(arr, queries):
    for i in range(0, len(queries)):
        a = queries[i][0]
        b = queries[i][1]
        temp = arr[b]
        arr[b] = arr[a]
        arr[a] = temp
        
    return arr
