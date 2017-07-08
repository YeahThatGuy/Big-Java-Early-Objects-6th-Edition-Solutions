package Review3;

//E3.14

public class LetterPrinter {
    
    public static void main(String args[] ) {
        
        Letter sample = new Letter("Jack", "Mary");
        sample.addLine("Dear " + sample.getRecipient());
        sample.addEmplyLine();
        sample.addLine("I'm writing this letter to let you know");
        sample.addLine("That life is good.");
        sample.addEmplyLine();
        sample.addLine("Sincerely");
        sample.addEmplyLine();
        sample.addLine("" + sample.getSender());
        
        System.out.println(sample.getText());
        
    }
    
}