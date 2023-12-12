import sys

x = int(sys.stdin.readline())
y = int(sys.stdin.readline())
result = { (x > 0 and y > 0): 1, (x < 0 and y > 0): 2, (x < 0 and y < 0): 3, (x > 0 and y < 0): 4 }
print(result.get(True))