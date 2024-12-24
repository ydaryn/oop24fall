package library;

public class DVD extends LibraryItem{
	 public int duration; //minute
	 public DVD(String title, String author, int year, int duration) {
		 super(title, author, year);
		 this.duration = duration;
		 }
	 
	 public int getDuration() {
		 return duration;
	 }
	 public void setDuration(int duration) {
		 this.duration=duration;
	 }
	 
	 @Override
	 public String getItemDetails() {
		 return "DVD"+super.toString()+", Duration: " +duration;
	 }
	 
	 @Override
	 public String toString() {
		 return getItemDetails();
	 }
}
