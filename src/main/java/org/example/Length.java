package org.example;

import java.util.Scanner;

public class Length {

    private double value;
    private Unit unit;

    // Enum for units
    enum Unit {
        FEET(12.0),
        INCHES(1.0);

        private final double factor;

        Unit(double factor) {
            this.factor = factor;
        }

        public double getFactor() {
            return factor;
        }
    }

    // Constructor
    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    // Convert to base unit (inches)
    private double toBaseUnit() {
        return value * unit.getFactor();
    }

    // Compare two Length objects
    public boolean compare(Length other) {
        return Math.abs(this.toBaseUnit() - other.toBaseUnit()) < 0.0001;
    }

    // Override equals
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Length that = (Length) obj;
        return compare(that);
    }



}
