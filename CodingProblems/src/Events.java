import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


 class Event{
	int Eid;
	int locationX, locationY;
	ArrayList<Integer> price = new ArrayList<Integer>();
	int dist;

	public Event(int id,int X, int Y, ArrayList<Integer> pr){
		Eid = id;
		locationX = X;
		locationY = Y;
		price = pr;
	}
	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public int getLocationX() {
		return locationX;
	}

	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}

	public int getLocationY() {
		return locationY;
	}

	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}

	public ArrayList<Integer> getPrice() {
		return price;
	}

	public void setPrice(ArrayList<Integer> price) {
		this.price = price;
	}

	public int getDist() {
		return dist;
	}

	public void setDist(int dist) {
		this.dist = dist;
	}
	
	public static void main(String[] args){
		int min = 0;
		Scanner sc = new Scanner(System.in);
		int nEvents = Integer.parseInt(sc.nextLine());
		if(nEvents == 0){
			System.out.println("no events available");
		}else{
	    ArrayList<Event> events = new ArrayList<Event>();
		for(int i=0; i<nEvents; i++){
			String temp = sc.nextLine();
			String[] t = temp.split(" ");
			int id = Integer.parseInt(t[0]);
			int X = Integer.parseInt(t[1]);
			int Y = Integer.parseInt(t[2]);
			ArrayList<Integer> price = new ArrayList<Integer>();
		    {
			  for(int i1=3; i1<t.length && t[i1]!=null; i1++){
				  price.add(Integer.parseInt(t[i1]));
			  }
			}
			Event e = new Event(id, X, Y, price);
			events.add(e);
		}
		int mBuyers = Integer.parseInt(sc.nextLine());
		System.out.println(mBuyers);
		ArrayList<Buyers> buyers = new ArrayList<Buyers>();
	    for(int i2=0; i2<mBuyers; i2++){
			String temp = sc.nextLine();
			System.out.println(temp);
			String t[] = temp.split(" ");
			int xpos = Integer.parseInt(t[0]);
			int ypos = Integer.parseInt(t[1]);
			Buyers b = new Buyers(xpos,ypos);
			buyers.add(b);
			System.out.println("Buyers Added with X and Y "+xpos+" "+ypos);
		}
	for(int m=0; m<buyers.size(); m++){
	/*	for(int n=0; n<events.size(); n++){
			if(n==0){
				min = Math.abs(buyers.get(m).UX-events.get(n).locationX)+Math.abs(buyers.get(m).UY-events.get(n).locationY);
			    buyers.get(m).eid = events.get(n).Eid;
			    Collections.sort(events.get(n).price);
			    buyers.get(m).price = events.get(n).price.get(0);
			}
			else{
				int MD = Math.abs(buyers.get(m).UX-events.get(n).locationX)+Math.abs(buyers.get(m).UY-events.get(n).locationY);
			    if(MD < min){
			    	min = MD;
			    	 buyers.get(m).eid = events.get(n).Eid;
					 Collections.sort(events.get(n).price);
					 buyers.get(m).price = events.get(n).price.get(0);
			    }
			}
		}*/
		
		ArrayList<Event> nearestEvent = getNearestEvents(buyers.get(m),events);
		int[] eventTogo=findCheapestTicket(nearestEvent);
		//find the cheapest tickter here
		for(int i=0; i<events.size(); i++){
			if(buyers.get(m).eid == events.get(i).Eid){
				events.get(i).price.remove(0);
			}
			if(events.get(i).price.isEmpty()){
				events.remove(i);
			}
		}
	}
	for(int i=0; i<buyers.size(); i++){
		System.out.println("Buyer:"+(i+1)+" Event: "+buyers.get(i).eid+" Price: "+buyers.get(i).price);;
	}
		}
	System.out.println("Done");
	}	
	
	public static ArrayList<Event> getNearestEvents(Buyers b, ArrayList<Event> events ){
		ArrayList<Event> nearestEvents=new ArrayList<>();
		for(int i=0;i<events.size();i++){
		int	min = Math.abs(b.UX-events.get(i).locationX)+Math.abs(b.UY-events.get(i).locationY);	
		events.get(i).setDist(min);
		
		
		}
		//Database.arrayList.sort((o1, o2) -> o1.getStartDate().compareTo(o2.getStartDate()));
		//Collections.sort(studList, Comparator.comparing(Student::getFirstName))
	//	events.sort((o1,o2) -> o1.getDist().compareTo(o2.getDist()));
		Collections.sort(events, Comparator.comparing(Event::getDist));
		int minDist=events.get(0).getDist();
		for(int j=1;j<events.size();j++){
			int dist=events.get(j).getDist();
			if(dist<=minDist){
				nearestEvents.add(events.get(j));
			}
		}
		
		return nearestEvents;
		
	}
	
	public static int[] findCheapestTicket(ArrayList<Event>nearestEvents){
		int dist = nearestEvents.get(0).getDist();
		Collections.sort(nearestEvents, Comparator.comparing(Event::getEid));
		Event finalEvent = nearestEvents.get(0);
		int minprice=Integer.MAX_VALUE;
		for(int i=0;i<finalEvent.getPrice().size();i++){ //finding cheapeast ticket
			int pr = finalEvent.getPrice().get(i);
			if(pr<minprice){
				minprice=pr;
			}
		}
		
		int[] eventTogo= {finalEvent.getEid(),minprice};
		return eventTogo;
		
	}

	
}

class Buyers{
	int UX, UY, eid, price;
	public Buyers(int X, int Y){
		this.UX = X;
		this.UY = Y;
	}
}
