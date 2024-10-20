class Student{
    int rollno;
    String name;
    int marks;
}
public class ArrOfObjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 4;
        s1.name = "Shivam";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 13;
        s2.name = "Abhijeet";
        s2.marks = 82;

        Student s3 = new Student();
        s3.rollno = 45;
        s3.name = "Rishi";
        s3.marks = 79;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i<students.length; i++){
            System.out.println(students[i].name + " : "  +  students[i].marks);
        }
    }
}
