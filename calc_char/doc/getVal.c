#include <stdio.h>

int extractIntFromChar(char ch) {
    int num = ch - '0';
    return num;
}

int main() {
    char ch;
    printf("char型の数字を入力してください: ");
    scanf(" %c", &ch);

    int extractedNum = extractIntFromChar(ch);
    printf("int型の値は%dです。\n", extractedNum);

    return 0;
}
