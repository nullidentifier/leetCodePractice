package Trees;

import java.util.Stack;

public class serializaTree {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String serialize(Node root){
		if(root==null)
			return null;
		Stack<Node> stack=new Stack<Node>();
		//Stack.push(root);\Stack
		stack.push(root);
		
		StringBuilder sb=new StringBuilder();
		while(!stack.isEmpty()){
			Node node=stack.pop();
			if(node!=null){
				sb.append(node.data+",");
				stack.push(node.right);
				stack.push(node.left);
			}else{
				sb.append("#");
			}
		}
		return sb.toString().substring(0,sb.length()-1);
	}


	//Deserialization
	public Node deserialize(String str){
		if(str==null)
			return null;
		int i=0;
		String[] arr =str.split(",");
		return helper(arr,i);
	}

	public Node helper(String[] arr, int i){
		if(arr[i].equals("#")){
			return null;
		}
		Node root = new Node(Integer.parseInt(arr[i]));
		//t[0]=t[0]+1;
		i++;
		root.left=helper(arr,i);
		//t[0]=t[0]+1;
		i++;
		root.right=helper(arr,i);
		return root;
	}
}


