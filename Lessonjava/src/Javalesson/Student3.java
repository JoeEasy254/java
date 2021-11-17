package Javalesson;

public class Student3 {
    String adm_no;
    String name;
    String subject;

    Student3(String adm,String nme,String sub){
        name = nme;
        adm_no = adm;
        subject = sub;
    }
    void display(){
        System.out.println("ADM: "+adm_no+" Name: "+name+" Subject: "+subject);
    }
    public static void main(String[] args){
        Student3 n = new Student3("229","peter","maths");

        Student3 x = new Student3("224","catherine","history");
        n.display();
        System.out.println("<><><><>\n<><><><>\n<><><><>\n<><><><>\n<>");
        x.display();
    }
}
