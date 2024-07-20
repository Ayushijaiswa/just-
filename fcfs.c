#include<stdio.h>
struct process
{
    int pid;
    int btime;
    int wtime;
    int ttime;

} p[10];
int main()
{
  int i,j,k,n,ttur,twat;
  float awat,atur;
  printf("enter no of process\n");
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    printf("burst time", (i+1));
    scanf("%d",&p[i].btime);
    p[i].pid=i+1;
  }
  p[0].wtime=0;
  for(int i=0;i<n;i++){
    p[i+1].wtime=p[i].wtime+p[i].btime;
    p[i].ttime=p[i].wtime+p[i].btime;
  }
  ttur=twat=0;
  for(int i=0;i<n;i++){
    ttur=p[i].ttime;
    twat+=p[i].wtime;
    awat=(float)twat/n;
    atur=(float)ttur/n;}
    printf("\nfcfs scheduling\n\n");
    for(int i=0;i<28;i++){
        printf("___");

    }
    for(i=0;i<n;i++){
        printf(p[i].pid,p[i].btime,p[i].ttime,p[i].wtime);
        printf("\n");
    }

  }



