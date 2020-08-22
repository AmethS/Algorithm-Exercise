    boolean find(int k,String key){
	Node p = first;
	Node temp = null;
	while(p.item != key)
	p=p.next;
	if(p.next == null)
	return false;
	else return true;
}
		