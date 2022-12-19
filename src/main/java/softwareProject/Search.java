package softwareProject;

public class Search {

	public String displaymedicalspecialty(Dr medicalspecialty) {

		if (medicalspecialty.getmedicalspecialtyList().contains(medicalspecialty.getmedicalspecialtyName())) {
			return medicalspecialty.getmedicalspecialtyName();
		}
		return null;

	}

	public String displayuser(user us) {
		if (user.getpatientList().contains(user.getUserName())) {
			return user.getUserName();
		}
		return null;	


	

	

}
}
