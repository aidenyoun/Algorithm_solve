def solution(n):
    answer = []
    temp = ''
    for i in str(n):
        answer.append(i)
    answer.sort(reverse = True)
    
    for i in answer:
        temp += str(i)
    return int(temp)