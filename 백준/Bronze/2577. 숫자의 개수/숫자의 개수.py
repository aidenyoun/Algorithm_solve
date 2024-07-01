a = int(input())
b = int(input())
c = int(input())

d = a*b*c

for i in range(0, 10):
    print(f"{str(d).count(str(i))}")