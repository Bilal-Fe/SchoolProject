package YildizCollage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Teacher {
    static Scanner scan =new Scanner(System.in);

    static Map<String, String> teachersMap = new HashMap<>();

    public static void addFakeTeachers(){
        teachersMap.put("123456789123", "Ali, Can, 1988, Mathematics");
        teachersMap.put("123456449123", "Veli, Kara, 1986, Art");
        teachersMap.put("126546789123", "Can, Kor, 1984, Turkish");
        teachersMap.put("123456999123", "Musa, Tas, 1980, English");
        teachersMap.put("123456789443", "Isa, Tunc, 1982, Music");
    }

    public static void teacherMenu() throws InterruptedException {
        String selection = "";
        do{
            System.out.println("====== Yildiz Collage ======\n" +
                    "========= Teacher Menu ========\n" +
                    "\n" +
                    "1- Print Teachers list \n" +
                    "2- Find a teacher by using surname\n" +
                    "3- Find a teacher by using branch\n" +
                    "4- Add a teacher by entering the info\n" +
                    "5- Delete a teacher by using ID number\n" +
                    "A- Main Menu \n"+
                    "Q- EXIT \n");
            selection = scan.nextLine();
            switch(selection){
                case "1" : //Print teacher lists
                    printTeacherLists();

                    break;
                case "2" : //Find a teacher by using surname
                    findingTeacherByUsingLastName();

                    break;
                case "3" : //Find a teacher by using branch
                    findingTeacherByUsingBranch();
                    break;
                case "4" : //Add a teacher by entering the info
                    addingTeacher();
                    break;
                case "5" : //Delete a teacher by using ID number
                    deleteATeacher();
                    break;
                case "a" :
                case "A" : //
                    Utility.mainMenu();
                    break;
                case "q" :
                case "Q" :
                    break;
                default:
                    System.out.println("Please enter a valid value!!");
            }
        }while(!selection.equalsIgnoreCase("q"));
        Utility.stopProject();

    }

    public static void deleteATeacher() throws InterruptedException {
        System.out.println("Enter teacher's TC no.");
        String tcNoDel = scan.nextLine();

        String deletedValue = teachersMap.get(tcNoDel);

        String result = teachersMap.remove(tcNoDel);

        try {
            boolean sonuc = (result.equals(deletedValue));
                 System.out.println("The teacher is deleted!");
        } catch (Exception e) {
            System.out.println("Teacher is not found with given TC no!!");
        }

        Thread.sleep(5000);
    }

    public static void addingTeacher() {
        System.out.println("TC no");
        String tcNo = scan.nextLine();
        System.out.println("Name");
        String name = scan.nextLine();
        System.out.println("Last Name");
        String lastN = scan.nextLine();
        System.out.println("DOB");
        String dob = scan.nextLine();
        System.out.println("Subject");
        String sub = scan.nextLine();

        String addValue = name+", "+lastN+", "+dob+", "+sub;
        teachersMap.put(tcNo, addValue);

    }

    public static void findingTeacherByUsingBranch() throws InterruptedException {
        System.out.println("Enter the teacher's subject.");
        String surname = scan.nextLine();
        Set<Map.Entry<String, String>> teachersEntrySet = teachersMap.entrySet();
        //String eachValuearr[] = eachValue.split(", ");
        System.out.println("Finding Teacher by using subject \n" +
                "TC No        Name LastName DOB    Branch");
        for(Map.Entry<String, String> each:teachersEntrySet){
            String eachKey = each.getKey();
            String eachValue=each.getValue();
            String eachValuearr[] = eachValue.split(", ");

            if(surname.equalsIgnoreCase(eachValuearr[3])) {
                System.out.printf("%11s %-6s %-8s %4s %s \n", eachKey, eachValuearr[0], eachValuearr[1],
                        eachValuearr[2], eachValuearr[3]);
            }
            //System.out.println(eachKey +" "+ eachValue);
        }
        Thread.sleep(5000);
    }

    public static void findingTeacherByUsingLastName() throws InterruptedException {
        System.out.println("Enter last name of the teacher.");
        String surname = scan.nextLine();
        Set<Map.Entry<String, String>> teachersEntrySet = teachersMap.entrySet();
        //String eachValuearr[] = eachValue.split(", ");
        System.out.println("Finding Teacher by using last name \n" +
                "TC No        Name LastName DOB    Branch");
        for(Map.Entry<String, String> each:teachersEntrySet){
            String eachKey = each.getKey();
            String eachValue=each.getValue();
            String eachValuearr[] = eachValue.split(", ");

if(surname.equalsIgnoreCase(eachValuearr[1])) {
    System.out.printf("%11s %-6s %-8s %4s %s \n", eachKey, eachValuearr[0], eachValuearr[1],
            eachValuearr[2], eachValuearr[3]);
}
            //System.out.println(eachKey +" "+ eachValue);
        }
        Thread.sleep(5000);

    }

    public static void printTeacherLists() throws InterruptedException {
        Set<Map.Entry<String, String>> teachersEntrySet = teachersMap.entrySet();

        System.out.println("Teachers list \n" +
                "TC No        Name LastName    DOB Branch");
        for(Map.Entry<String, String> each:teachersEntrySet){
            String eachKey = each.getKey();
            String eachValue=each.getValue();

            String eachValuearr[] = eachValue.split(", ");
           // System.out.println("Teachers list \n" +
            //"TC No        Name LastName DOB    Branch");

            System.out.printf("%11s %-6s %-8s %4s %s \n", eachKey, eachValuearr[0],eachValuearr[1],
                    eachValuearr[2],eachValuearr[3]);

            //System.out.println(eachKey +" "+ eachValue);
        }
        Thread.sleep(5000);
    }
}
