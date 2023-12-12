import sys

A, B, C = map(int, sys.stdin.readline().split())
sys.stdout.write(
    str((A + B) % C) + '\n' +
    str(((A % C) + (B % C)) % C) + '\n' +
    str((A * B) % C) + '\n' +
    str(((A%C) * (B%C)) % C))
