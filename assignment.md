
In this project, you will learn about abstract classes.  inheritance, and interfaces in Java.  You also may learn something about farm animals that you may not have known before.  You will, however, NOT be tested on farm animals. But you DO need to learn about inheritance and interfaces.

We will model three grazing farm animals, namely Cows, Goats, and Horses.  All of these animals are mammals.  They are also all grazing mammals.   But of course, all Mammals do not graze.  For example, although I believe most of my students are mammals,  I am not sure about all of their eating habits. 

A few more facts about farm animals:  Ruminants are a particular type of grazing mammal, in that Ruminants chew the cud.  They also have multiple stomachs for digesting their forage.  Giraffes are ruminants but giraffes are not farm animals.  

Cows and goats have multiple stomachs and chew the cud.  Horses graze but are not ruminants and do not chew the cud and do not have multiple stomachs. 

The concepts of Mammal, Grazing Mammal, and Ruminant are abstractions, that is, these words are conceptual constructs.  You cannot go to a farm animal auction or Amazon and buy a Ruminant.  If you ask for one, the seller will ask you what kind. You must buy an actual, concrete, non-abstract animal such as a cow. goat, or horse.   For this reason, if we model Mammal, GrazingMammal, and Ruminant classes in Java, these classes are declared as abstract and cannot be instantiated (just like a ruminant cannot be born or bought).

However, the characteristics and behavior of mammals, grazing mammals, and ruminants can be inherited by their descendants, as shown below.  

Your job is to implement the following class design:

GrazingMammalsDiag.JPG  


All components of this exercise are provided in the instructions below.  You will just need to assemble the components as instructed.  To make this easier, you are provided below with a stubbed-out source code file listing only the declarations for the classes that you need to populate with code.  

You may implement your project using either IntelliJ by creating a new project and adding this java file to your project, or by adding a new class and pasting the file below,  to your new class. 

You can download the empty java file GrazingMammals.java that you need to implement here.  

How to implement the GrazingMammals project:

 Create an abstract class Mammal. As shown in the class diagram.  Mammal has one public method nursesYoung() that prints out “I am a “ + className + “. I am  nursing.”   You can get the class name from the instance of any class with the following:
String className = this.getClass().getSimpleName(); 

}
 

2. Create an interface RuminantTester..  The interface should contain two public methods. You can copy and paste these into the interface.

     void testIfRuminant(); 
     void  testHasMultipleStomachs(); 
3. Create an abstract class GrazingMammal similar to Mammal but which implements the method grazes().   This method should print out "I am a " + className + ". I am grazing.", similar to what we did with the Mammal class. 

GrazingMammal extends from Mammal and implements the interface RuminantTester.  

To implement the interface you need to add the two methods in the interface to GrazingMammal.   These are provided here: 

     @Override
    public void testHasMultipleStomachs()  {
        String className = this.getClass().getName(); 
        if (this instanceof Ruminant) 
           System.out.println("I am a " + className + ". I have multiple stomachs."); 
       else 
          System.out.println("I am a " + className + ". I do not have multiple stomachs."); 
    } 

    @Override
    public void testIfRuminant()  {
       String className = this.getClass().getName(); 
       if (this instanceof Ruminant ) 
          System.out.println("I am a " + className + ". I am a Ruminant."); 
       else 
          System.out.println("I am a " + className + ". I am not a Ruminant."); 
     }
The @Override annotation indicates that we are replacing the interface stub method with a method body.  We can also override methods from an inherited class and this case also uses this annotation. 

4. Create an abstract class Ruminant that extends GrazingMammal.  Ruminant should print out "I am a " + className + ". I am chewing cud."), similar to the Mammal method implementation.

5.  Add the classes Cow and Goat, which extend Ruminant, and add the class Horse which extends GrazingMammal.  These three classes are just class declarations with empty bodies, yet they provide all the behavior we need. 

How is it possible that these classes can provide behavior when they have no code in the body of the class?   Please include an answer to this question as part of your assignment submission. 

6.   A test driver class called GrazingMammals is provided below,   Add this to your project file. 

public class TestMammals {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.nursesYoung(); 
        cow.grazes(); 
        cow.chewsCud();
        cow.testIfRuminant();
        cow.testHasMultipleStomachs();
        System.out.println("\n"); 
        Goat goat = new Goat();
        goat.nursesYoung(); 
        goat.grazes(); 
        goat.chewsCud();
        goat.testIfRuminant();
        goat.testHasMultipleStomachs();
        System.out.println("\n"); 
        Horse horse  = new Horse();
        horse.nursesYoung(); 
        horse.grazes(); 
        horse.testIfRuminant();
        horse.testHasMultipleStomachs(); 
    }
}
Notes:   

 All these classes can be included in a single code file named the same as the main class, in this case, GrazingMammals.java.  All other classes should be declared with just the class name (without the “public” access modifier).  
All components of this exercise are provided in the instructions above. You will just need to assemble the components as instructed.  
