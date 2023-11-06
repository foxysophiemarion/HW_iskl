import java.io.FileWriter;

public class FileRecord {

    //region fields
    private String str;
    private Parser parser;
    //endregion

    //region Constructor
    public FileRecord(String str) {
        this.str = str;
        this.parser = new Parser(str);
    }
    //endregion

    //region Method of writing to a file
    public void recording(){
        try (FileWriter fileWriter = new FileWriter(parser.getData().
                getFio().
                get(0).
                toString() + ".txt", true)) {
            fileWriter.append(parser.getData().toString());
            System.out.println("Запись выполнена успешно!");
        }catch (Exception e){}
    }
    //endregion
}
