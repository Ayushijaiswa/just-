#include<stdio.h>
#include<dirent.h>
#include<stdlib.h>
#include<string.h>
int main()
{
    char dirname[1000];
    DIR *p;
   struct  dirent *d;
   
    
    printf("enter directory name\n");
    scanf("%s",dirname);
    p=opendir(dirname);
    
    while (d=readdir(p))
    {
        printf("%s\n", d->d_name);
        return 0;
    }}
    
   
    
    
