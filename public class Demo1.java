public class Demo1 {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        hs1.input();
        hs1.output();
        HocSinh hs2 = new HocSinh(111 , "nguyen ngoc lan", 8.5f);
        hs2.output();
        HocSinh hs3 = new HocSinh(hs2);
        hs3.output();
        hs3.setHoTen("pham chau tuan");
        hs3.output();
    }
}