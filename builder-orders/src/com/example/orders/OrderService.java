package com.example.orders;

import java.util.List;

import com.example.orders.Order.Builder;

public class OrderService {

    public Order createOrder(String id, String email, List<OrderLine> lines, Integer discount, boolean expedited, String notes) {
        Builder builder = new Builder();
        Order o = builder.setId(id).setCustomerEmail(email).setDiscountPercent(discount).setNotes(notes).setExpedited(expedited).setLines(lines).build();
        return o;
    }
}
