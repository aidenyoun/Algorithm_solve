def solution(num_list):
    end = len(num_list) - 1
    end1 = end - 1
    
    if num_list[end] > num_list[end1]:
        num_list.append(num_list[end] - num_list[end1])
    else:
        num_list.append(num_list[end] * 2)
    
        
    return num_list