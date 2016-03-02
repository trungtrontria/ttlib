package com.trontria.lib;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;


@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class ExampleUnitTest {
    @Test
    public void test123() {
        System.out.println("TrungNQ");
        Assertions.assertThat(1 + 1).isEqualTo(3);
    }
}
