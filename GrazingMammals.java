//No imports needed
//Inheritance Assignment - Project 3 - tjudge
abstract class Mammal{
    public void nursesYoung(){
        String classname = this.getClass().getName();
        System.out.println("I am a "+ classname + ". I am nursing");
    }
}

interface RuminantTester{
    void testIfRuminant();
    void testHasMultipleStomachs();
}

abstract class GrazingMammal extends Mammal implements RuminantTester{
    @Override
    public void testIfRuminant()  {
        String className = this.getClass().getName();
        if (this instanceof Ruminant )
            System.out.println("I am a " + className + ". I am a Ruminant.");
        else
            System.out.println("I am a " + className + ". I am not a Ruminant.");
    }


    @Override
    public void testHasMultipleStomachs()  {
        String className = this.getClass().getName();
        if (this instanceof Ruminant)
            System.out.println("I am a " + className + ". I have multiple stomachs.");
        else
            System.out.println("I am a " + className + ". I do not have multiple stomachs.");
    }
    public void grazes(){
        String classname = this.getClass().getName();
        System.out.println("I am a "+ classname + ". I am grazing");
    }
}

class Ruminant extends GrazingMammal{
    public void nursesYoung(){
        String classname = this.getClass().getName();
        System.out.println("I am a "+ classname + ". I am nursing");
    }
    public void chewsCud() {
        String className = this.getClass().getSimpleName();
        if (this instanceof Ruminant ) {
            System.out.println("I am a " + className + ". I am chewing the cud.");
        }
        else {
            System.out.println("I am a " + className + ". I am not chewing the cud.");
        }
    }
}

class Cow extends Ruminant{}

class Goat extends Ruminant{}

class Horse extends GrazingMammal{}

class TestMammals {
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
//I was going to implement pseudo-ruminants, but found it to overly complicate things
//Question - How is it possible that these classes can provide behavior when they have no code in the body of the class?
/* Answer - As was discussed in both the Tuesday and Thursday class, they can have behaviors without having
code in the body because of inheritance. They are INHERITING the behavior from their parent classes. */
