public class Counter {
    private int value;

    // Constructor that sets the start value of the counter to startValue
    public Counter(int startValue) {
        this.value = startValue;
    }

    // Constructor that sets the start value of the counter to 0
    public Counter() {
        this(0);  // Calls the other constructor with 0 as the start value
    }

    // Method to return the current value of the counter
    public int value() {
        return value;
    }

    // Method to increase the value by 1
    public void increase() {
        value++;
    }

    // Method to decrease the value by 1
    public void decrease() {
        value--;
    }

    // Overloaded method to increase the value by increaseBy
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }

    // Overloaded method to decrease the value by decreaseBy
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }

    // Main method to test the Counter class
    public static void main(String[] args) {
        // Create a Counter with a starting value of 10
        Counter counter1 = new Counter(10);
        System.out.println("Counter 1 initial value: " + counter1.value());

        // Increase the counter by 1
        counter1.increase();
        System.out.println("Counter 1 after increase: " + counter1.value());

        // Decrease the counter by 1
        counter1.decrease();
        System.out.println("Counter 1 after decrease: " + counter1.value());

        // Increase the counter by 5
        counter1.increase(5);
        System.out.println("Counter 1 after increasing by 5: " + counter1.value());

        // Decrease the counter by 3
        counter1.decrease(3);
        System.out.println("Counter 1 after decreasing by 3: " + counter1.value());

        // Create a Counter with the default starting value (0)
        Counter counter2 = new Counter();
        System.out.println("Counter 2 initial value: " + counter2.value());

        // Increase the counter by 10
        counter2.increase(10);
        System.out.println("Counter 2 after increasing by 10: " + counter2.value());

        // Decrease the counter by 5
        counter2.decrease(5);
        System.out.println("Counter 2 after decreasing by 5: " + counter2.value());
    }
}
