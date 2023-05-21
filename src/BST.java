public class BST<K extends Comparable<K>, V> {
    private int size = 0;
    private Node root;
    private class Node {
        private K key;
        private V val;
        private Node left, right;
        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }
    public int size() {
        return size;
    }
}
