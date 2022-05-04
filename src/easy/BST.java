package src.easy;

public class BST {
    class Node
    {
        int data;
        Node right,left;

        Node(int data)
        {
            this.data =data;
            this.right =null;
            this.left = null;
        }
    }
    Node root = null;
    BST()
    {
        root = null;
    }
    BST(int data)
    {
//        Node newNode = ;
        root = new Node(data);
    }

    public void insert(int data)
    {
       root = actualInsert(root,data);
    }

    public Node actualInsert(Node root, int data)
    {
        Node newNode = new Node(data);
        if (root ==null)
        {
            root = newNode;
            return root;
        }

        if(data < root.data)
        {
            root.left  = actualInsert(root.left,data);
        }
        else if(data > root.data)
        {
            root.right = actualInsert(root.right,data);
        }
        else
        {
            System.out.println("Dublicate Not Allowed");
        }
        return root;
    }

     void inorder()
    {
        actualInorder(root);
    }

     void actualInorder(Node root)
    {
        if (root ==null)
        {
            return;
        }

        actualInorder(root.left);
        System.out.print(root.data+" ");
        actualInorder(root.right);
    }

    public static void main(String[] args) {
        BST b = new BST();
        b.insert(10);
        b.insert(1);
        b.insert(12);
        b.insert(5);
        b.insert(15);
        b.insert(9);
        b.insert(11);
        b.inorder();
    }

}
