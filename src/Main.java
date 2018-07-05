public class Main {
    public static void main(String[] args) {
        Tree christmasTree = new Tree();
        TreeToy ball1 = new TreeToy("red","ball");
        TreeToy star = new TreeToy("red","star");
        TreeToy ball2 = new TreeToy("green","ball");

        christmasTree.putToyOnTree(ball1);
        christmasTree.putToyOnTree(star);
        christmasTree.putToyOnTree(ball2);

        System.out.println(christmasTree.countRedToys(christmasTree.getToys()));


    }

}
