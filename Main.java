class Main{
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.add(10);
        linkList.add(20);
        linkList.add(30);
        linkList.add(40);
        linkList.add(50);

        linkList.displayLinkList();
        
        System.out.println("Now we are swiping link list");
        
        linkList.swapNodes(20, 30);
        linkList.displayLinkList();
    }
}