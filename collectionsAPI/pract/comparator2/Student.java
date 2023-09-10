package pract.comparator2;

public class Student {
    private int studentId;
    private String studentName;
    private int studentScore;

    public Student(int studentId, String studentName, int studentScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentScore = studentScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(int studentScore) {
        this.studentScore = studentScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentScore='" + studentScore + '\'' +
                '}';
    }
}
