package edu.ntudp.fit.klishevych.lab4.controller;
import edu.ntudp.fit.klishevych.lab4.model.*;

import java.util.ArrayList;

public class UniversityCreator {
    public University createUniversity(String name, Human head, ArrayList<Faculty> facultyList) {
        return new University(name, head, facultyList);
    }
    public University createTypicalUniversity() {
        HumanCreator HumanCreator = new HumanCreator();
        StudentCreator StudentCreator = new StudentCreator();
        GroupCreator GroupCreator = new GroupCreator();
        DepartmentCreator DepartmentCreator = new DepartmentCreator();
        FacultyCreator FacultyCreator = new FacultyCreator();

        Human universityHead = HumanCreator.createHuman("Олександр","Олександрович","Азюковський", Sex.MALE);
        Human facultyFHead = HumanCreator.createHuman("Ірина","Михайлівна","Удовик ", Sex.FEMALE);
        Human departmentHead = HumanCreator.createHuman("Михайло","Олександрович","Алексєєв", Sex.MALE);
        Human groupFirstHead = HumanCreator.createHuman("Дар'я","Олегівна","Райгородська", Sex.FEMALE);
        Human groupSecondHead = HumanCreator.createHuman("Максим","Сергійович","Гончаров", Sex.MALE);

        Student studentFirst = StudentCreator.createStudent("Максим","Сергійович","Попов", Sex.MALE,"101");
        Student studentSecond = StudentCreator.createStudent("Анастасія","Сергіївна","Бут", Sex.FEMALE,"102");
        Student studentThird = StudentCreator.createStudent("Софія","Костянтинівна","Гейко", Sex.FEMALE,"201");
        Student studentFourth = StudentCreator.createStudent("Вячеслав","Олександрович","Кастєров", Sex.MALE,"202");

        ArrayList<Student> groupFirstStudents = new ArrayList<>();
        groupFirstStudents.add(studentFirst);
        groupFirstStudents.add(studentSecond);
        ArrayList<Student> groupSecondStudents = new ArrayList<>();
        groupSecondStudents.add(studentThird);
        groupSecondStudents.add(studentFourth);
        Group groupFirst = GroupCreator.createGroup("122-20-1", groupFirstHead, groupFirstStudents);
        Group groupSecond = GroupCreator.createGroup("122-20-2", groupSecondHead, groupSecondStudents);

        ArrayList<Group> departmentGroups = new ArrayList<>();
        departmentGroups.add(groupFirst);
        departmentGroups.add(groupSecond);
        Department department = DepartmentCreator.createDepartment("ПЗКС", departmentHead, departmentGroups);

        ArrayList<Department> facultyDepartments = new ArrayList<>();
        facultyDepartments.add(department);
        Faculty faculty = FacultyCreator.createFaculty("ФІТ", facultyFHead, facultyDepartments);

        ArrayList<Faculty> universityFaculties = new ArrayList<>();
        universityFaculties.add(faculty);
        return new UniversityCreator().createUniversity("НТУ ДП", universityHead,universityFaculties);
    }
}
