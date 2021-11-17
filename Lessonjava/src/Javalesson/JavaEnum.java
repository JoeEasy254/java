package Javalesson;

public enum JavaEnum {
   sun,mon,tue,wed,thur,fri,sat,sund;
    public static void main(String[] args){
     JavaEnum[] DayNow = JavaEnum.values();
        for (JavaEnum days:DayNow){

          switch(days){
              case sun:
                  System.out.println("sunday");
                  break;
              case mon:
                  System.out.println("monday");
                  break;
              case tue:
                  System.out.println("tuesday");
                  break;
              case wed:
                  System.out.println("wednesday");
                  break;
              case thur:
                  System.out.println("thursday");
                  break;
              case fri:
                  System.out.println("friday");
                  break;
              case sat:
                  System.out.println("saturday");
                  break;

          }
        }

    }
}
