#include <stdio.h>

int main(){
    int a = 5;
    int b = 1;
    float c;

    scanf("%d %d", &a, &b);

    if(a > b || !(a > 0)){
        c= (float)(b / a);
    } else {
        c=(float)(a / b);
    }
    printf("%.2f\n", c);
    return 0;
}

//A saída será 0.00 
