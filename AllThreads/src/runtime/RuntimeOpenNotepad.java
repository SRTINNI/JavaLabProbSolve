package runtime;

public class RuntimeOpenNotepad {

    public static void main(String args[]) throws Exception {
        Runtime.getRuntime().exec("notepad");//will open a new notepad  
    }
}
