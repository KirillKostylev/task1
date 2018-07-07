import java.util.*;

public class TreeToy {
    private String color;
    private int size;

    public TreeToy(String color, int size) {
        this.color = color;
        this.size = size;
        System.out.println(toString());
    }

    public static void sortToys(List<TreeToy> toys) {
        toys.sort(new Comparator<TreeToy>() {
            @Override
            public int compare(TreeToy o1, TreeToy o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        });
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "ChristmasTreeToy{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeToy treeToy = (TreeToy) o;
        return size == treeToy.size &&
                Objects.equals(color, treeToy.color);
    }
}
