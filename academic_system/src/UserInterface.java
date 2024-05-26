import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    int option;

    public UserInterface() {
        this.option = 0;
    }

    void chooseOption() {
        System.out.println("\n------------Sistema PUC-----------\n");

        System.out.println("1. Incluir");
        System.out.println("2. Listar");
        System.out.println("3. Editar");
        System.out.println("4. Excluir");

        System.out.print("Escolha sua opção: ");

        Scanner scanner = new Scanner(System.in);

        this.option = Integer.parseInt(scanner.nextLine());

        System.out.print("\n");
    }

    Student addNewStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Idade: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Sexo: ");
        String gender = scanner.nextLine();

        return new Student(name, age, gender);
    }

    int selectIndexStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < students.size(); i++) {
            System.out.printf("%d. Estudante\n", i + 1);

            Student student = students.get(i);

            student.printData();
        }

        System.out.print("\nEscolha o index do estudante que deseja: ");

        return Integer.parseInt(scanner.nextLine());
    }

    void updateStudent(Student student) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String newName = scanner.nextLine();
        System.out.print("Idade: ");
        int newAge = Integer.parseInt(scanner.nextLine());
        System.out.print("Nome: ");
        String newGender = scanner.nextLine();

        student.name = newName;
        student.age = newAge;
        student.gender = newGender;

        System.out.print("\n");
    }

    void printInvalidOption() {
        System.out.println("Opção inválida!");
    }

    int getOption() {
        return this.option;
    }

    public static void main(String [] args) {}
}
