/*



Given a binary tree, print each level average.
example

input =1 2 3 4 5 6 7
output =1 2.5 5.5

binary tree
     1
    / \
   2   3
  / \ / \
 4  5 6  7
 1st level average is 1
 2nd level average is (2+3)/2=2.5
 3rd levle average is (4+5+6+7)/4=5.5


input =12 7 1 9 2 10 5
output =12.0 4.0 6.5




*/


import java.util.*;
class BinaryTreeNode{
	public int data; 
	public BinaryTreeNode left, right; 
    static BinaryTreeNode root;
	public BinaryTreeNode(int data){
		this.data = data; 
		left = null; 
		right = null; 
	}
 
	void insert(BinaryTreeNode temp, int key)
	{
        if (temp == null) {
            root = new BinaryTreeNode(key);
            return;
        }
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(temp);
 
        // Do level order traversal until we find an empty place.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
 
            if (temp.left == null) {
                temp.left = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.left);
 
            if (temp.right == null) {
                temp.right = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.right);
        }
    }
}

class Test {

	static BinaryTreeNode root;
	static BinaryTreeNode temp = root;

	  public static List<Double> findLevelAverages(BinaryTreeNode root) {
	        //write your code here
	        List<Double> l=new ArrayList<>();
	        if(root==null)
	            return l;
	        Queue<BinaryTreeNode> q=new LinkedList<>();
	        q.offer(root);
	        while(!q.isEmpty()){
	            double sum=0;
	            int len=q.size();
	            for(int i=0;i<len;i++){
	                BinaryTreeNode cur=q.poll();
	                sum+=cur.data;
	                if(cur.left!=null)
	                    q.offer(cur.left);
	                if(cur.right!=null)
	                    q.offer(cur.right);

	            }
	            double avg=sum/len;
	            l.add(avg);
	        }
	        return l;
	  }


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str[]=sc.nextLine().split(" ");
		BinaryTreeNode bt=new BinaryTreeNode(Integer.parseInt(str[0]));
		root=bt;
		for(int i=1; i<str.length; i++){
			if(str[i]!=null)
		    	bt.insert(root,Integer.parseInt(str[i]));
		}
		List<Double> fin=findLevelAverages(root);
		for(Double d:fin)
		System.out.print(d+" ");
	}
}
 

