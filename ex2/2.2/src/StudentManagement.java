///NguyenNhatMinhE21CN4/// 
import java.util.*;

public class StudentManagement {
    static Scanner sc = new Scanner(System.in);
    static List<Student> list = new ArrayList<Student>();
    static int count = 1;

    public static void main(String[] args) {
        int chon;
        do {
            showMenu();
            chon = chonMot();
            switch (chon) {
                case 1:
                    nhapXuat();
                    break;
                case 2:
                    searchCourse();
                    break;
                case 3:
                    searchDiem();
                    break;
                case 4:
                    sapXepDiem();
                    break;
                case 5:
                    searchCodeandUpdateInfo();
                    break;
                case 6:
                    xuat5PointMax();
                    break;
                case 7:
                    diemTB();
                    break;
                case 8:
                    xuatDSSVtrenDiemTB();
                    break;
                case 9:
                    tongSVtheoHL();
                    break;
                case 10:
                    System.out.println("Ban da thoat chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Ban da nhap sai");
                    break;

            }
        } while (chon != 0);

    }

    public static void showMenu() {
        System.out.println("+-------------------------------------+");
        System.out.println("1. Nhap va xuat danh sach sinh vien");
        System.out.println("2. Tim kiem sinh vien theo khoa hoc dang ki");
        System.out.println("3. Tim kiem sinh vien theo diem");
        System.out.println("4. Sap xep sinh vien theo diem");
        System.out.println("5. Tim kiem SV theo ma so va cap nhat thong tin SV");
        System.out.println("6. Xuat 5 sinh vien co diem cao nhat");
        System.out.println("7. Tinh diem trung binh cua lop");
        System.out.println("8. Xuat DSSV co diem tren diem TB cua lop");
        System.out.println("9. Tong so sinh vien theo hoc luc");
        System.out.println("10. Exit");
        System.out.println("+-------------------------------------+");
    }

    public static int chonMot() {
        int chon = 0;
        System.out.print("Chon mot chuc nang: ");
        chon = Integer.parseInt(sc.nextLine());
        return chon;
    }

    public static void nhapXuat() {
        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            list.add(Student.getStudent(sc));
            list.get(i).setID(count++);
        }
        System.out.println("Danh sach sinh vien vua nhap la: ");
        list.forEach(System.out::println);
    }

    public static void searchCourse() {
        System.out.print("Nhap khoa hoc can tim: ");
        String res = sc.nextLine();
        System.out.println("Danh sach sinh vien khoa " + res + " la: ");
        list.stream().filter(s -> (s.getCourse().equals(res))).forEach(System.out::println);
    }

    public static void searchDiem() {
        System.out.print("Nhap diem can tim: ");
        double res = Double.parseDouble(sc.nextLine());
        System.out.println("Danh sach sinh vien co diem bang " + res + " la: ");
        list.stream().filter(s -> (s.getMark() == res)).forEach(System.out::println);
    }

    public static void sapXepDiem() {
        list.sort((s1, s2) -> s2.getMark().compareTo(s1.getMark()));
        list.forEach(System.out::println);
    }

    public static void searchCodeandUpdateInfo(){
        System.out.print("Nhap ma so sinh vien can tim: ");
        int res = Integer.parseInt(sc.nextLine());
        System.out.println("Thong tin sinh vien co ma so " + res + " la: ");
        list.stream().filter(s -> (s.getId().equals(res))).forEach(System.out::println);
        System.out.println("Ban muon sua thong tin sinh vien khong (Y/N)");
        String request = sc.nextLine();
        int point = 0;
        if (request.equals("Y")) {
            System.out.println("Nhap thong tin sinh vien moi: ");
            for(Student s : list){
                if(s.getId().equals(res)){
                    point = list.indexOf(s);
                    list.set(list.indexOf(s),Student.getstudent(sc));
                }
            }
        }
        list.get(point).setID(res);
        System.out.println("Thong tin sinh vien sau khi cap nhat la: ");
        list.forEach(System.out::println);
    }

    public static void xuat5PointMax() {
        System.out.println("5 sinh vien co diem cao nhat la: ");
        list.stream().sorted((s1, s2) -> s2.getMark().compareTo(s1.getMark())).limit(5).forEach(System.out::println);
    }

    public static void diemTB() {
        double res = list.stream().mapToDouble(s -> s.getMark()).average().getAsDouble();
        System.out.println("Diem trung binh cua lop la: " + res);
    }

    public static void xuatDSSVtrenDiemTB() {
        double res = list.stream().mapToDouble(s -> s.getMark()).average().getAsDouble();
        System.out.println("Danh sach sinh vien co diem tren diem trung binh cua lop la: ");
        list.stream().filter(s -> (s.getMark() > res)).forEach(System.out::println);
    }

    public static void tongSVtheoHL() {
        System.out.println("Tong so sinh vien theo hoc luc la: ");
        System.out.println("Gioi: " + list.stream().filter(s -> (s.getMark() >= 8)).count());
        System.out.println("Kha: " + list.stream().filter(s -> (s.getMark() >= 7 && s.getMark() < 8)).count());
        System.out.println("Trung binh: " + list.stream().filter(s -> (s.getMark() >= 5 && s.getMark() < 7)).count());
        System.out.println("Yeu: " + list.stream().filter(s -> (s.getMark() < 5)).count());
    }
}

class Student {
    private String name, course;
    private Double mark;
    private int id;

    public Student(String name, String course, Double mark) {
        this.name = name;
        this.course = course;
        this.mark = mark;
        this.id = 0;
    }

    public static Student getStudent(Scanner sc) {
        System.out.print("Nhap ten sinh vien: ");
        String name = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        String course = sc.nextLine();
        System.out.print("Nhap diem: ");
        Double mark = Double.parseDouble(sc.nextLine());
        return new Student(name, course, mark);
    }

    public static Student getstudent(Scanner sc) {
        System.out.print("Nhap lai ten sinh vien: ");
        String name = sc.nextLine();
        System.out.print("Nhap lai khoa hoc: ");
        String course = sc.nextLine();
        System.out.print("Nhap lai diem: ");
        Double mark = Double.parseDouble(sc.nextLine());
        return new Student(name, course, mark);
    }

    public String getName() {
        return this.name;
    }

    public String getCourse() {
        return this.course;
    }

    public Double getMark() {
        return this.mark;
    }

    public Integer getId() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String toID(){
        return String.format("SV%02d",this.id);
    }
    @Override
    public String toString() {
        return "MSV: " + toID() + "\nTen: " + name + "\nKhoa: " + course + "\nDiem: " + mark;
    }
}

