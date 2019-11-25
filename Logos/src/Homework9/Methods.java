package Homework9;

public class Methods {
	
	public int a;
    public int b;

    public int plus(int a, int b) throws IllegalAccessException, MyException{
        if (a  < 0 || b < 0){
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        else if (a != 0 && b == 0 || a == 0 && b != 0) {
            throw new ArithmeticException("You can't divide by zero");
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException("IllegalAccessException");
        } else {
            if (a > 0 && b > 0) {
                throw new MyException();
            }
        }
        return a + b;
    }

    public int minus(int a, int b) throws IllegalAccessException, MyException, IllegalArgumentException{
        if (a  < 0 || b < 0) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }else if (a != 0 && b == 0 || a == 0 && b != 0) {
            throw new ArithmeticException("You can't divide by zero");
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException("IllegalAccessException");
        } else {
            if (a > 0 && b > 0) {
                throw new MyException();
            }
        }
        return a - b;
    }

    public int devide(int a, int b) throws IllegalAccessException, MyException, IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("IllegalArgumentException");
        } else if (a != 0 && b == 0 || a == 0 && b != 0) {
            throw new ArithmeticException("You can't divide by zero");
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException("IllegalAccessException");
        } else {
            if (a > 0 && b > 0) {
                throw new MyException();
            }
        }
        return a / b;
    }


    public int multiply(int a, int b) throws MyException, IllegalAccessException, IllegalStateException {
        if (a  < 0 || b < 0) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }else if (a != 0 && b == 0 || a == 0 && b != 0) {
            throw new ArithmeticException("You can't divide by zero");
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException("IllegalAccessException");
               } else {
            if (a > 0 && b > 0) {
                throw new MyException();
            }
        }
        return a * b;
    }

}
