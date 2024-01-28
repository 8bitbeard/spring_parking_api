package com.api.parkingcontrol.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record ParkingSpotRecordDto(
    @NotBlank
    String parkingSpotNumber,
    @NotBlank
    @Size(max = 7)
    String licensePlateCar,
    @NotBlank
    String brandCar,
    @NotBlank
    String modelCar,
    @NotBlank
    String colorCar,
    @NotBlank
    String responsibleName,
    @NotBlank
    String apartment,
    @NotBlank
    String block
) {
}
