package solution;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headB == null || headA == null)
			return null;

		ListNode pA = headA;
		ListNode pB = headB;
		boolean pAend = false;
		boolean pBend = false;

		while (true) {

			if (pA == pB)
				return pA;

			if (pA.next == null) {

				if (!pAend) {
					pA = headB;
					pAend = true;
				} else
					return null;
			} else
				pA = pA.next;

			if (pB.next == null) {

				if (!pBend) {
					pB = headA;
					pBend = true;
				} else
					return null;

			} else
				pB = pB.next;

		}
	}
}