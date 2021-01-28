package Trainee;

public class Trainee {
	private int traineeId;
	private String traineeName;
	private int contactNo;
	private String emailId;
	private String gender;
	private int age;
	public Trainee(int traineeId, String traineeName, int contactNo, String emailId, String gender, int age) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.gender = gender;
		this.age = age;
	}
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", contactNo=" + contactNo
				+ ", emailId=" + emailId + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	

}
