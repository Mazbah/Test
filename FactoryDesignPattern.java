package BongoBD;

/**
 * Question:2) Explain the design pattern used in following:
 * 	interface Vehicle {
 * 		int set_num_of_wheels()
 * 		int set_num_of_passengers()
 * 		boolean has_gas()
 * 	}
 * a) Explain how you can use the pattern to create car and plane class?
 */

public class FactoryDesignPattern {
	 public interface Vehicle {
	        int set_num_of_wheels(int wheels);

	        int set_num_of_passengers(int passengers);

	        boolean has_gas();
	  }

	    private class Car implements Vehicle {
	        int wheels;
	        int passengers;

	        @Override
	        public int set_num_of_wheels(int wheels) {
	            this.wheels = wheels;
	            return wheels;
	        }

	        @Override
	        public int set_num_of_passengers(int passengers) {
	            this.passengers = passengers;
	            return passengers;
	        }

	        @Override
	        public boolean has_gas() {
	            return true;
	        }
	    }

	    private class Plane implements Vehicle {
	        int wheels;
	        int passengers;

	        @Override
	        public int set_num_of_wheels(int wheels) {
	            this.wheels = wheels;
	            return wheels;
	        }

	        @Override
	        public int set_num_of_passengers(int passengers) {
	            this.passengers = passengers;
	            return passengers;
	        }

	        @Override
	        public boolean has_gas() {
	            return false;
	        }
	    }

}
