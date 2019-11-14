import java.util.ArrayList;

public class StudentList
{
    private ArrayList<String[]> students;

    public StudentList()
    {
        students = new ArrayList<>();
    }

    public StudentList(String [] names)
    {
        students = new ArrayList<>();
        for(int i = 0; i<names.length; i++)
        {
            students.add(names);
        }
    }

    public void Display()
    {
        for (int i=0; i<students.size(); i++)
        {
            System.out.println(students.get(i));
        }
    }

    public void RemoveStudents(int indexStudent)
    {
        try {
            students.remove(indexStudent);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid index student");
        }
    }
}
