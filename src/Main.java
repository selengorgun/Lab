public class Main {
    public static void main(String[] args) {
        Student student1 =newStudent("student1","2222","st1@gmail.com");
        StudentSearch search =newStudentSearch();
        ArrayList<Student> students =newArrayList<Student>();
        students.add(student1);
        try{
            System.out.println(search.findOne(students,"student1").getId());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
