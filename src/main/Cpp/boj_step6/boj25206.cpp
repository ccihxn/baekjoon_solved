#include <iostream>
#include <unordered_map>
#include <sstream>
#include <limits>
using namespace std;

int main() {
    unordered_map<string, double> grade_board = {
        {"A+", 4.5},
        {"A0", 4.0},
        {"B+", 3.5},
        {"B0", 3.0},
        {"C+", 2.5},
        {"C0", 2.0},
        {"D+", 1.5},
        {"D0", 1.0},
        {"F", 0.0}
    };
    double total_grade = 0, total_score = 0;
    for (int i = 0; i < 20; i++) {
        string subject, grade, input;
        double score;
        // getline(cin, input);
        // istringstream iss(input);
        // iss >> subject >> score >> grade;
        cin >> subject >> score >> grade;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        if (grade != "P") {
            total_score += score;
            total_grade += score * grade_board[grade];
        }
    }
    printf("%.6f", total_grade / total_score);
}