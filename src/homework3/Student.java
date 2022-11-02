package homework3;

public class Student implements Comparable, MyComparable {
    String id;
    String name;
    int math_grade;
    int data_garde;

    public Student(String id, String name, int math_grade, int data_garde) {
        this.id = id;
        this.name = name;
        this.math_grade = math_grade;
        this.data_garde = data_garde;
    }

    public int getMath_grade(){
        return this.math_grade;
    }

    public String getId(){
        return this.id;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        int sTotal = s.data_garde + s.math_grade;
        int ownTotal = this.data_garde + this.math_grade;
        int returnable;

        if (sTotal == ownTotal)
            returnable = 0;
        else if(sTotal > ownTotal)
            returnable = -1;
        else
            returnable = 1;

        return returnable;
    }

    public String toString() {
        return "id:" + this.id + ", " + "name:" + this.name + ", " + "math score:" + this.math_grade + ", " + "data structures grade:" + this.data_garde;
    }

    @Override
    public int compareDataStructures(Student s) {
        int returnable;

        if (this.data_garde == s.data_garde)
            returnable = 0;
        else if(s.data_garde > this.data_garde)
            returnable = -1;
        else
            returnable = 1;

        return returnable;
    }

    @Override
    public int compareId(String s) {
        if(this.id == s)
            return 0;
        else
            return -1;
    }


}


