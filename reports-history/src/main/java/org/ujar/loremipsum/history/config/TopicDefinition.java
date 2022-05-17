package org.ujar.loremipsum.history.config;

import java.time.Duration;
import javax.validation.constraints.NotNull;

record TopicDefinition(
    @NotNull String name,
    @NotNull Integer partitions,
    @NotNull Duration retention) {
}
