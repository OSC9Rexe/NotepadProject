public class CreditsClass {
    NotepadClass notepadClass;
    String author = "This was complete program by Oscar Rodriguez.";

    //Constructor:
    public CreditsClass (NotepadClass notepadClass){
        this.notepadClass = notepadClass;
    }
    //This method prints author in the text area:
    public void printAuthor(){
        notepadClass.TextArea.setText(String.valueOf(author));
    }

}
