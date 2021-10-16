public class MyLinkedList {
    public INode tail;
    public INode head;

    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }

    public void add(INode newNode) {
       if (this.tail == null){
           this.tail=newNode;
       }
       if (this.head == null){
           this.head =newNode;
       }
       else {
           INode tempNode=this.head;
           this.head=newNode;
           this.head.setNext(tempNode);
       }
    }

    public void printMyNodes(){
        StringBuffer myNodes=new StringBuffer("My Nodes :");
         INode tempNode=head;
         while (tempNode.getNext() != null){
             myNodes.append(tempNode.getKey());
             if (!tempNode.equals(tail)) myNodes.append("->");
             tempNode=tempNode.getNext();
         }
         myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void append(INode myNode) {
        if (this.head == null){
            this.head=myNode;
        }
        if (this.tail == null){
            this.tail=myNode;
        }
        else {
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }

    public void insert(INode myNode,INode newNode) {
        INode tempNode =myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop(INode myNode) {
    INode tempNode=this.head;
    this.head=head.getNext();
    return tempNode;
    }

    public INode popLast(INode myNode){
        INode tempNode =head;
        while (!tempNode.getNext().equals(tail)){
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode=tempNode.getNext();
        return tempNode;
    }

    public void searchMyNode() {
        INode tempNode = head;
        int position = 0;
        while (tempNode != null) {
            position++;
            if (tempNode.getKey().equals(30)) {
                System.out.println("Your Node With Key value 30 is present at " +position+ " in the list");
            }
            tempNode = tempNode.getNext();
        }
    }

    public void insert(int key, int position) {
        MyNode newNode = new MyNode(key);
        MyNode nodeAtPreviousIndex = (MyNode) head;
        for (int i = 0; i < position - 1; i++) {
            nodeAtPreviousIndex = (MyNode) nodeAtPreviousIndex.next;
        }
        newNode.next = nodeAtPreviousIndex.next;
        nodeAtPreviousIndex.next = newNode;
        System.out.println("After inserting a new node with key value " + key + " at position " + position + " : ");
    }

}
