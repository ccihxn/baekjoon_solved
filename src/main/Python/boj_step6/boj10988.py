import sys
cin = sys.stdin.readline

s = cin().strip()
print(int(s == ''.join(reversed(s))))