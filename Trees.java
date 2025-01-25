import java.util.*;
// public class Trees{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//    static class BinaryTrees{
//    static int idx =-1;
//     public static Node builtTrees(int nodes[]){
//         idx++;
//         if (idx >= nodes.length || nodes[idx] == -1) {
//                 return null;
//             }
//          Node newNode = new Node(nodes[idx]);
//            newNode.left = builtTrees(nodes);
//            newNode.right = builtTrees(nodes);
//            return newNode;
//     }
//     public static void preOrder(Node root){
//         if(root == null ){
//              System.out.print("-1" + " ");
//             return;
//         }
//         System.out.print(root.data + " ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }
//     public static void inOrder(Node root){
//     if(root == null){
//         return;
//     }
//           inOrder(root.left);
//           System.out.print(root.data);
//           inOrder(root.right);
//    }
//    public static void postOrder(Node root){
//            if(root == null){
//             return;
//            }
//            postOrder(root.left);
//            postOrder(root.right);
//            System.out.print(root.data);
           
//    }
//    public static void levelOrder(Node root){
//     if(root == null){
//         return;
//     }
//     Queue<Node> q = new LinkedList<>();
//    q.add(root);
//    q.add(null);
//     while(!q.isEmpty()){
//         Node currNode = q.remove();
//         if(currNode == null){
//             System.out.println();
//             if(q.isEmpty()){
//                 break;
//             }else{
//                 q.add(null);
//             }
//         }else{
//             System.out.print(currNode.data + " ");
//             if(currNode.left != null){
//                 q.add(currNode.left);
               
//             }
//             if(currNode.right != null){
//                 q.add(currNode.right);
               
//             }
//         }

//     }
//    }
   
//    }

   
//     public static void main(String args[]){
//        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6,-1,-1};
//         BinaryTrees tree = new BinaryTrees();
//         Node root = tree.builtTrees(nodes);
//         // tree.inOrder(root);
//         // tree.postOrder(root);
//         tree.levelOrder(root);
//         // tree.preOrder(root);
//         //  System.out.print(root.data);
//     }
// }



public class tree{
    // static class Node{
    //       int data;
    //       Node left;
    //       Node right;
    //       Node(int data){
    //         this.data = data;
    //         this.left = null;
    //         this.right = null;
    //       }
    // }


    
        // public static int maxHeight(Node root){
        //      if(root == null){
        //         return 0;
        //      }

        //      int lh = maxHeight(root.left);
        //      int rh = maxHeight(root.right);
        //      int max = Math.max(lh,rh)+1;
        //      return max;
        // }

        //   public static int count(Node root){
        //     if(root == null){
        //         return 0;
        //     }
        //     int lh = count(root.left);
        //     int rh= count(root.right);
        //     return lh + rh +1;

        //   }
        // public static int sumNode(Node root){
        //     if(root == null){
        //         return 0;
        //     }
        //     int leftData = sumNode(root.left);
        //     int rightData = sumNode(root.right);
        //     return leftData + rightData + root.data;

        // }

    // public static class Info {
    //     int diam;
    //     int ht;

    //     public Info(int diam, int ht) {
    //         this.diam = diam;
    //         this.ht = ht;
    //     }
    // }
    //        public static Info diameter(Node root){
    //           if(root == null){
    //             return new Info(0,0);
    //           }
    //             Info leftInfo = diameter(root.left);
    //             Info rightInfo = diameter(root.right);

    //             int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht + rightInfo.ht +1);
    //             int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
    //             return new Info(diam,ht);
    //         }

static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        Node node;
        int hd;

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        if (root == null) return;

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            // If horizontal distance is encountered for the first time
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }

            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);
            }
        }

        // Print the top view
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }
public static void kLevel(Node root, int level ,int k){
    if(root == null){
        return;
    }
    if(level == k){
        System.out.print(root.data);
        return;
    }
    kLevel(root.left,level+1, k);
    kLevel(root.right,level+1, k);
}
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("Top View: ");
        // topView(root);
        kLevel(root,1,3);
    }
}