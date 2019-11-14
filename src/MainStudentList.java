public class MainStudentList
{
    public static void main(String[] args)
    {
        String[] names = {"Katia", "Mariana", "Fer", "Daniela"};
        StudentList studentList = new StudentList(names);
        studentList.RemoveStudents(10);
        studentList.Display();


    }
}
