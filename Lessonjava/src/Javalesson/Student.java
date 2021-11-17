package Javalesson;
public class Student {
    String id;
    String name;
    int age;
    String course;
//    construct values
    Student(String id,String name,int age,String course){
        this.name = name;
        this.age = age;
        this.id = id;
        this.course = course;
        System.out.println("STUDENT DETAILS");
        System.out.println("_______________");

    }
//   get name
    public String getName(){
        return name;
    }
//    get age
public int getAge(){
    return age;
}
//get id
public String getId(){
    return id;
}
//get course
    public String getCourse(){
        return course;
    }
    public static void main(String[] args){
//        student 1
        Student learner = new Student("1","joseph",22,"programming");
        System.out.println("Id: "+ learner.getId());
        System.out.println("Name: "+ learner.getName());
        System.out.println("Age: "+ learner.getAge());
        System.out.println("Course: "+ learner.getCourse());
        System.out.println();
//        student 2
        Student learner1 = new Student("2","sara",21,"Beauty and hair dressing");
        System.out.println("Id: "+ learner1.getId());
        System.out.println("Name: "+ learner1.getName());
        System.out.println("Age: "+ learner1.getAge());
        System.out.println("Course: "+ learner1.getCourse());
        System.out.println();
    }
}
