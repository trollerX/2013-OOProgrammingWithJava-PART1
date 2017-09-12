
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int counter;
    private int upperLimit;
    
    public BoundedCounter(int upperValue){
        this.upperLimit = upperValue;
        this.counter = 0;
    }
    
    public void next() {
        this.counter++;
        if(this.counter==this.upperLimit+1) {
            this.counter=0;
        }
    }
    
    public String toString() {
        if(this.counter < 10){
            return "0" + this.counter;
        }
            
        return "" + this.counter;
    }
    
    public int getValue() {
        return this.counter;
    }
    
    public void setValue(int value) {
        if(value >= 0 && value <= this.upperLimit) {
        this.counter = value;
        }
        
    }
}
