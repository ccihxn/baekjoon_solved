import sys
cin = sys.stdin.readline

class Member:
    def __init__(self, id, age, name):
        self.id = id
        self.age = age
        self.name = name

N = int(cin())
L = []
for id in range(N):
    age, name = cin().split()
    age = int(age)
    L.append(Member(id + 1, age, name))
L.sort(key=lambda x: (x.age, x.id))
for info in L: print(f'{info.age} {info.name}')