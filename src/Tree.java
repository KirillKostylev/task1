import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tree {
    private List<TreeToy> toys = new ArrayList<>();

    public void putToyOnTree(TreeToy toy)
    {
        toys.add(toy);
    }

    public int countRedToys(List<TreeToy> toys) {
        int count = 0;
        for (TreeToy toy : toys) {
            if (toy.getColor() == "red") {
                count++;
            }
        }
        return count;
    }

    public List<TreeToy> getToys() {
        return toys;
    }

}
