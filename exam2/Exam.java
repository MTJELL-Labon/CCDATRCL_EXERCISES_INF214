// Binary Tree in Java
public class Exam {

    public static void main(String[] args) {

        // Do not remove
        Node A;
        Node B;
        Node C;
        Node D;
        Node E;
        Node F;
        Node G;
        Node H;
        Node I;

        // Part 1: Binary Tree Traversal
        // Print the required string pattern by constructing a binary tree and traverse
        // each node using a specific traversal method.

        System.out.println("1. Print the last six digits of your student number using IN-ORDER Traversal");

        // Populate each node with the last six digits of your student number
        //A LEFT OF B 
        A = new Node('1');
        //B LEFT OF D
        B = new Node('0');
        //C RIGHT OF B
        C = new Node('1');
        //D is root
        D = new Node('9');
        //E LEFT OF F
        E = new Node('1');
        //F RIGHT OF D
        F = new Node('4');

        D.left = B;
        D.right = F;

        B.left = A;
        B.right = C;

        F.left = E;
        System.out.println("In order Answer: ");
        traverseInOrder(D);

        // ===========================================================================================
        System.out.println("");
        System.out.println("2. Print last six digits of your student number using PRE-ORDER Traversal");

        // Populate each node with the last six digits of your student number
        //A IS ROOT
        A = new Node('1');
        //B LEFT OF A
        B = new Node('0');
        //C LEFT OF B
        C = new Node('1');
        //D RIGHT OF B
        D = new Node('9');
        //E RIGHT OF A
        E = new Node('1');
        //F LEFT OF E
        F = new Node('4');
        
        A.left = B;
        A.right = E;

        B.left = C;
        B.right = D;

        E.left = F;

        System.out.println("Pre order Answer: ");
        traversePreOrder(A);

        // ===========================================================================================
        System.out.println("");
        System.out.println("3. Print last six digits of your student number using POST-ORDER Traversal");

        // Populate each node with the last six digits of your student number
        //A LEFT OF C
        A = new Node('1');
        //B RIGHT OF C
        B = new Node('0');
        //C LEFT OF F
        C = new Node('1');
        //D LEFT OF E
        D = new Node('9');
        //E RIGHT OF F
        E = new Node('1');
        //F IS ROOT
        F = new Node('4');

        F.left=C;
        F.right=E;

        C.left=A;
        C.right=B;

        E.left=D;
        
        System.out.println("Post order Answer: ");
        traversePostOrder(F);
        // ===========================================================================================
        // Part 2: Binary Expression Tree
        // Print the expression by constructing a binary expression tree and traverse
        // each node using INORDER traversal

        System.out.println("");
        System.out.println("4. Print the expression \"(8 + 4) * (7 - 9)\" using IN-ORDER Traversal");
        //A LEFT OF B
        A = new Node('+');
        //B is ROOT
        B = new Node('*');
        //C RIGHT OF B
        C = new Node('-');
        //D LEFT OF A
        D = new Node('8');
        //E RIGHT OF A
        E = new Node('4');
        //F LEFT OF C
        F = new Node('7');
        //G RIGHT OF C
        G = new Node('9');

        B.left = A;
        B.right = C;

        A.left = D;
        A.right = E;

        C.left = F;
        C.right = G;

        System.out.println("Expression Answer: ");
        traverseInOrder(B);
        // ===========================================================================================
        System.out.println("");
        System.out.println("5. Print the expression \"5 / 8 + 3 - 6 * 1\" using IN-ORDER Traversal");
        //A LEFT OF B
        A = new Node('/');
        //B LEFT OF C
        B = new Node('+');
        //C IS ROOT
        C = new Node('-');
        //D RIGHT OF C
        D = new Node('*');
        //E LEFT OF A
        E = new Node('5');
        //F RIGHT OF A
        F = new Node('8');
        //G RIGHT OF B
        G = new Node('3');
        //H LEFT OF D
        H = new Node('6');
        //I RIGHT OF D
        I = new Node('1');

        C.left = B;
        C.right = D;

        B.left = A;
        B.right = G;

        A.left = E;
        A.right = F;
        
        D.left = H;
        D.right = I;
        System.out.println("Expression Answer: ");
        traverseInOrder(C);
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

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
