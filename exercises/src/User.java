public class User {
    String name;
    String email;
    String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    void printNameAndEmail() {
        System.out.println("Nome: " + this.name);
        System.out.println("Email: " + this.email);
    }

    void verifyPassword(String password) {
        if(password.equals(this.password)) {
            System.out.println("Senhas identicas");
        } else {
            System.out.println("Senhas não identicas");
        }
    }

    public static void main(String [] args) {
        User user;

        user = new User("Vinicius", "vinicius@gmail.com", "123456");

        user.verifyPassword("senha000");
        user.verifyPassword("123456");
    }
}
