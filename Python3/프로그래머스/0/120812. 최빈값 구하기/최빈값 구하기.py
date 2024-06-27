def solution(array):
    frequency = {}
    
    # 배열을 순회하면서 빈도 수를 세기
    for i in array:
        if i in frequency:
            frequency[i] += 1
        else:
            frequency[i] = 1
            
    # 최빈값을 찾기 위해 빈도 수 중 최대값 찾기
    max_freq = max(frequency.values())
    
    # 최빈값을 가진 숫자들을 저장할 리스트
    most_frequent_numbers = []
    
    # 딕셔너리를 순회하면서 최대 빈도 수와 같은 값을 가지는 숫자들을 리스트에 추가
    for key, value in frequency.items():
        if value == max_freq:
            most_frequent_numbers.append(key)
    
    # 최빈값이 여러 개면 -1, 아니면 최빈값 반환
    if len(most_frequent_numbers) > 1:
        return -1
    else:
        return most_frequent_numbers[0]