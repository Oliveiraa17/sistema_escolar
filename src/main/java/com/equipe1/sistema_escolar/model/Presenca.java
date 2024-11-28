package com.equipe1.sistema_escolar.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_presenca")
public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id-presenca")
    private Long id;

    @Column(name = "tb_presenca")
    private Date dataPrensenca;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataPrensenca() {
        return dataPrensenca;
    }

    public void setDataPrensenca(Date dataPrensenca) {
        this.dataPrensenca = dataPrensenca;
    }
}
