package exercises.mylist;

public class MyLinkedList extends MyAbstractList {
    private int size;
    private MyLinkedListNode head;

    public MyLinkedList(){
        size = 0;
        head = null;
    }

    @Override
    public void add(Object o) {
        head = new MyLinkedListNode(o, head);
        size++;
    }

    @Override
    public void add(Object o, int i) {
        checkBoundaries(i, size);
        if(i == 0){
            head = new MyLinkedListNode(o, head);
        }
        else {
            MyLinkedListNode current = getNodeIndex(i - 1);
            current.setNext(new MyLinkedListNode(o,current.getNext()));
        }
        size++;
    }

    private MyLinkedListNode getNodeIndex(int i){
        MyLinkedListNode current = head;
        for (int j = 0; j < i; j++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void remove(int i) {
        checkBoundaries(i, size-1);
        if(i == 0){
            head = head.getNext();
        }
        else{
            MyLinkedListNode current = getNodeIndex(i - 1);
            current.setNext(current.getNext().getNext());
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        checkBoundaries(i, size);
        MyLinkedListNode current = getNodeIndex(i);
        return current.getPayload();
    }


}
