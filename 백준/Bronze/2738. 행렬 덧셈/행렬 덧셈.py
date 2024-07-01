a, b = map(int, input().split())

a1 = [[0] * b for _ in range(a)]
b1 = [[0] * b for _ in range(a)]

for i in range(a):
    a1[i] = list(map(int, input().split()))

for i in range(a):
    b1[i] = list(map(int, input().split()))

for i in range(a):
    for j in range(b):
        print(f"{a1[i][j] + b1[i][j]}" , end=" ")
    print()