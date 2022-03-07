public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Nirayka's Binary Family Tree.");
        System.out.println("");
        BinaryTree tree = new BinaryTree();
        tree.root = new Node("Nirayka");
        tree.root.left = new Node("Mother");
        tree.root.right = new Node("Father");
        tree.root.left.left = new Node("Maternal Grandmother");
        tree.root.left.right = new Node("Maternal Grandfather");
        tree.root.right.left = new Node("Paternal Grandmother");
        tree.root.right.right = new Node("Paternal Grandfather");

        System.out.println("Traversal of the the tree (in PreOrder style) is as follows: ");
        tree.printPreOrder(tree.root);

        System.out.println("\nTraversal of the tree (in InOrder style) is as follows: ");
        tree.printInOrder(tree.root);

        System.out.println("\nTraversal of the tree (in PostOrder style) is as follows");
        tree.printPostOrder(tree.root);
    }
}