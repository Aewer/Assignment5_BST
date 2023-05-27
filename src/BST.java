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
        size++;
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
        return get(root, key) == null ? null : get(root, key).val;
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
    public void delete(K key) {
        root = delete(root, key);
        size--;
    }
    private Node<K, V> delete(Node<K, V> current, K key){
        if(current == null)
            return null;
        if(key.compareTo(current.key) < 0){
            current.left = delete(current.left, key);
        } else if (key.compareTo(current.key) > 0) {
            current.right = delete(current.right, key);
        }
        else {
            //case 1: no children
            if(current.left == null && current.right == null){
                return null;
            };
            //case 2:  1 child
            if(current.left == null){
                return current.right;
            }
            if(current.right == null){
                return current.left;
            }
            //case3: two children
            K smallestValue = findSmallestValue(current.right);
            current.key = smallestValue;
            current.right = delete(current.right, smallestValue);
        }
        return current;
    }
    private K findSmallestValue(Node<K, V> root){
        return root.left == null ? root.key : findSmallestValue(root.left);
    }
    private void inOrder(Node<K, V> node){
        if(node !=null){
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }
    public void inOrder(){
        inOrder(root);
    }
    private boolean contains(Node<K, V> current, K key) {
        if (current == null) {
            return false;
        } else if (current.key == key) {
            return true;
        } else if (key.compareTo(current.key) > 0) {
            return contains(current.right, key);
        } else {
            return contains(current.left, key);
        }
    }
    public boolean contains(K key) {
        return contains(root, key);
    }
}
// implement contains method (public and private) using recursion
