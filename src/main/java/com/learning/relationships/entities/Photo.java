package com.learning.relationships.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
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

    public Photo(Long id, Book book, String urlSmall, String urlMedium, String urlLarge) {
        this.id = id;
        this.book = book;
        this.urlSmall = urlSmall;
        this.urlMedium = urlMedium;
        this.urlLarge = urlLarge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getUrlSmall() {
        return urlSmall;
    }

    public void setUrlSmall(String urlSmall) {
        this.urlSmall = urlSmall;
    }

    public String getUrlMedium() {
        return urlMedium;
    }

    public void setUrlMedium(String urlMedium) {
        this.urlMedium = urlMedium;
    }

    public String getUrlLarge() {
        return urlLarge;
    }

    public void setUrlLarge(String urlLarge) {
        this.urlLarge = urlLarge;
    }
}
