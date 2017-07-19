package Review3;

//E3.14

public class Letter {

    private String sender;
    private String recipient;
    private String letterText;

    public Letter(String from, String to) {
        sender = from;
        recipient = to;
        letterText = "";
    }

    public void addLine(String line) {
        letterText = letterText.concat(line).concat("\n");
    }

    public void addEmplyLine() {
        letterText = letterText.concat("\n");
    }

    public String getText() {
        return letterText;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }
}
