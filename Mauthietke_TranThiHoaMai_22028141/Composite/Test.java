import java.util.ArrayList;
import java.util.List;

/** Javadoc_Ex1Test.
 * @author hoamai
 * @since 28/11/2023
 */
public class Ex1Test {
    public static void main(String[] args) {
        Person tthm = new Person("TTHM", "15/09/2004", "Female", "DND");

        Person f11 = new Person("F11", "10/12/2021", "Male", null);
        Person f12 = new Person("F12", "10/12/2021", "Male", "G11");
        tthm.add(f11);
        tthm.add(f12);

        Person f21 = new Person("F21", "10/12/2042", "Male", "H11");
        Person f22 = new Person("F22", "10/12/2042", "Female", "H12");
        Person f23 = new Person("F23", "10/12/2050", "Male", null);
        Person f24 = new Person("F24", "10/12/2050", "Female", null);
        f12.add(f21);
        f12.add(f22);
        f12.add(f23);
        f12.add(f24);

        Person f31 = new Person("F31", "10/12/2069", "Male", null);
        Person f32 = new Person("F32", "10/12/2069", "Female", null);
        Person f33 = new Person("F33", "10/12/2070", "Female", "I11");
        f21.add(f31);
        f21.add(f32);
        f22.add(f33);

        List<Person> listPerson = new ArrayList<>();
        List<Integer> listCheck = new ArrayList<>();
        List<Person> NotMarried = new ArrayList<>();
        List<String> TwoChildren = new ArrayList<>();
        List<Person> TheLastGeneration = new ArrayList<>();

        listPerson.add(tthm);
        while (!listPerson.isEmpty()) {
            int size = listPerson.size();
            boolean check = true;
            for (int j = 0; j < size; j++)
                if (listPerson.get(j).getMarried() == null) listCheck.add(j, -1);
                else {
                    listCheck.add(j, listPerson.get(j).getChildren().size());
                    if (check && listCheck.get(j) > 0) check = false;
                }
            if (check) {
                TheLastGeneration.addAll(listPerson);
                for (int j = 0; j < size; j++)
                    if (listCheck.get(j) == -1) NotMarried.add(listPerson.get(j));
                listPerson.clear();
            } else {
                List<Person> nextListPerson = new ArrayList<>();
                for (int j = 0; j < size; j++)
                    if (listCheck.get(j) == -1) NotMarried.add(listPerson.get(j));
                    else if (listCheck.get(j) > 0) {
                        nextListPerson.addAll(listPerson.get(j).getChildren());
                        if (listCheck.get(j) == 2) TwoChildren.add(listPerson.get(j).getName() + " - " + listPerson.get(j).getMarried());
                    }
                listPerson.clear();
                listPerson.addAll(nextListPerson);
            }
        }

        System.out.println("Người chưa kết hôn trong danh sách phả hệ:");
        for (Person person : NotMarried) System.out.println("\t" + person);

        System.out.println("\nCác cặp vợ chồng có 2 con trong danh sách phả hệ:");
        for (String family : TwoChildren) System.out.println("\t" + family);

        System.out.println("\nThế hệ mới nhất trong danh sách phả hệ:");
        for (Person person : TheLastGeneration) System.out.println("\t" + person);
    }
}