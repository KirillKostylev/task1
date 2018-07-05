public class TreeToy  {
    private String color;
    private String shape;

    public TreeToy(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "TreeToy{" +
                "color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }
}
