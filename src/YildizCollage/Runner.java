package YildizCollage;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        //FakeTeacher and FakeStudent methods create 5 students and teachers by using maps
        Teacher.addFakeTeachers();
        Student.addFakeStudent();
        Utility.mainMenu();
    }


}
