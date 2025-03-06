#include <iostream>
#include <set>
using namespace std;

int main()
{
    int N;
    size_t res = 0;
    cin >> N;

    set<string> chats;

    for (int i = 0; i < N; i++)
    {
        string chat;
        cin >> chat;

        if (chat == "ENTER")
        {
            res += chats.size();
            chats.clear();
        }

        else
            chats.insert(chat);
    }

    res += chats.size();
    cout << res;
}