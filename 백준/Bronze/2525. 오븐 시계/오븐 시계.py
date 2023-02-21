a, b = map(int, input().split())
c = int(input())
m = b + c

if (m >= 60):
    a += (m // 60)
    m1 = m // 60
    m -= 60*m1

if (a >= 24):
    a -= 24

print(a, m)