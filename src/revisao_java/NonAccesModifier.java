package revisao_java;

public class NonAccesModifier {
      public static void main(String[] args) {
            System.out.println("Starting with "
                    + InstanceCounter.getCount() + " instances.");
            for(int i = 0; i <= 500; i++) {
                  new InstanceCounter();
            }
            
            System.out.println("Created " + 
                    InstanceCounter.getCount() + " instances");
            
            InstanceCounter intCounter = new InstanceCounter();
            System.out.println(intCounter.getNumInstance());
            
            // FINAL REFERENCE VARIABLE
            final Person p1 = new Person();
            p1.age = 12; p1.name = "Joao";
            
             // p1 = new Person(); cannot assign a value
             // p1 = null;
             
            //This is legal. You can modify the state of final reference.
            p1.name = "Andre"; p1.age = 25;
            
            Person p2 = new Person();
            p2 = p1;
            
            /* Final reference allows you to modify the state of the object 
               but you cannot modify the reference variable to point to a 
               different object in the memory. */
            
      }
}

class InstanceCounter {
      private static int numInstances = 0;
      
      public static int getCount() {
            return numInstances;
      }
      
      private static void addInstance() {
            numInstances++;
      }

      public InstanceCounter() {
            InstanceCounter.addInstance();
      }
      
      public int getNumInstance() {
            return numInstances;
      }
}

class TestFinal {
      // The value of the primitive variable cannot
      // be changed once initialized.
      public final int value = 10;
      
      // the following are examples of declaring a constant.
      public static final int BOXWIDTH = 6;
      public final static double PI = 3.141592654;
      static final String TITLE = "Manager";
      
}

class Person {
      public String name;
      public int age;
}

/*
STATIC
The static keyword is used to create variables that will exist
independently of any instances created for the class.

Only one copy of the static variable exists regardless of the number of
instances of the class

Static variables are also known as class variables. Local variables cannot
be declared static.

Static methods do not use any instance variables of any object of 
the class they are defined in. Static methods take all the data 
from parameters and compute something from those parameters,
with no reference to variables.

FINAL VARIABLES
A final variable can be explicitly initialized only once. 
A reference variable declared final can never be reassigned 
to refer to an different object.

However, the data within the object can be changed. So, the state of the object 
can be changed but not the reference.

With variables, the final modifier often is used with static to make the
constant a class variable.

*/