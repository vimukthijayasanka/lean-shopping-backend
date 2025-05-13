package lki.ijse.dep13.leanbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "product_variant")
public class ProductVariant {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal price;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "size_id")
    private Size size;
}
