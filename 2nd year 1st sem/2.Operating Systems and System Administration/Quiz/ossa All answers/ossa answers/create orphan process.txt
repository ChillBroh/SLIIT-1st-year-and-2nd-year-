#include <stdio.h>
#include <unistd.h>

int main()
{
    
    int pid = fork();

    if (pid == 0)
    {
        printf("%d\n", getppid());
        sleep(50);  // create orphan process
    }
    

    return 0;
}
