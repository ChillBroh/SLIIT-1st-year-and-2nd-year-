#include <stdio.h>
#include <unistd.h>

int main()
{
    int pid = fork();

    if (pid > 0){
        for (int i = 0; i < 100; i+=2)
        {
            printf("%d\n", i);
        }
        
    }
    

    return 0;
}
