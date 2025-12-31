package com.maven;

// Superclass
class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

// Subclass SBI
class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

// Subclass HDFC+
class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

// Main class
public class Maven3 {
    public static void main(String[] args) {

        Bank bank1 = new SBI();   // Upcasting
        Bank bank2 = new HDFC();

        System.out.println("SBI Interest Rate: " + bank1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + bank2.getInterestRate() + "%");
    }
}
