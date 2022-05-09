package bai2_05082022;

import java.io.Serializable;
import java.io.FileWriter;

class Student implements Serializable {
    private int studentCode;
    private String name;
    protected int n; // number of subjects
    public Subject[] subjectList;

    public Student(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
        this.n = 3;
        this.subjectList = new Subject[n];
    }

    public Student() {
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getStudentName() {
        return this.name;
    }

    public int getStudentCode() {
        return this.studentCode;
    }

    public int getQuantitySubjects() {
        return this.n; // number of subjects
    }

    public String toString() {
        return this.name + " " + this.studentCode + " " + this.n + "\n";
    }

    public void solve() {
        Student[] students = new Student[3];
        Student s1 = new Student(1, "Le Van A");
        Student s2 = new Student(2, "Le Van B");
        Student s3 = new Student(3, "Le Van C");
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        try {
            FileWriter outFile = new FileWriter("student.dat");
            for (Student student : students) {
                outFile.write(student.toString());
            }
            outFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Subject {
    private String codeSubject;
    private String nameSubject;
    private double x;
    private double y;

    public Subject(String codeSubject, String nameSubject, double x, double y) {
        this.codeSubject = codeSubject;
        this.nameSubject = nameSubject;
        this.x = x;
        this.y = y;
    }

    public void setCodeSubject(String codeSubject) {
        this.codeSubject = codeSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getCodeSubject() {
        return codeSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calcAVG() {
        return 0.5 * getX() + 0.5 * getY();
    }
}

public class bai2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.solve();
    }
}
