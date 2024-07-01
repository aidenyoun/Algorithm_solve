def solution(numlog):
    temp = 0
    result = ''
    for i in range(0, len(numlog)-1):
        if numlog[i] + 1 == numlog[i+1]:
            result += 'w'
        elif numlog[i] - 1 == numlog[i+1]:
            result += 's'
        elif numlog[i] + 10 == numlog[i+1]:
            result += 'd'
        elif numlog[i] - 10 == numlog[i+1]:
            result += 'a'
        
    return result