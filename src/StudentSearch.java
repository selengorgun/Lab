import java.util.ArrayList;

public class StudentSearch {
    // This is a comment.
    public boolean studentExists(ArrayList<Student> students, String id) throws Exception {
        if (students.isEmpty()) 
            throw new Exception("Students list should not be empty!");
        for (Student student: students)
            if (student.getId().equals(id))
                return true;
        return false;
    }
    public Student findOne(ArrayList<Student> students,String name) throws Exception {
        for(Student student: students)
            if(student.getName().equals(name))
                return student;
                
        throw new Exception ("There is no student with thegiven name!");
    }
    public ArrayList<Student> findAll(ArrayList<Student>students, String name) throws Exception {
        ArrayList<Student> result =newArrayList<Student>();
        for(Student student: students)
            if(student.getName().equals(name)) {
                result.add(student);
            }
        if(result.isEmpty()) {
            throw new Exception ("There is no student withthe given name!");
        } 
        return result;
    }
}

