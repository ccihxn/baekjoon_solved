import sys
cin = sys.stdin.readline

def isVPS(s):
    L = []
    for c in s:
        if c == '(': L.append(c)
        elif c == ')':
            if len(L) == 0: return False
            else: L.pop()
    return len(L) == 0

for _ in range(int(cin())):
    print('YES' if isVPS(cin()) else 'NO')
