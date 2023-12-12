import sys
cin = sys.stdin.readline

N = int(cin())
set = set()
cnt = 0
for _ in range(N):
    is_group = True
    set.clear()
    s = cin().strip()
    for i, c in enumerate(s):
        if c in set and s[i - 1] != c:
            is_group = False
            break
        set.add(c)
    if is_group: cnt += 1
print(cnt)