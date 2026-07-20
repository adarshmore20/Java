class Cube {

    int length, breadth, height;

    Cube() {
        length = breadth = height = 1;
    }

    Cube(int l) {
        length = breadth = height = l;
    }

    Cube(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    void volume() {
        System.out.println("Volume = " + (length * breadth * height));
    }

    public static void main(String[] args) {

        Cube c1 = new Cube();
        Cube c2 = new Cube(5);
        Cube c3 = new Cube(2,3,4);

        c1.volume();
        c2.volume();
        c3.volume();
    }
}
