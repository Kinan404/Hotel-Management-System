package MainClasses;

public class Person {

    public String Fullname;
    public String Id;

    public String getId() {
        return Id;
    }
    public void printId() {
        System.out.println(Id);
    }
    public void printId(String id) {
        System.out.println(id);
    }
    public void printinfo(){
        System.out.println(Fullname);
        System.out.println(Id);
    }



}
