import java.util.Scanner;

public class ScannerInput {

    //region fields
    private String string;
    private Scanner scanner;
    private FileRecord fileRecord;
    //endregion

    //region constructor

    /**
     * Принимаем с консоли строку и запускаем обработку этой строки и ее запись в файл.
     */
    public ScannerInput() {
        this.scanner = new Scanner(System.in);
        System.out.println("Введите Фамилию Имя Отчество, дату рождения(в формате: дд.мм.гггг), номер телефона, пол");
        this.string = this.scanner.nextLine();
        this.fileRecord = new FileRecord(string);
        fileRecord.recording();
    }
    //endregion
}
