package DSA.src.com.sorting;

import java.util.Arrays;

public class LLleetcode {

    static void main(String[] args) {
//        String a="darshan";
//        String b="darshan";
//        String c=new String("darshan");
//        String d=new String("darshan");
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(d==c);
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(c.hashCode());
//        System.out.println(d.hashCode());
        int[] arr = {5, 4, 3, 2, 1};
        int[] ints = Arrays.copyOfRange(arr, 0, 2);
        System.out.println(Arrays.toString(ints));


    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;

        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;

        return head;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head); //876
        ListNode headSecond = reverseList(mid); //206
        ListNode reReverseHead = headSecond;

        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;

        }
        reverseList(reReverseHead);
        return head == null || headSecond == null;

    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }

        }
        return prev;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome1(ListNode head) {

        if (head == null || head.next == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode node = head;
        ListNode rev = reverse(slow.next);

        while (rev != null) {
            if (node.val != rev.val)
                return false;
            rev = rev.next;
            node = node.next;
        }

        return true;

    }

    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = middleNode(head);
        ListNode second = reverseList(mid);
        ListNode first = head;

        while (first != null && second != null) {
            ListNode temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
        if (first != null) {
            first.next = null;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        ListNode last = head;
        int length = 1;

        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int rotation = k % length;
        int skip = length - rotation;
        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


