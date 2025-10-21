def solution(quiz):
    answer = []
    for i in quiz:
        x_str, op, y_str, eq, z_str = i.split(' ')
        if op == '+':
            if int(x_str) + int(y_str) == int(z_str):
                answer.append('O')
            else:
                answer.append('X')
        elif op == '-':
            if int(x_str) - int(y_str) == int(z_str):
                answer.append('O')
            else:
                answer.append('X')
            
            
    return answer