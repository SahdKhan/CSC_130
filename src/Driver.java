class Node
{
    private int value;
    private Node next;

    public Node (int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public void setNext(Node n)
    {
        next = n;
    }

    public Node getNext()
    {
        return next;
    }

}

class LList
{
    private Node head;

    public void add(int value)
    {
        Node nn = new Node(value);
        nn.setNext(head);
        head = nn;
    }
    void traverse()
    {
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.getValue());
            curr=curr.getNext();
        }
    }
    void delete(int value)
    {
        if (head != null)
            if (head.getValue() == value)
                head = head.getNext();
            else {
                Node curr = head;
                while (curr.getNext()!=null && curr.getNext().getValue()!= value)
                    curr = curr.getNext();
                if (curr.getNext()!= null)
                curr.setNext(curr.getNext().getNext());
            }
    }
}

public class Driver {
    public static void main(String[] args) throws Exception
    {
        LList L1 = new LList();
        L1.add(52);
        L1.add(12);
        L1.add(33);
        L1.traverse();
        L1.delete(12);
        L1.traverse();
    }
}
