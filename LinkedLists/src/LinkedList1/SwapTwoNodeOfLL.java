package LinkedList1;

public class SwapTwoNodeOfLL {
    public static LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head, int i, int j) {
        if(i > j){
            int temp = j;
            j = i;
            i = temp;
        }
        LinkedListNode<Integer> prevI = null, prevJ = null;
        LinkedListNode<Integer> currI = head, currJ = head;
        LinkedListNode<Integer> nextI = currI.next, nextJ = currJ.next;

        int count = 0;

        while (count < i) {
            prevI = currI;
            currI = currI.next;
            nextI = currI.next;
            count++;
        }

        count = 0;
        while (count < j) {
            prevJ = currJ;
            currJ = currJ.next;
            nextJ = currJ.next;
            count++;
        }
        if (j == (i+1)){
            if(i == 0){
                currJ.next = currI;
                head = currJ;
                currI.next = nextJ;
                return head;
            }
            prevI.next = currJ;
            currJ.next = currI;
            currI.next = nextJ;
            return head;
        }

        if (prevI != null) {
            prevI.next = currJ;
            currJ.next = nextI;
        } else {
            currJ.next = nextI;
            head = currJ;
        }

        if (nextJ != null) {
            prevJ.next = currI;
            currI.next = nextJ;
        } else {
            prevJ.next = currI;
            currI.next = null;
        }

        return head;
    }
}
