public class Main {
    public static void main(String[] args) {
        BST<Integer, Object> tree = new BST<Integer, Object>();
        tree.put(1, 1);
        tree.put(2, 2);
        tree.put(7, 7);
        tree.put(6, 6);
        tree.put(3, 3);
        tree.put(8, 8);
        tree.put(9, 9);
        tree.put(4, 4);
        tree.put(10, 10);
        tree.put(5, 5);
        System.out.println(tree.get(2));
        tree.delete(2);
        System.out.println(tree.get(2));
        tree.inOrder();
        System.out.println();
        System.out.println("Contains 1 " + tree.contains(1));
        System.out.println("Contains 2 (deleted) " + tree.contains(2));
        System.out.println("Contains 3 " + tree.contains(3));
        System.out.println("Contains 4 " + tree.contains(4));
        System.out.println("Contains 5 " + tree.contains(5));
        System.out.println("Contains 6 " + tree.contains(6));
        System.out.println("Contains 7 " + tree.contains(7));
        System.out.println("Contains 8 " + tree.contains(8));
        System.out.println("Contains 9 " + tree.contains(9));
        System.out.println("Contains 10 " + tree.contains(10));
        System.out.println("Contains 11 " + tree.contains(11));
        System.out.println("Contains 80 " + tree.contains(80));
        System.out.println("Contains 34 " + tree.contains(34));
    }
}