package linkedlist;

public class AddTwoNumbers {
	
	/**
	 * You are given two non-empty linked lists representing two non-negative integers. 
	 * The digits are stored in reverse order and each of their nodes contain a single digit. 
	 * Add the two numbers and return it as a linked list.
	 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	 * Output: 7 -> 0 -> 8
	 * Explanation: 342 + 465 = 807.
	 */
	

	public static void main(String[] args) {
		
		//First linked list
		
		ListNode l11 = new ListNode();
		ListNode l12 = new ListNode();
		ListNode l13 = new ListNode();
		
		l11.val=10;
		l12.val=20;
		l13.val=30;
		
		l11.next=l12;
		l12.next=l13;
		l13.next=null;
		
		//Second linked list
		
		ListNode l21 = new ListNode();
		ListNode l22 = new ListNode();
		ListNode l23 = new ListNode();
		
		l21.val=1;
		l22.val=2;
		l23.val=3;
		
		l21.next=l22;
		l22.next=l23;
		l23.next=null;
		
		//Check if no of digits in two linked lists are same or not
		
		//Calling function to add
		ListNode l31 = addTwoNumbers(l11,l21);
		
		//Print output
		System.out.println(l31.val);

	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	
		// Use recursion. 
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        
        int lastDig = l1.val + l2.val;
        if (lastDig >= 10) {
            lastDig = lastDig % 10;
			if (l1.next == null && l2.next == null) {
				// If l1 and l2 only have one digit.
                ListNode tail = new ListNode(1, null);
                return new ListNode(lastDig, tail);
            } else if (l1.next == null) {
				/* If l2 is longer than l1. Let l1.next store the additional "1" caused by addition. 
				Notice that it's only possible to carry on the number 1, because 9 + 9 = 18. */ 
                l1.next = new ListNode(1, null);
            } else if (l2.next == null) {
				// If l1 is longer than l2.
                l2.next = new ListNode(1, null);
            } else {
				 /* If l1 and l2 are of the same length. Modify l2.next: add the additional one to l2.next.val,
				 and leave the remaining part unchanged. Quiz: Could you use another statement rather than this one? */
                l2.next = new ListNode(1 + l2.next.val, l2.next.next);
            }
        }
		/* recursive call */
        return new ListNode(lastDig, addTwoNumbers(l1.next, l2.next));
	}

}

//Definition for singly-linked list.

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
