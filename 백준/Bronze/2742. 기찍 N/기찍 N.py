import sys
input = sys.stdin.readline

a = int(input())
b = []

for i in range (1, a+1):
    b.append(i)

c = reversed(b)

for k in c:
    print(k)