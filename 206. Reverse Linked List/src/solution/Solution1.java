/****************************
 *  Iterative solution
 */
package solution;

import main.ListNode;

class Solution1 {
	public ListNode reverseList(ListNode head) {
	   
	    ListNode newHead = null;
	    while (head != null) {
	        ListNode next = head.next;
	        head.next = newHead;
	        newHead = head;
	        head = next;
	    }
	    return newHead;
	}
}