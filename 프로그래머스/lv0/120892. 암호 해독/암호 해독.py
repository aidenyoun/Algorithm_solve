def solution(cipher, code):
    answer = ''
    a = len(cipher) // code
    for i in range(1, a+1):
        answer += cipher[code*i-1]
        
    return answer