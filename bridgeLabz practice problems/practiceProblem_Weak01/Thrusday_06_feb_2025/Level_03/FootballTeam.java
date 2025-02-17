package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_03;

public class FootballTeam {
    public static void main(String[] args) {
        double[] heights = new double[11];
        for(int i=0; i<heights.length; i++){
            heights[i] = (Math.random()*100)+150;
        }
        double sumOfHeights = sumOfHeights(heights);
        double meanOfHeights = meanOfHeights(sumOfHeights, heights.length);
        double shortestHeights = shortestHeights(heights);
        double tallestHeights = tallestHeights(heights);

        System.out.println("Sum of all the Heights : " + sumOfHeights);
        System.out.println("Mean of the Heights : " + meanOfHeights);
        System.out.println("Shortest Height : " + shortestHeights);
        System.out.println("Tallest Height : " + tallestHeights);
    }

    static double sumOfHeights(double[] heights){
        double totalSum = 0;
        for(double a:heights)totalSum += a;
        return totalSum;
    }

    static double meanOfHeights(double sum, int len){
        return sum/len;
    }

    static double shortestHeights(double[] heights){
        double min = Integer.MAX_VALUE;
        for(double d:heights)min = Math.min(min, d);
        return min;
    }

    static double tallestHeights(double[] heights){
        double max = Integer.MIN_VALUE;
        for(double d:heights)max = Math.max(max, d);
        return max;
    }
}
