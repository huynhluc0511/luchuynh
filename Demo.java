import.bai2.phanso;
import.java.util.Scanner;
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