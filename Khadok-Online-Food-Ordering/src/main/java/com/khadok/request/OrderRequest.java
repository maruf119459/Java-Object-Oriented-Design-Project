package com.khadok.request;

import com.khadok.model.Address;
import lombok.Data;

@Data
public class OrderRequest {
    private Long restaurantId;
    private Address deliveryAddress;
}
