package edu.ntudp.fit.klishevych.lab4;
import edu.ntudp.fit.klishevych.lab4.controller.UniversityCreator;
import edu.ntudp.fit.klishevych.lab4.model.University;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println("Назва університету: " + university.getName());
        System.out.println("Голова університету: " + university.getHead().getLastName() + " " +
                university.getHead().getFirstName() + " " + university.getHead().getFathersName());
        System.out.println("Факультети університету:");
        university.getSubordinates().forEach(faculty -> {
            System.out.println("\tНазва факультету: " + faculty.getName());
            System.out.println("\tГолова факультету: " + faculty.getHead().getLastName() + " " +
                    faculty.getHead().getFirstName() + " " + faculty.getHead().getFathersName());
            System.out.println("\tКафедри факультету:");
            faculty.getSubordinates().forEach(department -> {
                System.out.println("\t\tНазва кафедри: " + department.getName());
                System.out.println("\t\tГолова кафедри: " + department.getHead().getLastName() + " " +
                        department.getHead().getFirstName() + " " + department.getHead().getFathersName());
                System.out.println("\t\tГрупи кафедри:");
                department.getSubordinates().forEach(group -> {
                    System.out.println("\t\t\tНазва групи: " + group.getName());
                    System.out.println("\t\t\tСтуденти групи:");
                    group.getSubordinates().forEach(student -> {
                        System.out.println("\t\t\t\tПовне ім'я студента/ки: " +
                                student.getLastName() + " " + student.getFirstName() + " " + student.getFathersName());
                        System.out.println("\t\t\t\tІдентифікаційний номер студента: " + student.getId());
                    });
                });
            });
        });
    }
}
