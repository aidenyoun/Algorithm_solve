def solution(num, k):
    answer = 1
    
    for i in str(num):
        if i != str(k):
            answer += 1
        elif i == str(k):
            break
            
    if answer == len(str(num))+1:
        answer = -1
        
    return answer