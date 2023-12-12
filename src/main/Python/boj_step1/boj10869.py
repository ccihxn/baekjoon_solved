import sys

a, b = map(int, sys.stdin.readline().split())
sys.stdout.write(str(a + b) + '\n' + str(a - b) + '\n' + str(a * b) + '\n' + str(int(a / b)) + '\n' + str(a % b))