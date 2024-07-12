def solution(numbers):
    answer = ''
    i = 0
    while i < len(numbers):
        if i+1 < len(numbers) and numbers[i] == "z" and numbers[i+1] == "e":
            answer += '0'
            i += 4
        elif i+1 < len(numbers) and numbers[i] == "o" and numbers[i+1] == "n":
            answer += '1'
            i += 3
        elif i+1 < len(numbers) and numbers[i] == "t" and numbers[i+1] == "w":
            answer += '2'
            i += 3
        elif i+1 < len(numbers) and numbers[i] == "t" and numbers[i+1] == "h":
            answer += '3'
            i += 5
        elif i+1 < len(numbers) and numbers[i] == "f" and numbers[i+1] == "o":
            answer += '4'
            i += 4
        elif i+1 < len(numbers) and numbers[i] == "f" and numbers[i+1] == "i":
            answer += '5'
            i += 4
        elif i+1 < len(numbers) and numbers[i] == "s" and numbers[i+1] == "i":
            answer += '6'
            i += 3
        elif i+1 < len(numbers) and numbers[i] == "s" and numbers[i+1] == "e":
            answer += '7'
            i += 5
        elif i+1 < len(numbers) and numbers[i] == "e" and numbers[i+1] == "i":
            answer += '8'
            i += 5
        elif i+1 < len(numbers) and numbers[i] == "n" and numbers[i+1] == "i":
            answer += '9'
            i += 4
        else:
            i += 1
        
    return int(answer)