def isVPS(s):
    VPS = []
    for c in s:
        if c == ')' and (len(VPS) == 0 or not VPS.pop()): return False
        if c == ']' and (len(VPS) == 0 or VPS.pop()): return False
        if c == '(': VPS.append(True)
        if c == '[': VPS.append(False)
    if len(VPS) == 0: return True
    else: return False

while True:
    s = input()
    if s == '.': exit()
    print('yes' if isVPS(s) else 'no')