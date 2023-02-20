def solution(numbers):
    answer = 1
    numbers.sort()
    numbers.reverse()
    answer1 = numbers[0:2]
    
    for i in answer1:
        answer *= i
        
    return answer