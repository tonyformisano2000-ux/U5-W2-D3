package com.example.U5_W2_D3.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@ToString
@Getter
@Setter
@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id; //generato automaticamente
    @Column
    private String category;
    @Column
    private String title;
    @Column
    private String cover; //generato automaticamente
    @Column
    private String content;
    @Column
    private int duration;
    @ManyToOne
    @JoinColumn
    private Author author;

    public Post(String category, String title, String content, int duration) {
        Random random=new Random();
        this.id =random.nextInt(1,10000);
        this.category = category;
        this.title = title;
        this.cover = "https://picsum.photos/200/300";
        this.content = content;
        this.duration = duration;
    }
}
