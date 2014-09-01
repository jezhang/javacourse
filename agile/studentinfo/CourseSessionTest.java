package studentinfo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CourseSessionTest {

	@Test
	public void testCreate() {
		// fail("Not yet implemented");
		CourseSession session = new CourseSession("ENGL","101");
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
	}
	
	@Test
	public void testEnrollStudents() {
		CourseSession session = new CourseSession("ENGL","101");
		
		Student s1 = new Student("Jean Zhang");
		session.enroll(s1);
		assertEquals(1, session.getNumberOfStudents());
		
		Student s2 = new Student("zhangsan");
		session.enroll(s2);
		assertEquals(2, session.getNumberOfStudents());
	}

}
