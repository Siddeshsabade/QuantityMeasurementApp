package org.example;

import java.util.Locale;
import java.util.Scanner;

public class QuantityMeasurementApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("--- Weight Converter ---");

        System.out.print("Enter weight value1: ");
        double value1 = sc.nextDouble();
        System.out.print("Enter unit of first weight (kg/gm/pound): ");
        String sourceStr1 = sc.next();
        WeightEnum u1 = WeightEnum.parseUnit(sourceStr1);
        if(u1==null){
            System.err.println("Invalid first unit");
            return;
        }

        System.out.print("Enter weight value2: ");
        double value2 = sc.nextDouble();
        System.out.print("Enter unit for second weight (kg/gm/pound): ");
        String sourceStr2 = sc.next();
        WeightEnum u2 = WeightEnum.parseUnit(sourceStr2);

        if(u2==null){
            System.err.println("Invalid Second unit");
            return;
        }
        /*
        ---for equality----
        else{
            boolean equal=Weight.areEqual(value1,u1,value2,u2);
            System.out.println("Are the two weights equal ? " +equal);
        } */
        System.out.print("Enter target unit to print sum: ");
        String targetStr = sc.next();
        WeightEnum targetUnit = WeightEnum.parseUnit(targetStr);
        if (targetUnit == null) {
            System.err.println("Invalid target unit: " + targetStr);
            return;
        }
        double kg1=u1.toBase(value1);
        double kg2 =u2.toBase(value2);

        double ans = kg1+kg2;
        double targetSum = WeightEnum.convert(ans,WeightEnum.Kilogram, targetUnit);
        System.out.printf("%f %s%n", targetSum, targetUnit.label());










//        System.out.println("--- Length Converter ---");
//
//        System.out.print("Enter numeric value1: ");
//        double value1 = sc.nextDouble();
//
//        System.out.print("Enter first source unit: ");
//        String sourceStr1 = sc.next(); // use next() not nextLine()
//
//        LengthEnum u1 = LengthEnum.parseUnit(sourceStr1);
//        if (u1 == null) {
//            System.err.println("Invalid first unit: " + sourceStr1);
//        }
//        System.out.print("Enter numeric value2: ");
//        double value2 = sc.nextDouble();
//
//        System.out.print("Enter second source unit: ");
//        String sourceStr2 = sc.next();
//        LengthEnum u2 = LengthEnum.parseUnit(sourceStr2);
//        if (u2 == null) {
//            System.err.println("Invalid second unit: " + sourceStr2);
//            return;
//        }
//
//
//        System.out.print("Enter target unit to print sum: ");
//        String targetStr = sc.next();
//
////    LengthEnum sourceUnit = LengthEnum.parseUnit(sourceStr);
//        LengthEnum targetUnit = LengthEnum.parseUnit(targetStr);
//
//
//        double feet1 = u1.toBase(value1);
//        double feet2 = u2.toBase(value2);
//        double totalFeet = feet1 + feet2;
//
//
//        double targetSum = LengthEnum.convert(totalFeet, LengthEnum.Feet, targetUnit);
//
//        System.out.printf("%f %s%n", targetSum, targetUnit.label());
    }
}




















