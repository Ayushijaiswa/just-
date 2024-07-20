public class rectangle {
    int len,width;
    public void getdata(int x,int y){
        len=x;
        width=y;

    }
    public int rectarea(){
        return (len*width);
    }
    public static void main(String[] args) {
        int area1,area2;
        rectangle r1=new rectangle();
        r1.len=7;
        r1.width=30;
        area1=r1.len*r1.width;
        rectangle r2= new rectangle();
        r2.getdata(30, 6);
        area2=r2.rectarea();
        System.out.println(area1);
        System.out.println(area2);
    }
}
