import sys
cin = sys.stdin.readline

Dial = [3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10]
result = 0
for c in cin().strip():
    result += Dial[ord(c) - ord('A')]
print(result)