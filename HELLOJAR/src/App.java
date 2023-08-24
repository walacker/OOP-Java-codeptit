import java.util.ArrayList;
import java.util.Scanner;
import view.InvoiceView;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class PaymentController {

    public static Scanner sc = new Scanner(System.in);

    private final Invoice invoice;
    private final Student student;
    private final ArrayList<Subject>subjecs;
    private final Rule rule;

    public PaymentController(){
        this.student = getStudent();
        this.subjecs = getSubjects();
        this.rule = getRule();
        this.invoice = setInvoice();
    }
    public Invoice getInvoice(){
         return this.invoice;
    }
    private Student getStudent(){
        String studentCode = sc.nextLine();
        String studentName = sc.nextLine();
        return new Student(studentCode, studentName);
    }
    private ArrayList<Subject> getSubjects(){
        ArrayList<Subject>subjecsList = new ArrayList<>();
        int numOfSubjects = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < numOfSubjects; ++i){
            subjecsList.add(getSubject());
        }
                
        return subjecsList;
    }
    private Subject getSubject(){
        String nameSubject = sc.nextLine();
        String codeSubject = sc.nextLine();
        int creditSubject = Integer.parseInt(sc.nextLine());
        return new Subject(codeSubject,nameSubject,  creditSubject);
    }
    private Rule getRule(){
        String codeRule = sc.nextLine();
        String nameRule = sc.nextLine();
        double creditPrice = Double.parseDouble(sc.nextLine()) * getCredits();
        return new Rule(codeRule, nameRule, creditPrice);
    }
    private int getCredits(){
        int count = 0;
        for(Subject subject : this.subjecs){
            count += subject.getCredit();
        }
        return count;
    }
    private Invoice setInvoice(){
        Invoice invoice = new Invoice(this.rule);
        invoice.setAlSubject(this.subjecs);
        invoice.setAmount(this.rule.getCreditPrice());
        invoice.setSt(this.student);
        return invoice;
    }
    
}
public class App {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
    public static void main5666952(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
