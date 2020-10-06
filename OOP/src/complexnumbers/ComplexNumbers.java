package complexnumbers;

public class ComplexNumbers {

    private int real, imaginary, forMultiply1, forMultiply2, forMultiply3, forMultiply4;
    //private ComplexNumbers c1, c2;

    ComplexNumbers(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumbers number){
       // c1 = c1 + c2;
        this.real = this.real + number.real;
        this.imaginary = this.imaginary + number.imaginary;
    }

    public void multiply(ComplexNumbers number){
        //c1 =c1 * c2;
        this.forMultiply1 = this.real * number.real;
        this.forMultiply2 = this.real * number.imaginary;
        this.forMultiply3 = this.imaginary * number.real;
        this.forMultiply4 = this.imaginary * number.imaginary;
        if (this.forMultiply4 != 0){
            this.forMultiply4 = this.forMultiply4 * (-1);
        }

        this.imaginary = this.forMultiply2 + this.forMultiply3;
        this.real = this.forMultiply1 + this.forMultiply4;

    }

    public void print(){
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

}
