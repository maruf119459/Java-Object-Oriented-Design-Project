package com.khadok.request;

import com.khadok.model.Address;
import com.khadok.model.ContactInformation;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CreateRestaurantRequest {
    private Long id;
    private String name;
    private String description;
    private Address address;
    private ContactInformation contactInformation;
    private String openingHours;
    private List<String>images;
    private String cuisineType;

}
