import sys
cin = sys.stdin.readline

while True:
    line = cin().strip()
    if line == '0 0': break
    print(sum(map(int, line.split())))