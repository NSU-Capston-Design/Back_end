package com.codingrecipe.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Data
@AllArgsConstructor
public class ProductData {
    private String productName;         // 상품명
    private int productPrice;           // 상품가격
    private String userName;            // 등록자 이름
    private int productInven;           // 재고수량

}
