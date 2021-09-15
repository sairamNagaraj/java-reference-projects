package in.co.cockatiel.leetcode.easy;

import in.co.cockatiel.leetcode.medium.ListNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        if(l1==null && l2 == null){
            return dummy.next;
        }
        List<Integer> numList = new ArrayList<Integer>();
        ListNode curr = dummy;
        int largest = 0;
        int i =0;
        while(l1 != null || l2 != null) {
            if ((l1 != null)) {
                numList.add(l1.val);
                l1=l1.next;
            }
            if(l2 != null){
                numList.add(l2.val);
                l2=l2.next;
            }
        }
        Collections.sort(numList);
        for(int ix : numList){
            curr.next = new ListNode(ix);
            curr = curr.next;
        }
        return dummy.next;
    }
}
