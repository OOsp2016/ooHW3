package edu.txstate.simpleLibJJP66;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class TransactionCollection implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Transaction> record;
	
	public TransactionCollection(){
		record =  new ArrayList<Transaction>();
	}
		//adds a transaction to the list
	public void addTransaction(Transaction newTransaction){
		record.add(newTransaction);
	}
	//removes a transaction from the list
	public void removeTransaction(String user, String item){
		for (int i = 0; i < record.size(); i++) {
			Transaction t = record.get(i);
			if (t.getUser().equals(user)&&t.getBook().equals(item)) {
				record.remove(i);
			}
		}
		
	}
	//printing format
	@Override
	public String toString() {
		String total = "\n";
		
		for (int i=0; i<record.size(); i++){
			Transaction t = record.get(i);
			total = total + t.toString();
		}
		
		return total;
	}
	

}
