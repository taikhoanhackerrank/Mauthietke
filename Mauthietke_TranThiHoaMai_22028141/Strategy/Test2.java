import java.util.ArrayList;
import java.util.List;

/** Javadoc_Ex2Test.
 * @author hoamai
 * @since 28/11/2023
 */
public class Ex2Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(9, 0, 2, 1, 0, 8, 1, 7));
        Context context = new Context(new SelectionSort());
        context.sort(list);
        System.out.println(list);
    }
}