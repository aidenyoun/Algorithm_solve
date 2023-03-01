def solution(hp):
    answer = 0
    a = 5
    b = 3
    c = 1
    
    answer = hp // a
    a1 = hp - (answer*5)
    answer1 = a1 // b
    b1 = a1 - (answer1 * 3)
    answer2 = b1 // c
    
    answer3 = answer + answer1 + answer2
    return answer3