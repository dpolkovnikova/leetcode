package leet.code.add.two.numbers;

import java.util.LinkedList;

public class ListNode {
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

    public void display() {
        LinkedList<Integer> numbers = new LinkedList<>();
        ListNode currentNode = this;
        while (currentNode != null) {
            numbers.addLast(currentNode.val);
            currentNode = currentNode.next;
        }
        System.out.println(numbers);
    }
}
