package Polynomial;


import java.util.ArrayList;

public class Polynomial {
    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */

    private ArrayList<Integer> power = new ArrayList<>();
    private ArrayList<Integer> coefficient = new ArrayList<>();

    public void setCoefficient(int degree, int coeff) {
        power.add(degree);
        coefficient.add(coeff);
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print() {
        for (int i = 0; i < this.coefficient.size(); i++) {
            System.out.print(this.coefficient.get(i) + "x" + this.power.get(i) + " ");
        }
    }

    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial second) {
        Polynomial result = new Polynomial();
        int firstPowerSize = this.power.size();
        int secondPowerSize = second.power.size();
        int index = 0;
        //ArrayList<Integer> secondUsedIndices = new ArrayList<>();

        for (int i = 0; i < firstPowerSize; i++) {
            boolean flag = false;
            for (int j = 0; j < secondPowerSize; j++) {
                if (this.power.get(i).equals(second.power.get(j))) {
                    int temp = this.coefficient.get(i) + second.coefficient.get(i);
                    result.coefficient.add(index, temp);
                    result.power.add(index, this.power.get(i));
                    index++;
                    second.power.remove(j);
                    second.power.add(j, 0);
                    flag = true;
                }
            }
            if (!flag) {
                result.coefficient.add(index, this.coefficient.get(i));
                result.power.add(index, this.power.get(i));
                index++;
            }
        }
        for (int i = 0; i < secondPowerSize; i++) {
            if (second.power.get(i) != 0) {
                result.coefficient.add(index, second.coefficient.get(i));
                result.power.add(index, second.power.get(i));
                index++;
            }
        }
        return result;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial second) {
        Polynomial result = new Polynomial();
        int firstPowerSize = this.power.size();
        int secondPowerSize = second.power.size();
        int index = 0;

        for (int i = 0; i < firstPowerSize; i++) {
            boolean flag = false;
            for (int j = 0; j < secondPowerSize; j++) {
                if (this.power.get(i).equals(second.power.get(j))) {
                    if (this.coefficient.get(i) >= second.coefficient.get(i)) {
                        int temp = this.coefficient.get(i) - second.coefficient.get(i);
                        result.coefficient.add(index, temp);
                        result.power.add(index, this.power.get(i));
                        index++;
                        second.power.remove(j);
                        second.power.add(j, 0);
                        flag = true;
                    } else {
                        int temp = second.coefficient.get(i) - this.coefficient.get(i);
                        result.coefficient.add(index, temp);
                        result.power.add(index, this.power.get(i));
                        index++;
                        second.power.remove(j);
                        second.power.add(j, 0);
                        flag = true;
                    }
                }
            }
            if (!flag) {
                result.coefficient.add(index, this.coefficient.get(i));
                result.power.add(index, this.power.get(i));
                index++;
            }
        }
        for (int i = 0; i < secondPowerSize; i++) {
            if (second.power.get(i) != 0) {
                result.coefficient.add(index, second.coefficient.get(i));
                result.power.add(index, second.power.get(i));
                index++;
            }
        }
        return result;
    }

    // Multiply two polynomials and returns a new polynomial which has result
//    public Polynomial multiply(Polynomial second){
//        Polynomial interim = new Polynomial();
//        Polynomial result = new Polynomial();
//        int index  = 0;
//        for (int i = 0; i < this.power.size(); i++){
//            for (int j = 0; j < second.power.size(); j++){
//
//            }
//        }
//    }

}
