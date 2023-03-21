package cloud.api.commons.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * {@link UUID} 相关工具
 *
 * @since 0.1
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UUIDUtils {

    public static String random() {
        return UUID.randomUUID().toString();
    }

}
