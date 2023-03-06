def solution(my_string):
    answer1 = my_string.lower()
    answer = ''.join(sorted(answer1))
    return answer