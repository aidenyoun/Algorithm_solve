def solution(n_str):
    answer = ''
    temp = 0
    for i in n_str:
        if i == '0':
            temp += 1
            pass
        else:
            answer = n_str[temp:]
            break
    
    return answer