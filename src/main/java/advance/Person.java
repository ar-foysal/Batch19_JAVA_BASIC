package advance;

public class Person {
    private String name;
    private String gender;
    private int age;

    public Person(){
        System.out.println("Printed from Person class constructor");
    }

    public Person(String name){
        this.name = name;
        System.out.println("Printed from Person class constructor " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void greetings(){
        System.out.println("Hello! " + name + "!");
    }

}
