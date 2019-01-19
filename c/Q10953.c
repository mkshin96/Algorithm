#include <stdio.h>

int main(){
	int a,b,c,i = 0;
	char ch;
	scanf("%d", &a);
	for(i =0; i < a; i++){
		scanf("%d %c %d", &b, &ch, &c);
		printf("%d\n", b+c);
	}
}
