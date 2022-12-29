class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
    }

    public void eat() {
    }
}

interface Pet {
    public String getName();
    public void setName(String name);
    public void play();
}

class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
    }
}

class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        super(4);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
    }

    @Override
    public void eat() {
    }
}

class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
    }

    @Override
    public void walk() {
    }

    @Override
    public void eat() {
    }
}
