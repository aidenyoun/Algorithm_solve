def solution(answers):
    answer = []
    cnt = [0] * 3
    pattern = [
        [1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    ]

    for i in range(len(answers)):
        if answers[i] == pattern[0][i % len(pattern[0])]:
            cnt[0] += 1
        if answers[i] == pattern[1][i % len(pattern[1])]:
            cnt[1] += 1
        if answers[i] == pattern[2][i % len(pattern[2])]:
            cnt[2] += 1

    max_score = max(cnt)
    
    for i in range(len(cnt)):
        if cnt[i] == max_score:
            answer.append(i + 1)

    return answer