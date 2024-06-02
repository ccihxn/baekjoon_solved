import sys
cin = sys.stdin.readline

N = int(cin())
print(bin(N)[2:])


# 해당 연도를 입력받아 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성해줘.

year = int(cin())
if year % 4 == 0 and (year % 100 != 0 or year % 400 == 0):
    print(1)
else:
    print(0)
