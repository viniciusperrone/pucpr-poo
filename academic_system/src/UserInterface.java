import java.util.Scanner;

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

    int getOption() {
        return this.option;
    }

    public static void main(String [] args) {}
}
