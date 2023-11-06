import MyException.SizeMinException;
import MyException.SizeMaxException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class Parser {
    //region fields
    private Data data;
    private String str;
    //endregion

    //region Constructor
    public Parser(String str) {
        this.data = new Data();
        this.str = str;
        try {
            formatData(parsing(str));
        } catch (Exception e) {}

    }
    //endregion

    //region Method Parser разбивает строку по пробелам и проверяет размерность строки согласно ТЗ
    public  String[] parsing(String str) throws Exception{
        try {
            String [] arr;
            arr = str.split(" ");
            for (String temp:arr) {
                if(arr.length < 6){
                    throw new SizeMinException();
                }
                if(arr.length > 6){
                    throw new SizeMaxException();
                }
            }
            return arr;
        } catch (SizeMaxException e) {
            System.out.println("Введено больше данных чем требуется!");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Вы не ввели данные!");
            e.printStackTrace();
        }catch (SizeMinException e){
            System.out.println("Вы ввели меньше данных, чем требуется!");
            e.printStackTrace();
        }return null;
    }
    //endregion

    //region Method formatData определение формата данных
    public void formatData(String[]str) throws Exception{
        for (String temp:str){
            if(temp.length() > 1) {
                try {
                    if(temp.contains(".")){
                        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
                        data.setDateBirthday(df.parse(temp));
                        continue;
                    }
                    data.setTelNumber(Long.parseLong(temp));
                } catch (NumberFormatException e) {
                    data.setFio(temp);
                }catch (ParseException e){
                    System.out.println("Дата рождения введена в неверном формате!");
                    e.printStackTrace();
                }
            }else data.setSex(temp);
        }
    }
    //endregion

    //region Getters and Setters
    public Data getData() {
        return data;
    }
    //endregion
}
