package homework3;

import DoublyLinkedList.DoublyLinkedList;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        DoublyLinkedList sortedLinkedList = new DoublyLinkedList();
        DoublyLinkedList sortedByData = new DoublyLinkedList();

// Open the file
        FileInputStream fstream = new FileInputStream("students.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;

//Read File Line By Line
        while ((strLine = br.readLine()) != null)   {

            String[] items= strLine.split(",");
            String id, name;
            Integer  math=0, data=0;
            id = items[0];
            name = items[1];

            try{
                math = Integer.valueOf(items[2]);
            }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }
            try{
                data = Integer.valueOf(items[3]);
            }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }

            Student student = new Student(id, name, math, data);
            doublyLinkedList.addToEnd(student);
            sortedLinkedList.sortedAdd(student);
            sortedByData.sortedAddByDataStructure(student);
        }
        fstream.close();

        Scanner choose = new Scanner(System.in);
        System.out.println("1- Display initial linkedlist");
        System.out.println("2- Display students sorted by their overall average");
        System.out.println("3- Display student names sorted by their data structure grades");
        System.out.println("4- Display math average");
        System.out.println("5- Display the student(s) who has teh lowest data structure grade");
        System.out.println("6- Delete a student via id");
        System.out.println("7- Insert a new student");
        System.out.println("8- Display the student count");
        System.out.println("9- Passed students for each course");
        System.out.print("Please select the action you want to do (enter -1 to exit): ");
        int entered = choose.nextInt();

        while (entered != -1){
            switch (entered){
                case 1:
                    System.out.println("Initial list:");
                    doublyLinkedList.display();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("sorted by overall:");
                    sortedLinkedList.display();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("sorted by data structures grades:");
                    sortedByData.display();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("average of Math grades: " + sortedLinkedList.mathAverage());
                    System.out.println();
                    break;
                case 5:
                    System.out.println("student(s) who has lowest data structures grade: ");
                    sortedByData.lowestDS();
                    System.out.println();
                    break;
                case 6:
                    System.out.print("enter id of student who you want to delete: ");
                    Scanner scan = new Scanner(System.in);
                    String num = scan.nextLine();
                    System.out.println();
                    sortedByData.deleteById(num);
                    sortedLinkedList.deleteById(num);
                    doublyLinkedList.deleteById(num);
                    System.out.println("The student who id is " + num + " was deleted:");
                    //doublyLinkedList.display();
                    sortedByData.display();
                    //sortedLinkedList.display();
                    System.out.println();
                    break;
                case 7:
                    Student s = insertNewStudent();
                    sortedByData.sortedAddByDataStructure(s);
                    sortedLinkedList.sortedAdd(s);
                    System.out.println("new student inserted: ");
                    sortedByData.display();

                    break;
                case 8:
                    sortedByData.count();
                    break;
                case 9:
                    System.out.println("average of Math grades: " + sortedLinkedList.mathAverage());
                    System.out.println("Passed students for Math:  ");
                    sortedByData.passedMath();
                    System.out.println();
                    System.out.println("average of Data Structures grades: " + sortedByData.dataAverage());
                    System.out.println("Passed students for Data Structures: ");
                    sortedByData.passedData();
                    break;
                default:
                    System.out.println("Invalid choose! Please enter a valid choose (enter -1 to exit): ");

            }
            System.out.print("Please select the action you want to do: ");
            entered = choose.nextInt();

        }

    }

    public static Student insertNewStudent(){
        Scanner scan = new Scanner(System.in);

        System.out.print("enter id: ");
        String id = scan.nextLine();
        //System.out.println();

        System.out.print("enter name: ");
        String name = scan.nextLine();
        //System.out.println();

        System.out.print("enter math grade: ");
        int math = scan.nextInt();
        //System.out.println();

        System.out.print("enter data structures grade: ");
        int data = scan.nextInt();
        //System.out.println();

        Student newStudent = new Student(id, name, math, data);

        return newStudent;
    }
}
