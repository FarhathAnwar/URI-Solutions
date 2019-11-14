n = int(input())

while n!=0:
    line = input().split(' ')
    a1 = line[0]
    a2 = line[1]
    word=''
    if len(a1)>len(a2):
        for c in range(len(a1)):
            if c >= len(a2):
                word = word + a1[c]
            else:
                word = word + a1[c] + a2[c]

    elif len(a2)>len(a1):
        for c in range(len(a2)):
            if c >= len(a1):
                word = word + a2[c]
            else:
                word = word + a1[c] + a2[c]

    else:
        for c in range(len(a1)):
            word = word + a1[c] + a2[c]

    print(word)
    n-=1
