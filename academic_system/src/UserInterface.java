import java.util.Scanner;

public class UserInterface {
    int option;

    public UserInterface() {
        this.option = 0;
    }

    void chooseOption() {
        System.out.println("------------Sistema PUC-----------\n");

        System.out.println("1. Listar");
        System.out.println("2. Incluir");
        System.out.println("3. Editar");
        System.out.println("1. Excluir");

        System.out.print("Escolha sua opção: ");

        Scanner scanner = new Scanner(System.in);

        this.option = Integer.parseInt(scanner.nextLine());
    }

    int getOption() {
        return this.option;
    }

    public static void main(String [] args) {
        UserInterface prompt = new UserInterface();

        prompt.chooseOption();
    }
}
