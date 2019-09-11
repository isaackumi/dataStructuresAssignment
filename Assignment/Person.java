public class Person {
  private String name;
  private int age;
  enum GENDER{MALE,FEMALE};
  GENDER gender;
  
  
  public Person(String name,int age, GENDER gender) { 
    this.name=name;
    this.age=age;
    this.gender=gender;
  }
  
  public String getName(){
    return this.name;
  }
  public int getAge()
  {
   return this.age;
  }  
  
  public void setName(String n){
  this.name=n;
  }
  public String toString(){
    return "The name: "+this.getName() +  "The Age is: " + this.getAge();
  
  }
  public static void main(String[] args){
    Person person1=new Person("Kobby",34,GENDER.MALE);
    System.out.println(person1.getName());
    System.out.println(person1.toString());
    person1.setName( "emma");
      System.out.println(person1.getName());   
                      
 
  }
}
