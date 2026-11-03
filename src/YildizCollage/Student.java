package YildizCollage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Student {
static Map<String,String> studentMap = new HashMap<>();
static Scanner scan = new Scanner(System.in);
    public static void addFakeStudent(){
        studentMap.put("123456119123", "Ali, Can, 2007, 3556, 12, A");
        studentMap.put("123456449111", "Veli, Kara, 2007, 3557, 12, B");
        studentMap.put("126546789193", "Ayse, Kor, 2008, 3558, 11, A");
        studentMap.put("123456199143", "Musa, Tas, 2008, 3559, 11, A");
        studentMap.put("123456789449", "Isa, Tunc, 2009, 3560, 10, A");
    }
    public static void studentMenu() throws InterruptedException {
        String selection = "";
        do{
        System.out.println("====== Yildiz Collage ======\n" +
                "========= Student Menu ========\n" +
                "\n" +
                "1- Print Student list \n" +
                "2- Find a student by using surname\n" +
                "3- Find a student by using class and section\n" +
                "4- Add a student by entering the info\n" +
                "5- Delete a student by using ID number\n" +
                "A- Main Menu \n"+
                "Q- EXIT \n");
        selection = scan.nextLine();
        switch(selection){
            case "1" : //Print student lists
                printStudentLists();

                break;
            case "2" : //Find a student by using surname
                findingStudentByUsingLastName();

                break;
            case "3" : //Find a student by using class and section
                findingStudentByUsingClassAndSection();
                break;
            case "4" : //Add a teacher by entering the info
                addingStudent();
                break;
            case "5" : //Delete a teacher by using ID number
                deleteAStudent();
                break;
            case "a" :
            case "A" : //
                Utility.mainMenu();
                break;
            case "q" :
            case "Q" :
                Utility.stopProject();
                break;
            default:
                System.out.println("Please enter a valid value!!");
        }
    }while(!selection.equalsIgnoreCase("q"));
        Utility.stopProject();

}

    private static void deleteAStudent() throws InterruptedException {
        System.out.println("Enter student's TC no.");
        String tcNoDel = scan.nextLine();

        String deletedValue = studentMap.get(tcNoDel);

        String result = studentMap.remove(tcNoDel);

        try {
            boolean sonuc = (result.equals(deletedValue));
            System.out.println("The student is deleted!");
        } catch (Exception e) {
            System.out.println("Student is not found with given TC no!!");
        }

        Thread.sleep(5000);
    }

    private static void addingStudent() {
        System.out.println("TC no");
        String tcNo = scan.nextLine();
        System.out.println("Name");
        String name = scan.nextLine();
        System.out.println("Last Name");
        String lastN = scan.nextLine();
        System.out.println("DOB");
        String dob = scan.nextLine();
        System.out.println("ID");
        String id = scan.nextLine();
        System.out.println("Grade");
        String clss = scan.nextLine();
        System.out.println("Room");
        String room = scan.nextLine();

        String addValue = name+", "+lastN+", "+dob+", "+id+", "+clss+", "+room;
        studentMap.put(tcNo, addValue);
    }

    private static void findingStudentByUsingClassAndSection() throws InterruptedException {
        Set<Map.Entry<String, String>> studentEntrySet = studentMap.entrySet();
        System.out.println("Enter the grade of the student.");
        String grade = scan.nextLine();
        System.out.println("Enter the room of the student.");
        String room = scan.nextLine();

        //String eachValuearr[] = eachValue.split(", ");
        System.out.println("Finding Teacher by using last name \n" +
                "TC No        Name LastName DOB     ID  Class Section");
        for(Map.Entry<String, String> each:studentEntrySet){
            String eachKey = each.getKey();
            String eachValue=each.getValue();
            String eachValuearr[] = eachValue.split(", ");

            if(grade.equalsIgnoreCase(eachValuearr[4]) && room.equalsIgnoreCase(eachValuearr[5])) {
                System.out.printf("%-12s %-6s %-6s %-6s %-8s %-5s %-2s \n", eachKey, eachValuearr[0], eachValuearr[1],
                        eachValuearr[2], eachValuearr[3], eachValuearr[4], eachValuearr[5]);
            }
            //System.out.println(eachKey +" "+ eachValue);
        }
        Thread.sleep(5000);

    }

    private static void findingStudentByUsingLastName() throws InterruptedException {
        System.out.println("Enter last name of the student.");
        String surname = scan.nextLine();
        Set<Map.Entry<String, String>> studentEntrySet = studentMap.entrySet();
        //String eachValuearr[] = eachValue.split(", ");
        System.out.println("Finding Teacher by using last name \n" +
                "TC No        Name LastName DOB     ID  Class Section");
        for(Map.Entry<String, String> each:studentEntrySet){
            String eachKey = each.getKey();
            String eachValue=each.getValue();
            String eachValuearr[] = eachValue.split(", ");

            if(surname.equalsIgnoreCase(eachValuearr[1])) {
                System.out.printf("%-12s %-6s %-6s %-6s %-8s %-5s %-2s \n", eachKey, eachValuearr[0], eachValuearr[1],
                        eachValuearr[2], eachValuearr[3], eachValuearr[4], eachValuearr[5]);
            }
            //System.out.println(eachKey +" "+ eachValue);
        }
        Thread.sleep(5000);
    }

    public static void printStudentLists() throws InterruptedException {
        Set<Map.Entry<String, String>> studentsEntrySet = studentMap.entrySet();

        System.out.println("Students list \n" +
                "    TC No    Name LastName  DOB   ID   Class Section");
        for(Map.Entry<String, String> each:studentsEntrySet){
            String eachKey = each.getKey();
            String eachValue=each.getValue();

            String eachValuearr[] = eachValue.split(", ");
            // System.out.println("Teachers list \n" +
            //"TC No        Name LastName DOB    Branch");

            System.out.printf("%11s %-6s %-6s %2s %s %4s %6s\n", eachKey, eachValuearr[0],eachValuearr[1],
                    eachValuearr[2],eachValuearr[3], eachValuearr[4], eachValuearr[5]);

            //System.out.println(eachKey +" "+ eachValue);
        }
        Thread.sleep(5000);
    }
}

