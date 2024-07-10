t = int(input())
for _ in range(0, t):
    h, w, n = map(int, input().split())
    floor = n%h
    room = (n // h)+1
    if floor == 0:
        floor = h
        room -= 1
    print(floor * 100 + room)