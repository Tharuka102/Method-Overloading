public class Programming {
    String language;

    Programming() {
        this.language = "JAVA";
    }

    Programming(String language) {
        this.language = language;
    }

    public void getname() {
        System.out.println("Programming language  :" + this.language);
    }

    public static void main(String[] args) {
        Programming p = new Programming();
        Programming p1 = new Programming("Python");
        p.getname();
        p1.getname();

    }

}
