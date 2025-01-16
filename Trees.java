
public class Trees{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   static class BinaryTrees{
   static int idx =-1;
    public static Node builtTrees(int nodes[]){
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
         Node newNode = new Node(nodes[idx]);
           newNode.left = builtTrees(nodes);
           newNode.right = builtTrees(nodes);
           return newNode;
    }
    public static void preOrder(Node root){
        if(root == null ){
             System.out.print("-1" + " ");
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
    if(root == null){
        return;
    }
          inOrder(root.left);
          System.out.print(root.data);
          inOrder(root.right);
   }
   public static void postOrder(Node root){
           if(root == null){
            return;
           }
           postOrder(root.left);
           postOrder(root.right);
           System.out.print(root.data);
           
   }
   
   }

   
    public static void main(String args[]){
       int nodes[] = {1, 2, 3, 4, -1, -1, 5, -1, -1, 3, -1, -1};
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.builtTrees(nodes);
        // tree.inOrder(root);
        tree.postOrder(root);
        // tree.preOrder(root);
        //  System.out.print(root.data);
    }
}