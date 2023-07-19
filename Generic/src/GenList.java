public class GenList <T>{
    private T[] a;
    private int index=-1;
    


	public GenList(T[] a) {
		
		this.a = a;
		
	}
   

    public boolean isEmpty(){
        return index==-1;
    }
    private boolean isFull() {
        return index==9;
    }

    
    
    public void printList() {
    	for(T i:a) {
    		System.out.println(i);
    	}
    }

    public void addAtThebeg(T element){
       
       if(index!=-1) {
           for(int i=index;i>=0;i--) {
        	   a[i+1]=a[i];
           }
           a[0]=element;
           index++;
       }
    	   
    	
       

    }
    public void append(T element){
        if(!isFull())
            a[++index]=element;
        else
            throw new RuntimeException("Bag Overflow");
    }

    public void insertAtPosition(int position,T element){
        if(position<=index && position >=0){
            for(int i=0;i>position;i--)
                a[i]=a[i-1];
            a[position]=element;
        }
    }

    public void deleteFromEnd(){
    	this.index--;
    }
    public void deleteFirst() {
    	 for(int i=a.length-1;i>0;i--)
    		 a[i-1]=a[i];
    }
    public void delete(T element) {
    	for(int i=0;i<this.index;i++) {
    		if(a[i]==element) {
    			a[i]=null;
    		}
    		
    			
    	}
    	throw new RuntimeException("Element does not exist");
    		
    }
    
    
    public static void main(String[] args) {
		GenList<Integer> gl=new GenList<Integer>(new Integer[15]);
		gl.a[0]=15;
		gl.index++;
		for(int i=0;i<10;i++)
			gl.addAtThebeg(i*10);
			gl.append(7);
			gl.insertAtPosition(2, 6);
			
		gl.printList();
	}
}
