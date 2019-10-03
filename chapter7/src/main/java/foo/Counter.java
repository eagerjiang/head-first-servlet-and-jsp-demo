package foo;

import lombok.Synchronized;

/**
 * @author jiangqw
 * @date 2019/9/30 11:07
 */
public class Counter {
    private static int count;

    @Synchronized
    public static int getCount() {
        count++;
        return count;
    }
}
