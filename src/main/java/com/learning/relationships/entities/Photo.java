package com.learning.relationships.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@Table(name = "photo")
@NoArgsConstructor
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="photo_id")
    private Long id;
    @OneToOne(mappedBy = "photo")
    private Book book;
    @Column(name = "url_small")
    private String urlSmall;
    @Column(name = "url_medium")
    private String urlMedium;
    @Column(name = "url_large")
    private String urlLarge;
}
