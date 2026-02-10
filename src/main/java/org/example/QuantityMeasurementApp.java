package org.example;
import org.example.Length.LengthUnit;

import static org.example.Length.Addition;


public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Length len1 = new Length(100, Length.LengthUnit.CM);
        Length len2 = new Length(36.0, Length.LengthUnit.INCHES);

        System.out.println("Equal? " + len1.equals(len2));

        Length res = Length.demonstrateLengthConversion(len1, LengthUnit.YARD);
        System.out.println(len1.toString() + " is " + res.toString());

        System.out.println();
        System.out.println("Addition of 2 lengths:");
        Length result = Addition(len1, len2);
        System.out.println("Result = " + result.toString());
        System.out.println(len1.toString() + " + " + len2.toString() + " is : " + result.toString());

        System.out.println();
        System.out.println("Addition of 2 lengths with target unit:");
        Length resultWithTargetUnit = Addition(len1, len2);
        System.out.println("Result = " + resultWithTargetUnit.toString());
        System.out.println(len1.toString() + " + " + len2.toString() + " is : " + resultWithTargetUnit.toString());
    }
}