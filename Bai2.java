import java.util.Scanner;
public class Bai2 {
public class PhanSo {
    private int tu; 
    private int mau; 
    public PhanSo() {
        tu = 0;
        mau = 1;
    }
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public PhanSo(PhanSo p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }
    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        tu = sc.nextInt();
        System.out.print("Nhap mau so: ");
        mau = sc.nextInt();
        while (mau == 0) { 
            System.out.println("Mau so khong duoc bang 0. Nhap lai: ");
            mau = sc.nextInt();
        }
    }
    public void xuatPhanSo() {
        System.out.println(tu + "/" + mau);
    }
    private int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private void rutGon() {
        int ucln = UCLN(tu, mau);
        tu = tu / ucln;
        mau = mau / ucln;
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }
    public PhanSo cong(PhanSo p) {
        PhanSo kq = new PhanSo();
        kq.mau = mau * p.mau; 
        kq.tu = tu * p.mau + p.tu * mau;
        kq.rutGon();
        return kq;
    }
    public PhanSo tru(PhanSo p) {
        PhanSo kq = new PhanSo();
        kq.mau = mau * p.mau; 
        kq.tu = tu * p.mau - p.tu * mau; 
        kq.rutGon(); 
        return kq;
    }
    public PhanSo nhan(PhanSo p) {
        PhanSo kq = new PhanSo();
        kq.tu = tu * p.tu; 
        kq.mau = mau * p.mau;
        kq.rutGon(); 
        return kq;
    }
    public PhanSo chia(PhanSo p) {
        PhanSo kq = new PhanSo();
        kq.tu = tu * p.mau; 
        kq.mau = mau * p.tu; 
        kq.rutGon(); 
        return kq;
    }
}

public class Demo {
    public static void main(String[] args) {
        Bai2 outer = new Bai2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tao phan so p1 bang khoi tao mac dinh:");
        PhanSo p1 = outer.new PhanSo();
        System.out.print("Phan so p1: ");
        p1.xuatPhanSo();

        System.out.println("\nNhap thong tin cho phan so p1:");
        p1.nhapPhanSo();
        System.out.print("Phan so p1 sau khi nhap: ");
        p1.xuatPhanSo();

        System.out.println("\nTao phan so p2 = 4/16:");
        PhanSo p2 = outer.new PhanSo(4, 16);
        System.out.print("Phan so p2: ");
        p2.xuatPhanSo();

        System.out.println("\nNhap thong tin cho phan so p3:");
        System.out.print("Nhap tu so: ");
        int tu3 = scanner.nextInt();
        System.out.print("Nhap mau so: ");
        int mau3 = scanner.nextInt();
        while (mau3 == 0) { 
            System.out.println("Mau so khong duoc bang 0. Nhap lai: ");
            mau3 = scanner.nextInt();
        }
        PhanSo p3 = outer.new PhanSo(tu3, mau3);
        System.out.print("Phan so p3: ");
        p3.xuatPhanSo();

        System.out.println("\nCong phan so p1 va p3:");
        PhanSo ketQuaCong = p1.cong(p3);
        System.out.print("Ket qua p1 + p3: ");
        ketQuaCong.xuatPhanSo();

        System.out.println("\nTao phan so p4 bang sao chep tu ket qua cong:");
        PhanSo p4 = outer.new PhanSo(ketQuaCong);
        System.out.print("Phan so p4: ");
        p4.xuatPhanSo();

        System.out.println("\nNhan phan so p4 voi p2:");
        PhanSo ketQuaNhan = p4.nhan(p2);
        System.out.print("Ket qua p4 * p2: ");
        ketQuaNhan.xuatPhanSo();
    }
}
}