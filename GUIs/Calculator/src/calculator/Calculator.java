package calculator;

public class Calculator {
    
    private float number01;
    private float number02;
    private float add;
    private float sub;
    private float div;
    private float mult;

    public Calculator(float number01, float number02, float add, float sub, float div, float mult) {
        this.number01 = number01;
        this.number02 = number02;
        this.add = add;
        this.sub = sub;
        this.div = div;
        this.mult = mult;
    }

    public float addition(float number01, float number02){
        return add = (number01 + number02);
    }

    public float subtraction(float number01, float number02){
        return sub = (number01 - number02);
    }

    public float division(float number01, float number02){
        return div = ((number01) / (number02));
    }

    public float multiplication(float number01, float number02){
        return mult = ((number01) * (number02));
    }

    public float getNumber01() {
        return number01;
    }
    public float getNumber02() {
        return number02;
    }
    public float getAdd() {
        return add;
    }
    public float getSub() {
        return sub;
    }
    public float getDiv() {
        return div;
    }
    public float getMult() {
        return mult;
    }
    public void setNumber01(float number01) {
        this.number01 = number01;
    }
    public void setNumber02(float number02) {
        this.number02 = number02;
    }
    public void setAdd(float add) {
        this.add = add;
    }
    public void setSub(float sub) {
        this.sub = sub;
    }
    public void setDiv(float div) {
        this.div = div;
    }
    public void setMult(float mult) {
        this.mult = mult;
    }    

}