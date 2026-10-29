class Product {
    int i;
    double p;

    Product(int i, double p) {
        this.i = i;
        this.p = p;
    }
}

class Electronics extends Product {
    Electronics(int i, double p) {
        super(i, p);
    }

    void show() {
        System.out.println(i + " " + p + " Electronics");
    }
}

class Clothing extends Product {
    Clothing(int i, double p) {
        super(i, p);
    }

    void show() {
        System.out.println(i + " " + p + " Clothing");
    }
}

class Books extends Product {
    Books(int i, double p) {
        super(i, p);
    }

    void show() {
        System.out.println(i + " " + p + " Books");
    }
}

class Main {
    public static void main(String[] args) {
        Electronics e = new Electronics(1, 20000);
        Clothing c = new Clothing(2, 1000);
        Books b = new Books(3, 500);

        e.show();
        c.show();
        b.show();
    }
}
