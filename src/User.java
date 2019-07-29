public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        this.name = name;

        if (name.length() > 20){
            throw new IllegalNameLengthException("Error");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        this.age = age;

        if (age > 100 || age < 0) {
            throw new IllegalAgeException("Error");

        }
    }
}
