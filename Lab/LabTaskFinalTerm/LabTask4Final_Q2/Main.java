public class Main {
    public static void main(String[] args) {
        System.out.println("=========== Employee Details ==========");
        System.out.println();
        
        Employee p1 = new FullTimeEmployee("Farhan Intesar", 70000);
        System.out.println(p1.toString());

        System.out.println();

        System.out.println("Usage of Concrete Method");
        System.out.println(p1.showDetails());

    }
}
