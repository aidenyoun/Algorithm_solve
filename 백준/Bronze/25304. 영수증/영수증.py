a = int(input())
b = int(input())
m = 0

for _ in range(1, b+1):
    c, d = map(int, input().split())
    m += c * d

if a == m:
    print("Yes")
else:
    print("No")