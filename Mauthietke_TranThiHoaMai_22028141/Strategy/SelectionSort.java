import java.util.List;

public class SelectionSort implements Strategy {
    /** Javadoc_Ex2Test.
    * @author hoamai
    * @since 28/11/2023
    */
    @Override
    public void sort(List<Integer> list) {
        System.out.print("Selection Sort: ");
        for (int i = 0; i < list.size(); i++) {
            int minn = i;
            for (int j = i + 1; j < list.size(); j++)
                if (list.get(j) < list.get(minn)) minn = j;
            if (minn != i) {
                int tmmp = list.get(i);
                list.set(i, list.get(minn));
                list.set(minn, tmmp);
            }
        }
    }
}