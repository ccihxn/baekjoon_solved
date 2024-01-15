import sys
cin = sys.stdin.readline

s = cin().strip()
S = set()
for i in range(len(s)):
    for j in range(i + 1, len(s) + 1):
        S.add(s[i:j])
print(len(S))