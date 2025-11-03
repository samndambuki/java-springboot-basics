class Student {
    private String name;
    private int age;

    //constructor
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setAge(int age){
        this.age= age;
    }

    //method
    public void displayInfo(){
        System.out.println("Name" + name + ", Age" + age);
    }


}
