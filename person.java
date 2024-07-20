public class person {
    int adharno;
    String name;
    String panno;
    person(){
        System.out.println("you hav not provided any data");
    }
    person(int adharno,String name,String panno){
        this.adharno=adharno;
        this.name=name;
        this.panno=panno;
        System.out.println("the provided data are adharno  "+adharno+" "+"name  "+name+"panno  "+panno);
    }
    person(String name,String panno){
        this.name=name;
        this.panno=panno;
        
        System.out.println(" the provided data are name"+name+" "+"panno"+" "+panno);
    }
    person(int adharno,String name){
        this.adharno=adharno;
        this.name=name;
        System.out.println("the provided data are adharno"+adharno+"  "+"name"+" "+name);
    }
    person(String panno,int adharno){
        this.panno=panno;
        this.adharno=adharno;
        System.out.println("the provided data are"+adharno+"  "+"panno"+panno);
    }
    public static void main(String[] args) {
        person p1=new person(1234, "khushi", "CH45");
        person p2=new person(12345, "ayushi");
        person p3=new person();
        person p4=new person("ashutosh", "CHJI8");
        person p5 =new person("POI9",2355);
    }
    
}
