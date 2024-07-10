def solution(numbers, k):
    n = len(numbers)
    position = 0
    for _ in range(k - 1):
        position = (position + 2) % n
    return numbers[position]