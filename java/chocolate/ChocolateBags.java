package tudelft.chocolate;

public class ChocolateBags {

    public int calculate(int small, int big, int total) {
        int maxBigBoxes = total / 5;
        int bigBoxesWeCanUse = Math.min(maxBigBoxes, big);
        total -= (bigBoxesWeCanUse * 5);

        if(small >= total)
            return total;
        return -1;
    }
}
