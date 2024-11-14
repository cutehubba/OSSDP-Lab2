import org.junit.Test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 测试类：2022111770_1_Test
 * 测试用例设计原则：等价类划分，选择代表性输入进行测试
 */
public class L2022111770_15_Test {

    Solution solution = new Solution();

    @Test
    public void testCompareVersion_equal() {
        // 测试目的：版本号相等的情况
        assertEquals(0, solution.compareVersion("1.01", "1.001"));
        assertEquals(0, solution.compareVersion("1.0", "1.0.0"));
    }

    @Test
    public void testCompareVersion_lessThan() {
        // 测试目的：version1 小于 version2 的情况
        assertEquals(-1, solution.compareVersion("0.1", "1.1"));
        assertEquals(-1, solution.compareVersion("1.0", "1.1"));
    }

    @Test
    public void testCompareVersion_greaterThan() {
        // 测试目的：version1 大于 version2 的情况
        assertEquals(1, solution.compareVersion("1.1", "1.0"));
        assertEquals(1, solution.compareVersion("1.0.1", "1.0"));
    }
}