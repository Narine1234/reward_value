package Test;

import static org.junit.Assert.*;
import org.junit.Test;


public class RewardValueTest {

    @Test
    public void testCashToMilesConversion() {
        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(100.0, rewardValue.getCashValue(), 0.0);
        assertEquals(28571.428571428572, rewardValue.getMilesValue(), 0.0);
    }

    @Test
    public void testMilesToCashConversion() {
        double milesValue = 28571.43;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        assertEquals(28571.43, rewardValue.getMilesValue(), 0.0);
        assertEquals(100.0, rewardValue.getCashValue(), 0.0);
    }

    @Test
    public void testZeroCashValue() {
        double cashValue = 0.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(0.0, rewardValue.getCashValue(), 0.0);
        assertEquals(0.0, rewardValue.getMilesValue(), 0.0);
    }

    @Test
    public void testZeroMilesValue() {
        double milesValue = 0.0;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        assertEquals(0.0, rewardValue.getMilesValue(), 0.0);
        assertEquals(0.0, rewardValue.getCashValue(), 0.0);
    }

    @Test
    public void testNegativeCashValue() {
        double cashValue = -100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(-100.0, rewardValue.getCashValue(), 0.0);
        assertEquals(-28571.428571428572, rewardValue.getMilesValue(), 0.0);
    }

    @Test
    public void testNegativeMilesValue() {
        double milesValue = -28571.43;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        assertEquals(-28571.43, rewardValue.getMilesValue(), 0.0);
        assertEquals(-100.0, rewardValue.getCashValue(), 0.0);
    }
}
