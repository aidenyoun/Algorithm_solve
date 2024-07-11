def solution(arr, del_l):
    for i in range(0, len(del_l)):
        while(del_l[i] in arr):
            arr.remove(del_l[i])
            
    return arr