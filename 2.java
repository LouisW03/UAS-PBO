class Hewan {
    protected String name;

    public Hewan(String name) {
        this.name = name;
    }

    public void Suara() {
        System.out.println("Suara Hewan");
    }
}

class Kucing extends Hewan {
    public Kucing(String name) {
        super(name);
    }

    @Override
    public void Suara() {
        System.out.println("Meong");
    }
}
