n = int(input())
size = list(map(int, input().split()))
t, p = map(int, input().split())
ts = 0
pen = 0
pen1 = 0
for i in size:
    if int(i) % t == 0:
        ts += int(i) // t
    else:
        ts += (int(i) // t) + 1
pen += (n//p)
pen1 = n % p
print(ts)
print(f"{pen} {pen1}")