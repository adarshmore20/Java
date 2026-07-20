class Mobile {

    String companyName;
    double screenSize;

    Mobile(String companyName, double screenSize) {
        this.companyName = companyName;
        this.screenSize = screenSize;
    }

    void display() {
        System.out.println(companyName + " " + screenSize + " inch");
    }

    public static void main(String[] args) {

        Mobile m1 = new Mobile("Samsung",6.5);
        Mobile m2 = new Mobile("Apple",6.1);
        Mobile m3 = new Mobile("OnePlus",6.7);
        Mobile m4 = new Mobile("Vivo",6.4);
        Mobile m5 = new Mobile("Realme",6.6);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
    }
}
