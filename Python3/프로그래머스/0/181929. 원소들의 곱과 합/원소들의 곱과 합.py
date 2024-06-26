def solution(num_list):
    answer = 0
    tmp = 1
    tmp1 = 0
    
    for i in num_list:
        tmp *= i
        
    for i in num_list:
        tmp1 += i
    tmp1 = pow(tmp1, 2)
        
    if tmp < tmp1:
        answer = 1
        
    return answer