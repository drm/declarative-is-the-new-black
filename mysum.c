#include <stdio.h>

int sum(int a, int b) {
    return a + b;
}

int main(int argc, char *argv[]) {
    int c;
    c = sum(10, 20);
    printf("c now contains %d\n", c); /* Will output: "c now contains 30" */
    return 0;
}
