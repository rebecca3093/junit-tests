import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student;
    Student StudentGrades;

    @Before
    public void init(){
        student = new Student(1, "Rebecca Martinez");
        student.addGrade(90);
        StudentGrades = new Student(2, "Bryant Gutierrez");
        StudentGrades.addGrade(90);
        StudentGrades.addGrade(80);
        StudentGrades.addGrade(50);
    }

    @Test
    public void ifUserObjectCanBeCreated(){
        assertEquals("Rebecca Martinez", student.getName());
        assertEquals(1, student.getId());
    }

    @Test
    public void testIfAddGradeWorks(){
        assertSame(90, student.getGrades().get(0));
    }

    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(90, student.getGradeAverage(), 0);
        assertEquals(73.33333333333333, StudentGrades.getGradeAverage(), 0);
    }

}