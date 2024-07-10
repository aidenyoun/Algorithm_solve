def solution(my_string, index_list):
    answer = ''
    tmp = list(my_string)
    for i in index_list:
        answer += tmp[int(i)]
    return answer