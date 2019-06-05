package solution;

import node.Node;

public class Solution2 {

	 public Node copyRandomList(Node head) {
		 
		 if(head==null)
			 return null;
		 
		 Node cur = head;
		 while(cur != null) {
			 
			 Node copy = new Node(cur.val);
			 copy.next = cur.next;
			 cur.next = copy;
			 cur = cur.next.next;
		 }
		 
		 
		 cur = head;
		 while(cur!=null) {
			 
			 if(cur.random!=null) {
				 cur.next.random = cur.random.next;
			 }
			 
			 cur = cur.next.next;
			 
		 }
		 
		 cur = head;
		 
		 Node dummy = new Node(0);
		 Node copyPrev = dummy;
		 while(cur!=null) {
			 
			 copyPrev.next = cur.next;
			 cur.next = cur.next.next;
			 copyPrev = copyPrev.next;
			 cur = cur.next;
		 }
		 
		 return dummy.next;
	 }
	
}
