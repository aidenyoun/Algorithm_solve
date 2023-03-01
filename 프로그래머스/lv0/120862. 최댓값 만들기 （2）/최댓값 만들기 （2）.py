def solution(numbers):
    a = []
    for i in numbers:
        for j in numbers:
            a.append(i*j)
    a.remove(max(numbers)*max(numbers))
    a.remove(min(numbers)*min(numbers))
    return max(a)