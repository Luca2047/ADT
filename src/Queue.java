
public class Queue {

	
	private ListenElement kopf;
	private ListenElement tmp;
	
	public Queue(int wert) {
		kopf= new ListenElement(wert);
	}
	
	public boolean isEmpty() {return true;}
	

	
	public void enqeue(int wert) {
		tmp= new ListenElement(wert);
		kopf.add(tmp);
		
	}
	
	public void deque() throws Exception {


		kopf.remove();
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
