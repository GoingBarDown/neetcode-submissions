class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this(value, null);
    }

    ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}

class LinkedList {
private ListNode head;
private ListNode tail;

    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = head;
    }

    public int get(int index) {
        ListNode current = this.head.next;
        int i = 0;

        while (current != null) {
        if (i == index) {
            return current.value;
        }
            current = current.next;
            i++;
        }
       
        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = this.head.next;
        this.head.next = newNode;
        if (newNode.next == null) {
            this.tail = newNode;
        }
    }

    public void insertTail(int val) {
        this.tail.next = new ListNode(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        ListNode current = this.head;
        int i = 0;

        while (i < index && current != null) {
            current = current.next;
            i++;
        }

        if (current != null && current.next != null) {
            if (current.next == tail) {
                this.tail = current;
            }
            current.next = current.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode current = this.head.next;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }
        return list;

    }
}
