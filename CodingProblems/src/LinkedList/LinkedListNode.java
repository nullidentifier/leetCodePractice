package LinkedList;

public class LinkedListNode {

	LinkedListNode next;
	int val;
	public LinkedListNode(int val){
		this.val=val;
		this.next=null;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	LinkedListNode head=deleteElement(headNode,3);
		printLinkedList(head);*/
		
	}
	
	
	/*public static LinkedListNode createLinkedList(int no){
		
		if(no>0){
		LinkedListNode head=new LinkedListNode(4);
		
		}
		return next;
	}*/

	
	//Printing the LinkedList
	public static void printLinkedList(LinkedListNode head){
		
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}
	
	
	//Deleting a Node greater than X 
	
	public static LinkedListNode deleteElement(LinkedListNode list, int x){
	
		LinkedListNode curr=list;
		if(curr==null){
			return null;
		}
		while(curr.next!=null)
		{
			if(curr.next.val>x){
				curr.next=curr.next.next;
		//		System.out.println(curr.val);

			}else{
				curr=curr.next;
			}
		}
		
		return list.val > x ? list.next : list;
		
	}
}
