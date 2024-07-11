def solution(arr1, arr2):
    answer = 0
    if len(arr1) == len(arr2):
        sum1 = sum(arr1)
        sum2 = sum(arr2)
        if sum1 > sum2:
            answer += 1
        elif sum2 > sum1:
            answer -= 1
        else:
            pass
    elif len(arr1) > len(arr2):
        answer += 1
    else:
        answer -= 1
            
    return answer