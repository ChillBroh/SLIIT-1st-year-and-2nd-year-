#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main(int argc, char const *argv[])
{

    int pid = fork();

    if (pid == 0)
    {
        printf("Parent Id: %d\n" , getpid());
    }else{
        sleep(100);  // create a zombie process
    }

    

    return 0;
}
