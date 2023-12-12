import sys
cin = sys.stdin.readline

grade_board = {'A+': 4.5, 'A0': 4.0, 'B+': 3.5, 'B0': 3.0, 'C+': 2.5, 'C0': 2.0, 'D+': 1.5, 'D0': 1., 'F': 0.}
scores = []
grades = []
for _ in range(20):
    subject, score, grade = cin().split()
    if not grade == 'P':
        scores.append(float(score))
        grades.append(float(score) * grade_board[grade])
print('%.6f' % (sum(grades) / sum(scores)))