//package org.example;
//
//import java.util.Scanner;
//import java.lang.Double;
//
//
//class UnitMismatchException extends Exception {
//    public UnitMismatchException(String message) {
//        super(message);
//    }
//}
//
//public class QuantityMeasurementApp {
//
//    public static class Feet {
//        private final double value;
//
//        public Feet(double value) {
//            this.value = value;
//        }
//
//        @Override
//        public boolean equals(Object obj) {
//
//            if (this == obj)
//                return true;
//
//            if (obj == null || getClass() != obj.getClass())
//                return false;
//
//            Feet other = (Feet) obj;
//
//            return Double.compare(this.value, other.value) == 0;
//        }
//    }
//
//
//    static class Inches {
//        private final double value;
//
//        public Inches(double value) {
//            this.value = value;
//        }
//
//        @Override
//        public boolean equals(Object obj) {
//
//            if (this == obj)
//                return true;
//
//            if (obj == null || getClass() != obj.getClass())
//                return false;
//
//            Inches other = (Inches) obj;
//
//            return Double.compare(this.value, other.value) == 0;
//        }
//    }
//
//    static class YardsS{
//        private final double value;
//
//        public YardsS(double value)
//        {
//            this.value=value;
//        }
//        @Override
//        public boolean equals(Object obj)
//        {
//            if(this==obj) return true;
//            if(obj==null) return false;
//
//            Inches other = (Inches)obj;
//
//            return Double.compare(this.value,other.value)==0;
//
//        }
//    }
//
//    static void CheckFeetEquality(double v1, double v2) {
//        Feet f1 = new Feet(v1);
//        Feet f2 = new Feet(v2);
//
//        if (f1.equals(f2)) {
//            System.out.println("Feet values are equal");
//        } else {
//            System.out.println("Feet values are not equal");
//        }
//    }
//
//    static void CheckInchesEquality(double v1, double v2) {
//        Inches i1 = new Inches(v1);
//        Inches i2 = new Inches(v2);
//
//        if (i1.equals(i2)) {
//            System.out.println("Inches values are equal");
//        } else {
//            System.out.println("Inches values are not equal");
//        }
//
//    }
//    static void CheckYardsSEquality(double v1, double v2) {
//        YardsS y1 = new YardsS(v1);
//        YardsS y2 = new YardsS(v2);
//
//        if (y1.equals(y2)) {
//            System.out.println("YardsS values are equal");
//        } else {
//            System.out.println("YardsS values are not equal");
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//
//        Length l1 = new Length(3.0, Length.LengthEnum.Feet);
//        Length l2 = new Length(36.0, Length.LengthEnum.Inches);
//
//        Length l3 = new Length(5, Length.LengthEnum.Yards);
//        Length l4 = new Length(6, Length.LengthEnum.Centimeters);
//        System.out.println(l1.compare(l2)); // true
//
//        System.out.println("---Length convertor");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter numeric value1: ");
//        double valueStr1 = sc.nextDouble();
//        sc.nextLine();
//
//
//        System.out.print("Enter source unit of first value(Feet/ft, Inches/in, YardsS/yd, centimeter/Centimeters): ");
//        String sourceStr1 = sc.next();
//        //  Length.LengthEnum sourceUnit = Length.parseUnit(sourceStr);
//
//        System.out.print("Enter numeric value2: ");
//        double valueStr2 = sc.nextDouble();
//        sc.nextLine();
//        System.out.print("Enter source unit of second value (Feet/ft, Inches/in, YardsS/yd, centimeter/Centimeters): ");
//        String sourceStr2 = sc.next();
//
//
//        System.out.print("Enter target unit (Feet/ft, Inches/in, YardsS/yd, centimeter/Centimeters): ");
//        String targetStr = sc.next();
//
//
//
//        Length.LengthEnum sourceUnit1 = Length.parseUnit(sourceStr1);
//        Length.LengthEnum sourceUnit2 = Length.parseUnit(sourceStr2);
//        Length.LengthEnum targetUnit = Length.parseUnit(targetStr);
//
//        double converted1 = Length.convert(valueStr1, sourceUnit1, targetUnit);
//        double converted2 = Length.convert(valueStr2, sourceUnit2, targetUnit);
//
//        //    double ans = valueStr1 + valueStr2;
//        double ans = converted1 + converted2;
//        System.out.println("Target Addition: "+ans +" "+targetStr);
//
//        //Length.LengthEnum targetUnit = Length.parseUnit(targetStr);
//
//        if(sourceUnit1 == null || sourceUnit2==null) {
//            System.err.println("Invalid source unit: ");
//            return;
//        }
//        if (targetUnit == null) {
//            System.err.println("Invalid target unit: " + targetStr);
//            return;
//        }
//    }
//}