#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/types.h>

int main()
{

    int pid = fork();
    if (pid == 0)
    {
        printf("Parent Id: %d\n" , getppid());
        printf("My Id: %d\n" , getpid());
    }else{
        printf("My Id: %d\n" , getpid());
        printf("Child Id: %d\n" , pid);
        wait(NULL);   // avoid creating zombie process
        
    }
    

    return 0;
}
