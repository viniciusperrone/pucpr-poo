public class Student {
    String name;
    int age;
    String gender;

    public Student (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void printData() {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("Sexo: " + this.gender);
    }

    public static void main(String [] args) {}
}
