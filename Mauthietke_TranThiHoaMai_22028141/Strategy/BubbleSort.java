import java.util.List;

/** Javadoc.*/

public class BubbleSort implements Strategy {
    @Override
    public void sort(List<Integer> list) {
        System.out.print("Bubble Sort: ");
        for (int j = 0; j < list.size() - 1; j++) {
            for (int i = 0; i < list.size() - j - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    int tmp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, tmp);
                }
            }
        }
    }
}