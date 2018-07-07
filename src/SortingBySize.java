import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingBySize {

    public static void sortingBySize(List<TreeToy> toys) {
        toys.sort(new Comparator<TreeToy>() {
            @Override
            public int compare(TreeToy o1, TreeToy o2) {
                if (o1.getSize() == o2.getSize()) return 0;
                else if (o1.getSize() > o2.getSize()) return 1;
                else return -1;
            }
        });
    }
}
