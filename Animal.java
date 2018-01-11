public class Animal {

   // constructor
   public Animal() {
      isAsleep = false;
      if (isAsleep == true) {
        System.out.println("Animal's constructor invoked");
      } else {
        System.out.println("constructor invoked - my new animal is awake");
      }
   }
   
   public Animal(boolean asleep) {
     isAsleep = asleep;
     System.out.println("Animal's constructor WITH ASLEEP invoked");
   }
  
   public Animal(String n) {
     this.name = n;
   }

   // properties
   private String name;
   private int numberOfLegs;
   public int numberOfEyes;
   public boolean isAsleep;

   // methods
   public void eat() {
     System.out.println(name + ":has eaten");
   }

   public void sleep() {
     System.out.println(name + ":is sleeping");
     isAsleep = true;
   }

   public void wakeUp() {
     System.out.println(name + ":wakes up");
     isAsleep = false;
   }

   // getters and setters
   public String getName() {
    return this.name;
   }
   
   public void setName(String n) {
    this.name = n;
   }

   public int getNumOfLegs() {
     System.out.println(name + ":getting number of legs value");
     return numberOfLegs;
   }
  
   public void setNumOfLegs(int num) {
     System.out.println("setting number of legs for this animal instance");
     System.out.println("old value of legs for " + name+ ": " + numberOfLegs);
     this.numberOfLegs = num;
     System.out.println("new value of legs for " + name+ ": " + numberOfLegs);
   }
}
