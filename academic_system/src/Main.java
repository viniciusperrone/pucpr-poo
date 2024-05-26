//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();

        while (true) {
            UserInterface prompt = new UserInterface();

            prompt.chooseOption();

            if(prompt.getOption() == 1) {
                Student student = prompt.addNewStudent();

                listStudent.add(student);
            }

            if(prompt.getOption() == 2) {
                for (Student student : listStudent) {
                    student.printData();
                }
            }


        }
    }
}