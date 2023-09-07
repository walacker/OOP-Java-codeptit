import java.util.Scanner;

public class Assignment_Java {
    static Scanner sc = new Scanner(System.in);

    static String[] RANKs = new String[50];
    static String[] NAMEs = new String[50];
    static Double[] POINTs = new Double[50];
    static String[] EMAILs = new String[50];

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
                    searchDiem();
                    break;
                case 3:
                    searchHocLuc();
                    break;
                case 4:
                    searchCodeandUpdateInfo();
                    break;
                case 5:
                    sapXepDiem();
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
        System.out.println("2. Tim kiem sinh vien theo khoang diem");
        System.out.println("3. Tim kiem sinh vien theo hoc luc");
        System.out.println("4. Tim kiem SV theo ma so va cap nhat thong tin SV");
        System.out.println("5. Sap xep sinh vien theo diem");
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
        Employee[] emps = new Employee[3];

        System.out.println("Dien thong tin cua 3 SV");
        for (int i = 0; i < emps.length; i++) {
            System.out.println("+-------------------------------------+");
            System.out.print("Nhap ten: ");
            NAMEs[i] = sc.nextLine();
            System.out.print("Nhap Email: ");
            EMAILs[i] = sc.nextLine();
            System.out.print("Nhap diem: ");
            POINTs[i] = Double.parseDouble(sc.nextLine());
            System.out.println("+-------------------------------------+");
            if (POINTs[i] < 3) {
                RANKs[i] = "Yeu";
            } else if (POINTs[i] >= 3 && POINTs[i] < 5) {
                RANKs[i] = "Yeu";
            } else if (POINTs[i] >= 5 && POINTs[i] < 6.5) {
                RANKs[i] = "Trung Binh";
            } else if (POINTs[i] >= 6.5 && POINTs[i] < 7.5) {
                RANKs[i] = "Kha";
            } else if (POINTs[i] >= 7.5 && POINTs[i] <= 9) {
                RANKs[i] = "Gioi";
            } else {
                if (POINTs[i] > 9) {
                    RANKs[i] = "Xuat sac";
                }
            }
            System.out.println("Xuat ket qua");
            System.out.println("Ten: " + NAMEs[i]);
            System.out.println("Email: " + EMAILs[i]);
            System.out.println("Diem: " + POINTs[i]);
            System.out.println("Ket qua xep loai: " + RANKs[i]);
        }
    }

    public static void searchDiem() {

        System.out.print("Nhap diem can tim: ");
        int timDiem = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            if (timDiem == POINTs[i]) {
                System.out.println("+-------------------------------------+");
                System.out.println("Thong tin sinh vien can tim");
                System.out.println("Ten: " + NAMEs[i]);
                System.out.println("Email: " + EMAILs[i]);
                System.out.println("Hoc luc: " + RANKs[i]);
            }
        }
    }

    public static void searchHocLuc() {

        System.out.print("Nhap hoc luc can tim: ");
        String hocLuc = sc.next();
        for (int i = 0; i < 3; i++) {
            if (hocLuc == RANKs[i]) {
                System.out.println("+-------------------------------------+");
                System.out.println("Thong tin sinh vien can tim");
                System.out.println("Ten: " + NAMEs[i]);
                System.out.println("Diem: " + POINTs[i]);
                System.out.println("Email: " + EMAILs[i]);
            }
        }
    }

    public static void searchCodeandUpdateInfo() {
        System.out.println("+-------------------------------------+");
        System.out.println("Nhap vi tri sinh vien muon tim trong danh sach");
        int n = sc.nextInt();
        int i = n - 1;
        sc.nextLine();
        System.out.println("+-------------------------------------+");
        System.out.println("Thong tin sinh vien can tim");
        System.out.println("Ten: " + NAMEs[i]);
        System.out.println("Diem: " + POINTs[i]);
        System.out.println("Email: " + EMAILs[i]);
        System.out.println("Hoc luc " + RANKs[i]);
        System.out.println("+-------------------------------------+");
        System.out.println("Ban muon sua thong tin sinh vien khong (Y/N)");
        String request = sc.nextLine();

        if (request.equals("Y")) {
            System.out.println("Nhap lai thong tin");
            System.out.println("Nhap lai ten");
            String s = sc.nextLine();
            NAMEs[i] = s;
            System.out.println("Nhap lai diem");
            Double d = sc.nextDouble();
            POINTs[i] = d;
            if (POINTs[i] < 3) {
                RANKs[i] = "Yeu";
            } else if (POINTs[i] >= 3 && POINTs[i] < 5) {
                RANKs[i] = "Yeu";
            } else if (POINTs[i] >= 5 && POINTs[i] < 6.5) {
                RANKs[i] = "Trung Binh";
            } else if (POINTs[i] >= 6.5 && POINTs[i] < 7.5) {
                RANKs[i] = "Kha";
            } else if (POINTs[i] >= 7.5 && POINTs[i] <= 9) {
                RANKs[i] = "Gioi";
            } else {
                if (POINTs[i] > 9) {
                    RANKs[i] = "Xuat sac";
                }
            }
            sc.nextLine();
            System.out.println("Nhap lai email");
            String e = sc.nextLine();
            EMAILs[i] = e;

            System.out.println("Danh sach sinh vien sau khi cap nhap");
            for (int j = 0; j < 3; j++) {
                System.out.println("+-------------------------------------+");
                System.out.println("Ten: " + NAMEs[j]);
                System.out.println("Email: " + EMAILs[j]);
                System.out.println("Diem: " + POINTs[j]);
                System.out.println("Ket qua xep loai: " + RANKs[j]);
            }
        }
    }

    public static void sapXepDiem() {
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (POINTs[i] > POINTs[j]) {
                    POINTs = doicho(POINTs, i, j);
                    NAMEs = doicho(NAMEs, i, j);
                    EMAILs = doicho(EMAILs, i, j);
                    RANKs = doicho(RANKs, i, j);

                }
            }
        }

        System.out.println("Thong tin sinh vien sau khi sap xep");
        for (int i = 0; i < 3; i++) {
            System.out.println("+-------------------------------------+");
            System.out.println("Ten: " + NAMEs[i]);
            System.out.println("Diem: " + POINTs[i]);
            System.out.println("Email: " + EMAILs[i]);
            System.out.println("Hoc luc: " + RANKs[i]);
        }
    }

    public static void xuat5PointMax() {
        Employee[] e = new Employee[POINTs.length];
        for (int i = 0; i < 3; i++) {
            Employee employee = new Employee();
            e[i] = employee;
            e[i].diem = POINTs[i];
            e[i].mail = EMAILs[i];
            e[i].hocluc = RANKs[i];
        }
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (POINTs[i] > POINTs[j]) {
                    POINTs = doicho(POINTs, i, j);
                }
            }
        }
        try {
            double t = POINTs[POINTs.length - 5];
            for (int i = 0; i < POINTs.length; i++) {
                if (e[i].diem > t) {
                    System.out.println("+-------------------------------------+");
                    System.out.println("Ten: " + e[i].ten);
                    System.out.println("Diem: " + e[i].diem);
                    System.out.println("Email: " + e[i].mail);
                    System.out.println("Hoc luc: " + e[i].hocluc);
                }
            }
        } catch (Exception exception) {
            System.out.println("+-------------------------------------+");
            System.out.println("Khong co du nam hoc sinh");
        }
    }

    public static void diemTB() {
        double tong = 0;
        for (int i = 0; i < 3; i++) {
            tong = tong + POINTs[i];

        }
        double diemTB = tong / 3;
        System.out.println("+-------------------------------------+");
        System.out.println("Diem trung binh ca lop la: " + diemTB);

    }

    public static void xuatDSSVtrenDiemTB() {
        double tong = 0;
        for (int i = 0; i < 3; i++) {
            tong = tong + POINTs[i];

        }
        double diemTB = tong / 3;
        System.out.println("Nhung sinh vien tren diem TB :");
        for (int i = 0; i < 3; i++) {
            if (POINTs[i] > diemTB) {
                System.out.println("+-------------------------------------+");
                System.out.println("Ten: " + NAMEs[i]);
                System.out.println("Diem: " + POINTs[i]);
                System.out.println("Email: " + EMAILs[i]);
                System.out.println("Hoc luc: " + RANKs[i]);

            }
        }
    }

    public static void tongSVtheoHL() {
        String s = sc.nextLine();
        int dem = 0;
        for (int i = 0; i < 3; i++) {
            if (RANKs[i].equals(s)) {
                dem++;
            }
        }
        System.out.println("+-------------------------------------+");
        System.out.println("Tong so hoc sinh co hoc luc " + s + " la " + dem);
    }

    public static Double[] doicho(Double a[], int i, int j) {
        double t = a[i];
        a[i] = a[j];
        a[j] = t;
        return a;
    }

    public static String[] doicho(String a[], int i, int j) {
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
        return a;
    }
}

class Employee {
    String ten, hocluc, mail;
    String msv;
    double diem;
}
