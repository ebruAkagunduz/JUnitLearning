import java.util.Objects;

/**
 * @author ebru
 * @date Dec, 2021
 */
public class Student {

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Student)) {
			return false;
		}
		Student student = (Student) o;
		return id == student.id;
	}

	@Override
	public int hashCode() {
		return id;
	}
}
