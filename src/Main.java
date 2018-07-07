public class Main {
    public static void main(String[] args) {
        Tree christmasTree = new Tree();
        TreeToy ball1 = new TreeToy("red", 2);
        TreeToy ball2 = new TreeToy("green", 3);
        TreeToy ball3 = new TreeToy("red", 2);
        TreeToy star1 = new TreeToy("red", 1);
        TreeToy star2 = new TreeToy("orange", 3);
        TreeToy star3 = new TreeToy("blue", 2);

        christmasTree.putToyOnTree(ball1);
        christmasTree.putToyOnTree(ball2);
        christmasTree.putToyOnTree(ball3);
        christmasTree.putToyOnTree(star1);
        christmasTree.putToyOnTree(star2);
        christmasTree.putToyOnTree(star3);


        System.out.println("Number of red toys: " + christmasTree.countRedToys(christmasTree.getToys()));

        System.out.println(christmasTree.getToys()+"\nСортировка по цвету: ");
        TreeToy.sortToys(christmasTree.getToys()); // сортировкаа по цвету
        System.out.println(christmasTree.getToys()+"\nСортировка по размеру: ");
        SortingBySize.sortingBySize(christmasTree.getToys()); // сортировкаа по размеру
        System.out.println(christmasTree.getToys());

    }
}
