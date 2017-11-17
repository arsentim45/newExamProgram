public class Client {
    private String name;
    private int age;
    private String sex;
    private boolean inuniversity;

    public Client(String name, int age, String sex, boolean inuniversity){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.inuniversity = inuniversity;
        System.out.println("My name is " + name + " i`m" + age + " years old" + sex +'.' +"Am I studying?" +inuniversity +'!');
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isUniversity() {
        return inuniversity;
    }

    public String getSex() {
        return sex;
    }

    public void setInuniversity(boolean inuniversity) {
        this.inuniversity = inuniversity;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
