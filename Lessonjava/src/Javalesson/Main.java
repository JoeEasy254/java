package Javalesson;

public class Main {

    public static void main(String[] args){

        char branch = 'c';
        int collegeYear = 2;


      switch (collegeYear){
          case 1:
              System.out.println("english,maths,science");
              break;

          case 2:
              switch(branch){
                  case 'c':
                      System.out.println("operating system,java,data structures");
                      break;
                  case 'e':
                      System.out.println("micro-processor,logic switching theory");
                      break;
                  case 'm':
                      System.out.println("drawing,manufacturing machines");
                      break;
              }
              break;

          case 3:
              switch (branch){
                  case 'c':
                      System.out.println("computer organization, multimedia");
                      break;
                  case 'e':
                      System.out.println("fundamentals of logic design,microprocessors");
                      break;
                  case 'm':
                      System.out.println("Internal combustion engine,mechanical vibartion");
                      break;
              }
              break;
          case 4:
              switch (branch){
                  case 'c':
                      System.out.println("Data communication and network, multimedia");
                      break;
                  case 'e':
                      System.out.println("Embedded sysytems, image processing");
                      break;
                  case 'm':
                      System.out.println("production technology, Thermal engineering");
                      break;
              }
              break;
      }
    }
}
