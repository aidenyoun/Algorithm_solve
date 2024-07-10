n = input()
answer = ''
for i in n:
    if i.isupper() == True:
        answer += i.lower()
    else:
        answer += i.upper()
print(answer)