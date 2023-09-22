package View;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

public class ViewEngClass implements iGetView {
    private HashMap<String, String> language = new HashMap<>();

    public ViewEngClass() {
        this.language.put("msgInputCommand",
                "\u001B[33mEnter the command:\u001B[0m\nLIST - Show list of students\nDELETE - Remove a student from the list\nEXIT - Exit the program");
        this.language.put("msgExit", "\u001B[33mExit the programm\u001B[0m");
        this.language.put("msgSelectStudentToDelete", "\u001B[33mEnter student ID to delete:\u001B[0m");
        this.language.put("msgListIsEmpty", "\u001B[31mStudent list is empty\u001B[0m");
        this.language.put("msgIncorrectData", "\u001B[31mYou entered incorrect data\u001B[0m");
        this.language.put("msgIsNotInTheList", "\u001B[31mA student with this ID is not in the list\u001B[0m");
        this.language.put("msgDeleted", ":\u001B[31m DELETED\u001B[0m");
        this.language.put("msgModel", "\u001B[32m Model\u001B[0m");
    }

    public void printAllStudent(List<Student> students) {
        System.out.println("----------- Student list -----------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();

    }

    public HashMap<String, String> getLanguage() {
        return language;
    }

}