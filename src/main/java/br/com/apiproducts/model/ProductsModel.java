package br.com.apiproducts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TB_PRODUCTS")
public class ProductsModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String nome;
    private BigDecimal quantidade;
    private BigDecimal valor;
}
