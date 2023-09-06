import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        //Scanner sc = new Scanner(System.in);
        List<Name> list = new ArrayList<>();
        while(sc.hasNext()) {
            list.add(Name.getName(sc));
        }

        list.sort((a,b) -> {
            if (!a.getFirstName().equals(b.getFirstName()))
                return a.getFirstName().compareTo(b.getFirstName());
            if (!a.getLastName().equals(b.getLastName()))
                return a.getLastName().compareTo(b.getLastName());
            return a.getMiddleName().compareTo(b.getMiddleName());
        });

        list.forEach(System.out::println);
    }
}

class Name{
    private String firstName,lastName,middleName;


    public Name(String[] name) {
        this.firstName = formatName(name[name.length - 1]);
        this.lastName = formatName(name[0]);
        this.middleName = formatName(String.join(" ", Arrays.copyOfRange(name, 1, name.length - 1)));
    }

    public String formatName (String name) {
        String[] s = name.trim().split("\\s+");
        String res = "";
        for (String i : s)
            res += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        return res;
    }

    public static Name getName(Scanner sc){
        return new Name(sc.nextLine().trim().split("\\s+"));
    }

    public String normalize(String s){
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    @Override
    public String toString() {
        return lastName  + middleName  + firstName;
    }
}