public class Main {
    public int a;
    public int transform(int a){
        return a=3+4;
    }
    public static void main(String[] args) {
        Main mfc=new Main();
        mfc.a=mfc.transform(7);
        mfc.a=mfc.transform(mfc.a);
        System.out.println("transforming a !"+mfc.a );
    }
}