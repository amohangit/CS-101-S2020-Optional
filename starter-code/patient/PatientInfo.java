public class PatientInfo{
	public static void printPatientHeader(){
		System.out.println("Patient ID" + "\t" 
			+ "Patient Name" + "\t"
			+ "Admission Date"+ "\t"
			+ "Patient Disease" + "\t"
			+ "Discharge Date");
	}
	public static void printPatientDetails(Patient p){
		System.out.println(p.getPatientID() + "\t" 
			+ p.getPatientName() + "\t"
			+ p.getAdmissionDate() + "\t"
			+ p.getPatientDisease() + "\t"
			+ p.getDischargeDate());
	}
	public static void main(String[] args){
		/*
			Add the code to implement the patient objects here ..
		*/
	}
}