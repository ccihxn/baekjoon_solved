import sys
cin = sys.stdin.readline

n = int(cin().strip())
K = 1
line = []
spare = []
peoples = list(map(int, cin().split()))

for person in peoples:
    line.append(person)

while True:
    if not line and not spare:
        print("Nice")
        break

    if not spare:
        if line[0] != K:
            spare.append(line[0])
        else:
            K += 1
        line.pop(0)

    elif not line:
        if spare[-1] != K:
            print("Sad")
            break
        spare.pop()
        K += 1

    else:
        if line[0] != K and spare[-1] != K:
            spare.append(line[0])
            line.pop(0)
        elif line[0] == K:
            line.pop(0)
            K += 1
        elif spare[-1] == K:
            spare.pop()
            K += 1
