def solution(picture, k):
    answer = []
    for row_string in picture:
        
        widened_row = ''.join([char * k for char in row_string])
        
        for _ in range(k):
            answer.append(widened_row)
            
    return answer