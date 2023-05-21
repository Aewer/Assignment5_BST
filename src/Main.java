public class Main {
    public static void main(String[] args) {
        BST<Integer, Object> tree = new BST<Integer, Object>();
        tree.put(1, 1);
        tree.put(2, 2);
        System.out.println(tree.get(2));
    }
}