package com.higbie.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class Link {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;

    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
