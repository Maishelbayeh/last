package softwareProject;

import java.util.ArrayList;
import java.util.List;

public class Dr {

	private String medicalspecialtyName;
	

	public Dr(String medicalspecialtyName) {
		this.medicalspecialtyName = medicalspecialtyName;
		
	}

	public String getmedicalspecialtyName() {
		return medicalspecialtyName;
	}

	public void setmedicalspecialtyName(String medicalspecialtyName) {
		this.medicalspecialtyName = medicalspecialtyName;
	}



	public List<String> getmedicalspecialtyList() {
		List<String> medicalList = new ArrayList<String>();
		medicalList.add("Gynecologist ");
		medicalList.add("dentist");
		medicalList.add("Neurologist ");
		return medicalList;

	}

	}


