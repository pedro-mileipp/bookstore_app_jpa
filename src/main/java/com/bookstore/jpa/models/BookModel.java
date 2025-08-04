package com.bookstore.jpa.models;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // mostrando para a JPA que BookModel é uma entidade JPA
@Table(name = "TB_BOOK") // como a classe vai se chamar quando for mapeada para uma tabela de dados
public class BookModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id // 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String title;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
