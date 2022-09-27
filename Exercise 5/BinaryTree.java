public class BinaryTree {
    public static void main(String[] args) {

        // Create root node A
        Node Root = new Node("1 Labon");
        // Create node B
        Node VicePresident = new Node("2 Vice President");
        // Create node C
        Node Secretary = new Node("3 Secretary");
        // Create node D
        Node Manager = new Node("4 Managers");
        // Create node E
        Node CoManager = new Node("5 Co-Manager");
        // Create node F
        Node Employee = new Node("6 Employee");
        // Create node G
        Node Intern = new Node("7 Intern");

        // Set left and right child of root node A
        Root.left = VicePresident;
        Root.right = Secretary;

        // Set left and right child of node B
        VicePresident.left = Manager;
        VicePresident.right = CoManager;

        // Set left and right child of node C
        Secretary.left = Employee;
        Secretary.right = Intern ;

        
        System.out.print("\nIn order Traversal: ");
        traverseInOrder(Root);

        System.out.print("\nPre order Traversal: ");
        traversePreOrder(Root);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(Root);
    }
        static void traversePreOrder(Node node) { //
            if (node != null) { // If node is not equal to null
                System.out.print(" " + node.data); //then put data either
                traversePreOrder(node.left); // left
                traversePreOrder(node.right); //right
            }
        }
         // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    }



