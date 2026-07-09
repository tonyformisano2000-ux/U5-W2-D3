package com.example.U5_W2_D3.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    @ToString
    @Getter
    @Setter
    @Entity
    @Table(name="authors")
    public class Author {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
@Column
        private String name;
        @Column
        private String surname;
        @Column
        private String email;
        @Column
        private LocalDate birthDate;
        @Column
        private String avatar;
        @OneToMany (mappedBy = "author")
        List<Post> postList=new ArrayList<>();



        public Author(String name, String surname, String email, LocalDate birthDate) {
            Random random=new Random();
            this.id = random.nextInt(1,10000);
            this.name = name;
            this.surname = surname;
            this.email = email;
            this.birthDate = birthDate;
            this.avatar = "https://picsum.photos/200/300";
        }
    }

