package dev.jesse.gofitness.run;

import java.time.LocalDateTime;

public record Run(
    Integer id,
    String title,
    LocalDateTime startOn,
    LocalDateTime endOn,
    Float distance,
    Location location
) {}
