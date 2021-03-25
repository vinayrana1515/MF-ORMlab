package spellCheckerP;

public class TextEditor {
	private SpellCheck sc;
	
	public TextEditor(SpellCheck sc)
	{
		this.sc=sc;
	}
	
	public void spellChecker()
	{
		sc.display();
	}
}
