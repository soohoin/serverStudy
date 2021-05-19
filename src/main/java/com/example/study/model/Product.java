package com.example.study.model;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    int id;        // ID
    String title;  // 제품이름
    double price;  // 제품가격
    int inventory; // 재고수량
}
