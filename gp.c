#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<dirent.h>
 int main()
{
    char fn[10],pat[10],temp[2000];
    FILE *fp;
    printf("enter file name\n");
    scanf("%s",fn);
    printf("enter pattern to be searched  \n");
    scanf("%s",pat);
    fp=fopen(fn,"r");
    while (!feof(fp))
    {
        fgets(temp,sizeof(fp),fp);
        if(strstr(temp,pat)){
        printf("%s",temp);}

        
    }fclose(fp);
    return 1;
    

}