package revisao_java;

// Interfaces
interface Trainable {
      public void attendTraining();
}

interface Interviewer {
      /* public abstract */ void conductInterview();
      
      default void submitInterviewStatus() {
            System.out.println("Accept");
      }
}

interface runner{
      /*public abstract*/ int speed();
      /*public static final*/ double distance = 70;
}




// Classes
class Manager extends Employee implements Interviewer, Trainable {
      int teamSize;
      void reportProjectStatus(){}

      @Override
      public void conductInterview() {
            System.out.println("Mgr - conductInterview");
      }

      @Override
      public void attendTraining() {
            System.out.println("Mgr - attendTraining");
      }
      
}

public class Programmer extends Employee implements Trainable {
      String[] programmingLanguages;
      void weriteCode(){}

      @Override
      public void attendTraining() {
            System.out.println("Prog - attendTraining");
      }
}


class Employee {
      String name;
      String address;
      String phoneNumber;
      float experience;
}


/*  STOP 403 STATIC METHODS
      
  All methods of an interface are implicitly public    
  The interfaces variables are implicitly public static
  and final
  
  Types of method in an interface
  abstract methods
  Default methods (new in Java 8)
  Static methods (new in Java 8)   


You cannot instantiate an interface.

An interface does not contain any constructors.

All of the methods in an interface are abstract.

An interface cannot contain instance fields. 
The only fields that can appear in an interface must be declared both static and final.

An interface is not extended by a class; it is implemented by a class.

An interface can extend multiple interfaces.

*/