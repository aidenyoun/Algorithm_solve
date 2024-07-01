a, b = map(int, input().split())

a1 = str(a)[::-1]
b1 = str(b) [::-1]
l = max(len(a1), len(b1))
c = []
ans = ''

for i in range(l):
    digit_a = int(a1[i]) if i < len(a1) else 0
    digit_b = int(b1[i]) if i < len(b1) else 0

    c.append(digit_a + digit_b)

for i in range(len(c)-1,-1,-1):
    ans += str(c[i])

print(ans)