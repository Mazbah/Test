package BongoBD;

/**
 * Question:
 * 2) Explain the design pattern used in following:
 *  interface Vehicle {
 *    int set_num_of_wheels()
 *    int set_num_of_passengers()
 *    boolean has_gas()
 *  }
 * b) Use a different design pattern for this solution.
 */

public class Car {
    private int wheels;
    private int passengers;
    private boolean hasGas;

    private Car(int wheels, int passengers, boolean hasGas) {
        this.wheels = wheels;
        this.passengers = passengers;
        this.hasGas = hasGas;
    }

    public int get_num_of_wheels() {
        return wheels;
    }


    public int get_num_of_passengers() {
        return passengers;
    }


    public boolean has_gas() {
        return hasGas;
    }

    public static class Builder {
        private int wheels;
        private int passengers;
        private boolean hasGas;

        public Builder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder setPassengers(int passengers) {
            this.passengers = passengers;
            return this;
        }

        public Builder setHasGas(boolean hasGas) {
            this.hasGas = hasGas;
            return this;
        }

        public Car build() {
            return new Car(wheels, passengers, hasGas);
        }
    }
}
