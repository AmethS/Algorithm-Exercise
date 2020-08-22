    boolean delete(int k){
	Node p = first;
	Node temp = null;
	for(int i = 0; i<k-1 ;i++){
		if(p.next = null) return false;
		temp = p;
		p = p.next;
	}
	temp.next = p.next;
	return = true;
}
		