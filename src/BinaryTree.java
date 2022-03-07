public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }


    public void printPreOrder(Node node)
    {
        if (node == null) {
            return;
        }

        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printInOrder(Node node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }

    void printPostOrder(Node node)
    {
        if (node == null) {
            return;
        }
        
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }

}