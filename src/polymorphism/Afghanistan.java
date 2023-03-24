package polymorphism;

public class Afghanistan extends Language {
	
	// a method which display the country language
	// Concrete method 
	public void languageAfg() {
		System.out.println("They're speaking their national languages!");
	}
	
	// extends keyword --> to override the method 
	// Overridden method --> copy --> Run Time JVM 
	
	@Override
	public void commonLanguage() {
		System.out.println("Here in Afghanistan, English is a second langauge!");
	}

}
