import sys
cin = sys.stdin.readline

while True:
    a, b = map(int, cin().split())
    if a == b == 0: exit()
    if b % a == 0: print('factor')
    elif a % b == 0: print('multiple')
    else: print('neither')