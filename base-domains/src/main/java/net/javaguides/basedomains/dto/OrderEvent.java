package net.javaguides.basedomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
     private String message;
     private String status;
     private Order order;

     public void setMessage(String message) {
          this.message = message;
     }
     public void setStatus(String status) {
          this.status = status;
     }
     public void setOrder(Order order) {
          this.order = order;
     }
     public OrderEvent() {
     }
     
}
