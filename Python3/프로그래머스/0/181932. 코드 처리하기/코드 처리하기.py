def solution(code):
    answer = ''
    idx = 0
    mode = 0
    for i in code:
        if mode == 0:
            if i != str(1):
                if idx % 2 == 0:
                    answer += i
                    idx += 1
                else:
                    idx += 1
            elif i == str(1):
                mode = 1
                idx += 1
                    
        elif mode == 1:
            if i != str(1):
                if idx % 2 > 0:
                    answer += i
                    idx += 1
                else:
                    idx += 1
            elif i == str(1):
                mode = 0
                idx += 1
                
    if answer == '':
        answer = "EMPTY"
            
            
    return answer