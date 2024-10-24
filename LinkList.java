public class LinkList {
    public Node head;

    public LinkList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
    
        if(this.head == null){
            this.head = newNode;
        }else{
            Node current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayLinkList() {
        Node current = this.head;

        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null \n");
    }

    public void swapNodes(int x, int y){
        if(x == y) return;

        Node prevX = null, currX = this.head;
        
        while(currX != null &&currX.data != x){
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = this.head;

        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if(currX == null || currY == null) return;

        if (prevX != null) {
            prevX.next = currY;
        }else{
            this.head = currY;
        }

        if(prevY != null) {
            prevY.next = currX;
        }else{
            this.head = currX;
        }

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
}
