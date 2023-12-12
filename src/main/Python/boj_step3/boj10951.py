import sys
cin = sys.stdin.readline

while True:
    try:
        a, b = map(int, cin().split())
        print(a + b)
    except: break