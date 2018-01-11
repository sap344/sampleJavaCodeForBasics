public class MyPets {

 public static void main(String[] args){
   
   System.out.println("Starting MyPets program");

   // create new Animal
   Animal myAnimal1;
   myAnimal1 = new Animal("animal_1");

   Animal myAnimal2 = new Animal("animal_2");

   Dog myDog1 = new Dog("dawg");
  // Animal myDog2 = new Dog();
   System.out.println("name of dog:" + myDog1.getName());
   ///////////
   myDog1.setName("Dawg");
   System.out.println("name of dog:" + myDog1.getName());
   myDog1.sleep();
   myDog1.bark();
   ///////////////
   Cat myCat1= new Cat("Cawt");
   myCat1.meow();
    
   ///////////////////////////////

   myAnimal2.wakeUp();
   myAnimal2.setNumOfLegs(4);
   System.out.println("how many legs?: " + myAnimal2.getNumOfLegs());
   myAnimal1.eat();
   myAnimal2.sleep();
   
 }
}
