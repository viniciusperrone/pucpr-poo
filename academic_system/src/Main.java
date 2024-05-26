//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();

        String continuosLoop = String.valueOf('S');

        while (continuosLoop.equals("S")) {
            UserInterface prompt = new UserInterface();

            prompt.chooseOption();

            switch (prompt.getOption()) {
                case 1: {
                    Student student = prompt.addNewStudent();

                    listStudent.add(student);

                    break;
                }

                case 2: {
                    for (Student student : listStudent) {
                        student.printData();
                    }

                    break;
                }

                case 3: {
                    int selectedIndexStudent = prompt.selectIndexStudent(listStudent);

                    Student selectedStudent = listStudent.get(selectedIndexStudent - 1);

                    prompt.updateStudent(selectedStudent);

                    break;
                }
                case 4: {
                    int selectedIndexStudent = prompt.selectIndexStudent(listStudent);

                    listStudent.remove(selectedIndexStudent - 1);

                    break;
                }

                default: {
                    prompt.printInvalidOption();

                    break;
                }
            }

            continuosLoop = prompt.askContinuosLoop();
        }
    }
}