import sys
input = sys.stdin.readline

a, b = map(int, input().split())
c = str(a)
d = str(b)

if int(c[::-1]) > int(d[::-1]):
    print(c[::-1])
elif int(c[::-1]) < int(d[::-1]):
    print(d[::-1])