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

        doublyLinkedList.display();
        System.out.println();
        System.out.println("sorted by overall:");
        sortedLinkedList.display();
        System.out.println();
        System.out.println("sorted by data structures grade:");
        sortedByData.display();
        System.out.println();
        sortedLinkedList.mathAverage();
        System.out.println();
        System.out.println("student(s) who has lowest data structures grade: ");
        sortedByData.lowestDS();
        sortedByData.deleteById("105");
        System.out.println("The student who id is 105 was deleted:");
        sortedByData.display();
        System.out.println();
        sortedByData.sortedAdd(insertNewStudent());
        System.out.println("new student inserted: ");
        sortedByData.display();

    }

    public static Student insertNewStudent(){
        Scanner scan = new Scanner(System.in);

        System.out.print("enter id: ");
        String id = scan.nextLine();
        System.out.println();

        System.out.print("enter name: ");
        String name = scan.nextLine();
        System.out.println();

        System.out.print("enter math grade: ");
        int math = scan.nextInt();
        System.out.println();

        System.out.print("enter data structures grade: ");
        int data = scan.nextInt();
        System.out.println();

        Student newStudent = new Student(id, name, math, data);

        return newStudent;
    }
}
