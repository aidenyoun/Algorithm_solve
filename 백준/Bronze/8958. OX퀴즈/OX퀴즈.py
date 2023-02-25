a = int(input())
for i in range(a):
    b = list(input())
    c = 1
    sum = 0
    for i in b:
        if i == 'O':
            sum += c
            c += 1
        else:
            c = 1
    print(sum)