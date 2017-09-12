
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {

        int differenceInYears = this.year - comparedDate.year;

        if (this.year > comparedDate.year) {
            if (this.month < comparedDate.month) {
                differenceInYears--;
                return differenceInYears;
            }
            if(this.day <  comparedDate.day){
                differenceInYears--;
                return differenceInYears;                        
            }
        } else if (this.year < comparedDate.year) {
            differenceInYears = -differenceInYears;
            if (this.month > comparedDate.month) {
                differenceInYears--;
                return differenceInYears;
            }
            if(this.day >  comparedDate.day){
                differenceInYears--;
                return differenceInYears;                        
            }
        }

        return differenceInYears;

    }
}
