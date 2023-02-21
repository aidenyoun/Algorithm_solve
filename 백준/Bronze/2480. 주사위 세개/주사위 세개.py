a, b, c = map(int, input().split())
money = 0

if a == b == c:
    money = 10000 + a * 1000
elif a == b:
    money = 1000 + a * 100
elif b == c:
    money = 1000 + b * 100
elif c == a:
    money = 1000 + a * 100

else:
    if (a > b):
        if (a > c):
            money = a * 100
        if (c > a):
            money = c * 100
    elif (b > c):
        if (b > a):
            money = b * 100
        if (a > b):
            money = a * 100
    elif (c > a):
        if (c > b):
            money = c * 100
        if (b > c):
            money = b * 100

print(money)
