
public class Database {
   private String filename;
    private int rowWidth;

    public Database(String filename, int rowWidth) {

       this.filename = filename;
        this.rowWidth = rowWidth;
    }
    public void appendRecord(String data) {

        Filehandler.appendLine(filename, data);
    }

    public void deleteRecord(int rowNumber) {

    }

    public String getRecord(int rowNumber) {
        return "";
    }

    public boolean findRecord(String data) {
        return false;
    }

}