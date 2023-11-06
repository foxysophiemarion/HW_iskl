import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Data {

    //region fields
    /**
     * ArrayList fio
     * index 0 - surname
     * index 1 - lastname
     * index 2 - patronymic
     */
    private ArrayList fio = new ArrayList<>();
    /**
     * Дата рождения
     */
    private Date dateBirthday;
    /**
     * Номер телефона
     */
    private Long telNumber;
    /**
     * Пол
     */
    private String sex;

    //endregion

    //region constructor
    public Data() {
    }
    //endregion

    //region Getter and Setter
    public ArrayList getFio() {
        return fio;
    }

    public void setFio(String str) {
         this.fio.add(str);
    }

    public String getDateBirthday() {
        return dateBirthday.toString();
    }

    public void setDateBirthday(Date date) {
        this.dateBirthday = date;
    }

    public Long getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(Long telNumber) {
        this.telNumber = telNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    //endregion

    //region toString
    /**
     * Переопределяем toString
     * @return Фамилия Имя Отчество дата рождения телефон пол
     */
    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return fio.get(0) + " " +
                fio.get(1) + " " +
                fio.get(2) + " " +
                formatter.format(dateBirthday) + " " +
                telNumber + " " +
                sex + "\n\r";

    }
    //endregion
}
