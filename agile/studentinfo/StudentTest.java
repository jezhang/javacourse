package studentinfo;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
	public void testCreate() {
		Student student = new Student("Jean Zhang");
		String studentName = student.getName();
		assertEquals("Jean Zhang",studentName);
		
		Student s2 = new Student("Leo Lai");
		String s2Name = s2.getName();
		assertEquals("Leo Lai", s2Name);
		
	}
}
