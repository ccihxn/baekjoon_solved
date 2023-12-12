import sys
cin = sys.stdin.readline

map = {}
s = cin().upper().strip()
map = dict.fromkeys(s, 0)
for c in s:
    map[c] += 1
max_count = max(map.values())
max_keys = list(filter(lambda key: map[key] == max_count, map.keys()))
print('?' if len(max_keys) > 1 else max_keys.pop())