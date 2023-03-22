def solution(my_string):
    answer = 0
    temp = ''
    num = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
    for i in my_string:
        if i in num:
            temp += i
        else:
            if temp != '':
                a = int(temp)
                answer += a
                temp = ''
            elif temp == '':
                continue
    if temp != '':
        a = int(temp)
        answer += a

    return answer