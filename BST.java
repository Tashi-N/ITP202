import java.util.*;

public class BST<Key extends Comparable<Key>, Value>  {
    private Node root;
    int size = 0;             // root of BST

    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right; 
        private int size; // left and right subtrees

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
            this.size=size;
        }
 
    }

    /**
     * Returns true if this symbol table is empty.
     * @return {@code true} if this symbol table is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return size(root);
       
    }

    // return number of key-value pairs in BST rooted at x
   private int size(Node x) {
        if (x==null) {
            return 0;
        }
        return size;
      
       
    }

    /**
     * Does this symbol table contain the given key?
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key} and
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public boolean contains(Key key) {
        if (key==null) {
             System.out.print("key cannot be null");
         }
         return get(key) != null;
     
    }

    /**
     * Returns the value associated with the given key.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *         and {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Key key) {
        if(key == null){
            throw new IllegalArgumentException("argument to get value() is null");
        }
        Node focusNode = root;
        while(focusNode.key != key){
            int cmp = key.compareTo(focusNode.key);
            if(cmp < 0){
                focusNode = focusNode.left;
            }
            else if(cmp > 0){
                focusNode = focusNode.right;
            }
        }
        if(focusNode.key == key){
            System.out.println(focusNode.val);
        }
        return focusNode.val;
    }

    // /**
    //  * Inserts the specified key-value pair into the symbol table, overwriting the old 
    //  * value with the new value if the symbol table already contains the specified key.
    //  * Deletes the specified key (and its associated value) from this symbol table
    //  * if the specified value is {@code null}.
    //  *
    //  * @param  key the key
    //  * @param  val the value
    //  * @throws IllegalArgumentException if {@code key} is {@code null}
    //  */
    public void put(Key key, Value val) {
        Node newNode = new Node(key,val);
        if(root == null){
            root = newNode;
        }
        else{
            Node focusNode = root;
            Node parent;
            while(true){
                parent = focusNode;
                int cmp = key.compareTo(focusNode.key);
                if(cmp < 0){
                    focusNode = focusNode.left;
                    if(focusNode == null){
                        parent.left = newNode;
                        size = size + 1;
                        return;
                    }
                    else if(focusNode.key == key){
                        focusNode.val = val;
                        return;
                    }
                }
                else if(cmp > 0){
                    focusNode= focusNode.right;
                    if(focusNode == null){
                        parent.right = newNode;
                        size = size + 1;
                        return;
                    }
                    else if(focusNode.key == key){
                        focusNode.val = val;
                        return;
                    }
                }
            }
        }
        size = size + 1;
    }

    /**
     * Returns the smallest key in the symbol table.
     *
     * @return the smallest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key min() {
       if(isEmpty()){
        throw new NoSuchElementException("There is no element in the tree");
       }
       else{
            Node focusNode = root;
            while(focusNode.left != null){
                focusNode = focusNode.left;
            }
            return focusNode.key;
       }
    } 

    
   

    /**
     * Returns the largest key in the symbol table less than or equal to {@code key}.
     *
     * @param  key the key
     * @return the largest key in the symbol table less than or equal to {@code key}
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Key floor(Key key) {
        if(isEmpty()){
            throw new NoSuchElementException("calls floor() with empty symbol table");
        }
        Node curNode = root;
        Node parent = null;
        while(curNode != null){
            parent = curNode;
            int cmp = key.compareTo(parent.key);
            if(key == null){
                throw new IllegalArgumentException("calls floor() with a null key");
            }
            if(cmp == 0){
                return parent.key;
            }
            if(cmp < 0){
                curNode = parent.left;
            }
            //This condition is for checking floor of given key in right side
            else if(cmp > 0){
                curNode = parent.right;
                //This condition returns previous parent as floor of given key as it is less the right parent
                int cm = key.compareTo(curNode.key);
                if(cm < 0 ){
                    return parent.key;
                }
                //This is for if the key is still greater then right parent
                else{
                    curNode = parent.right;
                } 
            }
        }
        return parent.key;
    } 

    public Key select(Key key){
        if(isEmpty()){
            throw new NoSuchElementException("calls floor() with empty symbol table");
        }
        Node focusNode = root;
        Node parent = null;
        while(focusNode != null){
            parent = focusNode;
            int cmp = key.compareTo(parent.key);
            if(key == null){
                throw new IllegalArgumentException("calls floor() with a null key");
            }
            if(cmp > 0){
                focusNode = parent.right;
            }
            //This condition is for checking floor of given key in left side
            else if(cmp < 0){
                focusNode = parent.left;
                //This condition checks if key is greater than left parent then it returns the curNode 
                int cm = key.compareTo(parent.key);
                if(cm > 0 ){
                    return focusNode.key;
                }
                //This is for if the key is still less then left parent
                else{
                    focusNode = parent.left;
                } 
            }
        }
        return parent.key;
    }
    public void key(Key low,Key hi){
        if (low==null || hi==null) {
            System.out.println("key  cannot be null");
        }
        Node focusNode=root;
        Node parent;
        while(focusNode!=null) {
            parent=focusNode;
            if(parent==null) {
                return;
            }
            int cmp=low.compareTo(parent.key);
            int cm=hi.compareTo(parent.key);
            if (cmp<0) {
                focusNode=parent.left;
            }
            if (cmp<=0 && cm>=0) {
                System.out.println(parent.key+" ");
            }
            if (cm>0) {
               focusNode=parent.right; 
            }
        }
    }

    // public void inOrderTraverseTree(Node focusNode) {

    //     if (focusNode != null) {


    //         inOrderTraverseTree(focusNode.left);

    //         System.out.println(focusNode);

    //         inOrderTraverseTree(focusNode.right);

    //     }

    // }

  
    public static void main(String[] args) { 
        BST <String, Integer> theTree = new BST <String, Integer>();
        theTree.put("ABDUL",1);
        theTree.get("ABDUL");
        theTree.put("HRITHIK",2);
        theTree.put("SAI",3);
        theTree.put("SAMAL",6);
        theTree.get("SAI");
        theTree.put("TASHI",4);
        System.out.println( theTree.size());
        System.out.println( theTree.min());
        System.out.println(theTree.floor("HRITHIK"));
        theTree.put("CHIMI",5);
        theTree.put("SAMAL",4);
        theTree.get("SAMAL");
        theTree.put("NIMA",7);
        System.out.println( theTree.size());
        System.out.println( theTree.floor("CHIMI"));
         theTree.put("SONAM",8);
         theTree.key("ABDUL","TASHI");
    }
}