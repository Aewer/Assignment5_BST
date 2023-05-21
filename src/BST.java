public class BST<K extends Comparable<K>, V> {
    private int size = 0;
    private Node<K, V> root;
    private class Node<K, V> {
        private K key;
        private V val;
        private Node<K, V> left, right;
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
    private Node<K, V> put(Node<K, V> current, K key, V value) {
        if (current == null) {
            return new Node<>(key, value);
        }
        if(key.compareTo(current.key) < 0) {
            current.left = put(current.left, key, value);
        } else if (key.compareTo(current.key) > 0) {
            current.right = put(current.right, key, value);
        }
        return current;
    }
    public V get (K key) {
        return get(root, key).val;
    }
    private Node<K, V> get(Node<K, V> current, K key) {
        if (current == null || current.key == key) {
            return current;
        }
        if (key.compareTo(current.key) > 0) {
            return get(current.right, key);
        } else {
            return get(current.left, key);
        }
    }
}
