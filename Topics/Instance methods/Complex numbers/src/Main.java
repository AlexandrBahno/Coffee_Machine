class Complex {

    double real;
    double image;
    // write methods here

    public void add(Complex num) {
        this.real = this.real + num.real;
        this.image = this.image + num.image;
        //System.out.println(this.real + " + " + this.image + "i");
    }

    public void subtract(Complex num) {
        this.real = this.real - num.real;
        this.image = this.image - num.image;
        //System.out.println(this.real + " + " + this.image + "i");
        //System.out.println((this.real - num.real) + " + " + (this.image - num.image) + "i");
    }
}
