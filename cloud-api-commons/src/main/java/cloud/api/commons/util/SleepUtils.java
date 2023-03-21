package cloud.api.commons.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SleepUtils {

    @SneakyThrows
    public static void sleep(int seconds) {
        if (seconds > 0) {
            TimeUnit.SECONDS.sleep(seconds);
        }
    }

}
