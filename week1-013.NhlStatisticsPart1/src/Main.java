
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Top ten by by goals:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("Top 25 by penalties:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("Statistics for Sidney Crosby:");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("Statistics of Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("Players of Anaheim Ducks by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}
