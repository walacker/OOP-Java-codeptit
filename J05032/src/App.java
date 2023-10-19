import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {

    static Scanner sc = new Scanner(System.in);
    static List<Person> list = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < n ; i++){
            list.add(new Person(sc.next(), sc.nextLine()));
        }

        list.sort((a,b) -> a.getBirthDate().compareTo(b.getBirthDate()));

        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(0));
        
    }
}

class Person{
    private String name;
    private Date birthDate;
    
    public Person(String name, String day) throws ParseException{
        this.name = name;
        this.birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString(){
        return name;
    }
}
