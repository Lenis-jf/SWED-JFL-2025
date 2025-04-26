package exercise1;

import java.util.ArrayList;

public class Developer {
	
	private String name;
	private int age;
	private String degree;
	private int yearsOfExperience;
	private ArrayList<String> programmingLanguages;
	
	public Developer() {
		this.name = "N/A";
		this.age = 0;
		this.degree = "N/A";
		this.yearsOfExperience = 0;
		this.programmingLanguages = new ArrayList<>();
		
		programmingLanguages.add("N/A");
	}
	
	public Developer(String name, int age, String degree, int yearsOfExperience, ArrayList<String> programmingLanguages) {
		this.name = name;
		this.age = age;
		this.degree = degree;
		this.yearsOfExperience = yearsOfExperience;
		this.programmingLanguages = new ArrayList<>(programmingLanguages);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != "" || name.length() > 0) {
			name = name.toLowerCase();
			
			for(int i = 0; i < name.length(); i++) {
				char currentChar = name.charAt(i);
				
				if(currentChar < 97 || currentChar > 122)
					return;
			}
			
			this.name = name;
			
		}
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 1)
			return;
		
		this.age = age;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		String[] posibleDegrees = {"bachelor", "master", "doctor"};
		
		degree = degree.toLowerCase();
		
		for(int i = 0; i < 3; i++)
			if(degree.equals(posibleDegrees[i])) {
				this.degree = degree;
				break;
			}
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		if(yearsOfExperience < 0)
			return;
		
		this.yearsOfExperience = yearsOfExperience;
	}

	public ArrayList<String> getProgrammingLanguages() {
		return programmingLanguages;
	}

	public void setProgrammingLanguages(ArrayList<String> programmingLanguages) {
		if(programmingLanguages.isEmpty())
			return;
		
		programmingLanguages.forEach(programmingLanguage -> {
			for(int i = 0; i < programmingLanguage.length(); i++) {
				char currentChar = programmingLanguage.charAt(i);
				
				if(currentChar < 97 || currentChar > 122)
					return;
			}
		});
		
		this.programmingLanguages = programmingLanguages;
	}

	@Override
	public String toString() {
		return "Developer:\nname: " + name + ",\nage: " + age + ",\ndegree: " + degree + ",\nyearsOfExperience: "
				+ yearsOfExperience + ",\nprogrammingLanguages: " + programmingLanguages + "\n";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer developer1 = new Developer();
		
		ArrayList<String> developer2_progLanguages = new ArrayList<>();
		developer2_progLanguages.add("Java");
		developer2_progLanguages.add("Python");
		developer2_progLanguages.add("JavaScript");
		developer2_progLanguages.add("C");
		developer2_progLanguages.add("C++");
		developer2_progLanguages.add("R");
		
		Developer developer2 = new Developer(
				"Juan Fernando Lenis Serna", 
				23, 
				"Bachelor", 
				2,
				developer2_progLanguages
			);
		
		System.out.println(developer1);
		System.out.println(developer2);
	}

}
