import java.util.ArrayList;
import java.util.List;
/** Javadoc_Person.
 * @author hoamai
 * @since 28/11/2023
 */
public class Person {
    private final List<Person> children = new ArrayList<>();
    private final String name;
    private final String birth;
    private final String gender;
    private final String married;

    /** Javadoc. */
    public Person(String name, String birth, String gender, String married) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.married = married;
    }

    /** Javadoc. */
    public void add(Person child) {
        children.add(child);
    }

    /** Javadoc. */
    public String toString() {
        return "Name: " + name + ", Date of birth: " + birth + ", Sex: " + gender;
    }

    /** Javadoc. */
    public String getName() {
        return name;
    }

    /** Javadoc. */
    public String getMarried() {
        return married;
    }

    /** Javadoc. */
    public List<Person> getChildren() {
        return children;
    }
}