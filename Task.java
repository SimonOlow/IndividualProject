package todolist;

public class Task {

	private String number;
	private String title;
	private String date;
	private String status;
	private String projectID;
	
	
	public Task() {
		
	}
	
	public Task(String number, String title, String date, String status, String id) {
		this.number = number;
		this.title = title;
		this.date = date;
		this.status = status;
		this.projectID = id;
	}
	
	

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDone() {
		return status;
	}
	
	public void setDone(String done) {
		this.status = done;
	}
	
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String id) {
		this.projectID = id;
	}
	
	 /**
     * Return a string containing details of the task
     * @return A string giving details of the task.
     */
    public String getDetails() 
    {
        return number + 
               ", title = " + title + 
               ", date = " + date + 
               ", status = " + status + 
               ", projectID = " + projectID ;
    }
}
