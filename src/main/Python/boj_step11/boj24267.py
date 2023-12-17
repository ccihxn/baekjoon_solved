from functools import reduce

n = int(input()) + 1
print(reduce(lambda x, y: x * y, range(n - 3, n)) // 6)
print('3')