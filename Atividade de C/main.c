int f(int *v1, int *v2, int tamanho) {    
    int i;
    for (i = 0; i < tamanho; i++) {
        v1[i] = v2[i];
    }
    return i;
}
