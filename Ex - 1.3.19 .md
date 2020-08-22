    Node p = first;
	Node temp = null;
    while(p.next!=null){
    temp = p;
    p = p.next;
    }
      temp.next = null;