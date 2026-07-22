class Student{
    private Integer id;
    private String name;

    Student(Integer id , String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName(){
        return "Id: "+ id + " Name: "+ name;
    }
}



public class EncapsulationExample {
    public static void main(String[] args){
        Student s1 = new Student(1,"Ahmad");
        String s = s1.getFullName();
        System.out.println(s);

        Student s2 = new Student(2, "");
        s2.setName("Allu");
        System.out.println(s2.getName());

    }
}
