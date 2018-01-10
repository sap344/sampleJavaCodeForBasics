public class MyPets {

 public static void main(String[] args){
   
   System.out.println("Starting MyPets program");

   // create new Animal
   Animal myAnimal1;
   myAnimal1 = new Animal("animal_1");

   Animal myAnimal2 = new Animal("animal_2");
   
   ///////////////////////////////

   myAnimal2.wakeUp();
   myAnimal2.setNumOfLegs(4);
   System.out.println("how many legs?: " + myAnimal2.getNumOfLegs());
   myAnimal1.eat();
   myAnimal2.sleep();
   
 }
}
