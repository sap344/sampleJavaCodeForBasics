public class Dog extends Animal {

  private String name;
  
  public void bark() {
    System.out.println(this.getName() + ":bhow bo bhau");
  }
 
  public String getName() {
     return this.name;
  }

  public void setName(String n) {
    System.out.println("setting name");
    this.name = n;
  }
}
