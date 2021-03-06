package platform.codingnomads.co.springdata.example.dml.introducingrepositories.jparepository;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class SoftDrink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int rating;

    @PrePersist
    @PreUpdate
    public void confirmRating() {
        if(rating < 0 || rating > 10) {
            throw new IllegalStateException("Rating must be between 0 and 10!");
        }
    }
}
