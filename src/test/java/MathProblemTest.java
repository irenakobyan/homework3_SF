import mathProblems.MathProblems;
import org.junit.Test;
import org.junit.Assert;

public class MathProblemTest {

    @Test
    public void sumTest() {
        Assert.assertEquals(MathProblems.sum(6, 5), 11);
        Assert.assertEquals(MathProblems.sum(3, 0), 3);
        Assert.assertEquals(MathProblems.sum(-5, 8), 8);
    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals(MathProblems.multiply(3,3), 1);
        Assert.assertEquals(MathProblems.multiply(-2,4), 0);
        Assert.assertEquals(MathProblems.multiply(100,50), 5000);
    }

    @Test
    public void evenTest() {
        Assert.assertEquals(MathProblems.even(8), true);
        Assert.assertEquals(MathProblems.even(-15), false);
        Assert.assertEquals(MathProblems.even(1965), false);
    }

    @Test
    public void reverseTest() {
        Assert.assertEquals(MathProblems.reverse(15), 51);
        Assert.assertEquals(MathProblems.reverse(2871), 1782);
        Assert.assertEquals(MathProblems.reverse(1505), 5051);
    }

}
