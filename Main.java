package students;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Abigail", "Bbarbux", Gender.FEMALE);
        Student student2 = new Student("Kent", "Rom", Gender.TRANSFORMER);
        Student student3 = new Student("Ivan", "Lovecraft", Gender.MALE);
        Student student4 = new Student("Ron", "Brabus", Gender.FEMALE);
        Student student5 = new Student("Kent", "Rom", Gender.TRANSFORMER);
        Student student6 = new Student("ds", "Rom", Gender.TRANSFORMER);
        Student student7 = new Student("Kent", "Rom", Gender.TRANSFORMER);

        Group group = new Group("Team A");

        student1.setId(4);
        student2.setId(5);
        student3.setId(3);
        student5.setId(5);
        student6.setId(5);
        student7.setId(5);

        try {
            group.addStudent(student1);
            group.addStudent(student2);
            group.addStudent(student3);
            group.addStudent(student4);
            group.addStudent(student5);
            group.addStudent(student6);
            group.addStudent(student7);
            System.out.println(group.searchStudentByLastName("Lovecraft"));
            System.out.println(group.removeStudentByID(4));
        } catch (GroupOverflowException e) {
            e.printStackTrace();
        } catch (StudentNotFoundException e){
            e.printStackTrace();
        }
//        System.out.println(group.toString());
//
//        group.sortStudentsByName();
//
//        StudentScanner st = new StudentScanner();
//        System.out.println(st.toString());
//        try {
//            group.addStudent(st.getSt());
//        } catch (GroupOverflowException e) {
//            e.printStackTrace();
//        }
        System.out.println();
        System.out.println(student1.hashCode());
        System.out.println(group.checkSimilarStudents());
    }
}
