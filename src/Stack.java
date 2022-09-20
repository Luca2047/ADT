
public class Stack {

	private ListenElement kopf;
	private ListenElement tmp;
	
	public Stack(int wert) {
		kopf= new ListenElement(wert);
	}
	
	public boolean isEmpty() {return true;}
	

	
	public void push(int wert) {
		tmp = kopf;
		kopf=new ListenElement(wert);
		kopf.add(tmp);
		
	}
	
	public void pop() throws Exception {

		System.out.println(kopf.getInhalt());
		kopf = kopf.getNext();
	}
	
	public void top() throws Exception {
		System.out.println(kopf.getInhalt());
	}
	
	public int getGroeﬂe(){
		return kopf.getGroesse(0);
	}
	
	public String toString() {
		return kopf.toString();
	}
}
