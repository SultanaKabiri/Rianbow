package polymorphism;

public class LanguageTest {
	
	public static void main(String[] args) {
		// create an object for the class of Language
		Language english = new Language ();
		english.commonLanguage();
		
		// to call the Overridden method
		// create an object of the Afghanistan Class
		Afghanistan afg = new Afghanistan ();
		afg.commonLanguage();
		// call the concrete method --> void method Afghanistan class
		afg.languageAfg();

	}

}
