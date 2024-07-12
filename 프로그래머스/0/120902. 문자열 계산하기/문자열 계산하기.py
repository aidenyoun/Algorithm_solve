def solution(my_string):
    tmp = list(my_string.split())
    tmp1 = 0
    for i in range(0, len(tmp)):
        if i == 0:
            tmp1 += int(tmp[i])
        elif tmp[i] == "+":
            tmp1 += int(tmp[i+1])
        elif tmp[i] == "-":
            tmp1 -= int(tmp[i+1])
    return tmp1

            
            
            