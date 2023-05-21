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
    public void put(K key, V value) {
        root = put(root, key, value);
    }
    public Node put(Node current, K key, V value) {
        if (current == null) {
            return new Node(key, value);
        }
        if(key.compareTo(current.key) < 0) {
            current.left = put(current.left, key, value);
        } else if (key.compareTo(current.key) > 0) {
            current.right = put(current.right, key, value);
        }
        return current;
    }
}
