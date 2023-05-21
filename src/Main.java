public class Main {
    public static void main(String[] args) {
        BST<Integer, Object> tree = new BST<Integer, Object>();
        tree.put(1, 1);
        tree.put(2, 2);
        tree.put(12, 12);
        tree.put(7, 7);
        tree.put(5, 5);
        System.out.println(tree.get(2));
        tree.delete(2);
        System.out.println(tree.get(2));
        tree.inOrder();
    }
}