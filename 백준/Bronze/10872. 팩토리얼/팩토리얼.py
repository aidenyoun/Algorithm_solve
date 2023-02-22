import sys
input = sys.stdin.readline

a = int(input())
b = 1

for i in range(1, a+1):
    b *= i
    
print(b)