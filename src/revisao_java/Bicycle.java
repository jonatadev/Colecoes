/*
https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

https://docs.oracle.com/javase/tutorial/java/concepts/interface.html

Interface:
an interface is a group of related methods with empty bodies
In the Java programming language, an interface is a reference
type, similar to a class, that can contain only constants,
method signatures, default methods, static methods, 
and nested types. Method bodies exist only for default 
methods and static methods. Interfaces cannot be 
instantiated—they can only be implemented by classes or 
extended by other interfaces.
*/

package revisao_java;

// A bicycle's behavior, if specified as an interface.
// Implementing an interface allows a class to become more formal
// about the behavior it promises to provide. 
public interface Bicycle {
      public static final double E = 2.718282;
      void changeCadence(int newValue);
      void changeGear(int newValue);
      void speedUp(int incremment);
      void applyBrakes(int decrement);
}  

// Using an Interface as a Type.
/*
   When you define a new interface, you are defining a new
   reference data type.
   You can use interface names anywhere you can use any other data type name.
   If you define a reference variable whose type is an interface, any object 
   you assign to it must be an instance of a class that implements the interface.
*/