/** a binary search tree class for Lab 3, part 2: Recursion on Trees*/
public class BST {
    public Node root;

    /** constructor: create an empty BST */
    public BST() {
        root = null;
    }

    /* return true iff Node n is a leaf node. a null node is not considered
     * a leaf. */
    private boolean isLeaf(Node n) {
        return false; //TODO
    }

    /** return the number of nodes in the tree */
    public int size() {
        return size(root);
    }

    /* number of nodes in the tree rooted at n
     * = 0 if n is null
     * = 1 + number of nodes in left + number of nodes in right */
    private int size(Node n) {
        return 0; // TODO
    }


    /** print the values in the tree using an in-order traversal */
    public void inOrder() {
        inOrder(root);
        System.out.println();
    }
    private void inOrder(Node n) {
        // TODO
    }


    /** print the values in the tree using a pre-order traversal */
    public void preOrder() {
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node n) {
        // TODO
    }

    /** print the values in the tree using a post-order traversal */
    public void postOrder() {
        postOrder(root);
        System.out.println();
    }
    private void postOrder(Node n) {
        //TODO
    }

    /** return the height of the tree.
     *  recall that the height is the path length from the deepest leaf to the
     *  root. special case: an empty tree (root == null) is defined to have
     *  height = -1 */
    public int height() {
        return height(root);
    }

    /* return the height of the tree rooted at n */
    private int height(Node n) {
        return 0; // TODO
    }



    /** inner class representing a node in the tree. */
    public class Node {
        public int value;
        public Node parent;
        public Node left;
        public Node right;

        /** constructor: gives default values to all fields */
        public Node() { }

        /** constructor: sets only value */
        public Node(int v) {
            value = v;
        }

        /** constructor: sets value and parent fields */
        public Node(int v, Node p) {
            value = v;
            parent = p;
        }

        /** constructor: sets all fields */
        public Node(int v, Node p, Node l, Node r) {
            value = v;
            parent = p;
            left = l;
            right = r;
        }
    }

    /* main method implements tests for the BST methods above.
     * helper methods for testing are written below main(). */
    public static void main(String[] args) {
        System.out.println("Test case 0");
        BST test0 = new BST(0);
        testCase("test0.isLeaf(test0.root)", test0.isLeaf(test0.root), false);
        testCase("test0.size()", test0.size(), 0);

        System.out.print("test0.inOrder() should print nothing: ");
        test0.inOrder();
        System.out.print("test0.preOrder() should print nothing: ");
        test0.preOrder();
        System.out.print("test0.postOrder() should print nothing: ");
        test0.postOrder();

        testCase("test0.height()", test0.height(), -1);
        System.out.println();


        BST test1 = new BST(1);
        System.out.println("Test case 1");
        test1.printTree();
        testCase("test1.isLeaf(test1.root)", test1.isLeaf(test1.root), true);
        testCase("test1.isLeaf(test1.root.left)", test1.isLeaf(test1.root.left), false);

        testCase("test1.size()", test1.size(), 1);

        System.out.print("test1.inOrder() should print 4: ");
        test1.inOrder();
        System.out.print("test1.preOrder() should print 4: ");
        test1.preOrder();
        System.out.print("test1.postOrder() should print 4: ");
        test1.postOrder();

        testCase("test1.height()", test1.height(), 0);
        System.out.println();

        BST test2 = new BST(2);
        System.out.println("Test case 2");
        test2.printTree();
        testCase("test2.isLeaf(test2.root)", test2.isLeaf(test2.root), false);
        testCase("test2.isLeaf(test2.root.left)", test2.isLeaf(test2.root.left), true);
        testCase("test2.isLeaf(test2.root.right)", test2.isLeaf(test2.root.right), true);

        testCase("test2.size()", test2.size(), 3);

        System.out.print("test2.inOrder() should print 2 4 6: ");
        test2.inOrder();
        System.out.print("test2.preOrder() should print 4 2 6: ");
        test2.preOrder();
        System.out.print("test2.postOrder() should print 2 6 4: ");
        test2.postOrder();

        testCase("test2.height()", test2.height(), 1);
        System.out.println();


        BST test3 = new BST(3);
        System.out.println("Test case 3:");
        test3.printTree();
        testCase("test3.isLeaf(test3.root)", test3.isLeaf(test3.root), false);
        testCase("test3.isLeaf(test3.root.left)", test3.isLeaf(test3.root.left), true);
        testCase("test3.isLeaf(test3.root.right)", test3.isLeaf(test3.root.right), false);
        testCase("test3.isLeaf(test3.root.right.right.right.right)",
                  test3.isLeaf(test3.root.right.right.right.right), true);

        testCase("test3.size()", test3.size(), 6);

        System.out.print("test3.inOrder() should print 2 4 6 7 8 9: ");
        test3.inOrder();
        System.out.print("test3.preOrder() should print 4 2 6 7 8 9: ");
        test3.preOrder();
        System.out.print("test3.postOrder() should print 2 9 8 7 6 4: ");
        test3.postOrder();

        testCase("test3.height()", test3.height(), 4);

    }

    /* methods for testing */

    /** constructor: constructs various BST instances for testing */
    public BST(int testCase) {
        switch(testCase) {
            case 0:
                root = null;
                break;
            case 1:
                root = new Node(4);
                break;
            case 2:
                root = new Node(4);
                root.left = new Node(2);
                root.right = new Node(6);
                break;
            case 3:
                root = new Node(4);
                root.left = new Node(2);
                root.right = new Node(6);
                root.right.right = new Node(7);
                root.right.right.right = new Node(8);
                root.right.right.right.right = new Node(9);
                break;
        }
    }

    /* print result of a test case - overloaded for int methods */
    private static void testCase(String call, int was, int shouldBe) {
      System.out.println(call + " should be " + shouldBe + ", was " + was);
    }

    /* print result of a test case - overloaded for String methods */
    private static void testCase(String call, String was, String shouldBe) {
      System.out.println(call + " should be " + shouldBe + ", was " + was);
    }

    /* print result of a test case - overloaded for boolean methods */
    private static void testCase(String call, boolean was, boolean shouldBe) {
      System.out.println(call + " should be " + shouldBe + ", was " + was);
    }

    /** print a sideways representation of the tree - root at left,
     * right is up, left is down. */
    public void printTree() {
        printSubtree(root, 0);
    }
    private void printSubtree(Node n, int level) {
        if (n == null) {
            return;
        }
        printSubtree(n.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("        ");
        }
        System.out.println(n.value);
        printSubtree(n.left, level + 1);
    }
}
