import sys
cin = sys.stdin.readline

S = set()
for _ in range(10):
    S.add(int(cin()) % 42)
print(len(S))