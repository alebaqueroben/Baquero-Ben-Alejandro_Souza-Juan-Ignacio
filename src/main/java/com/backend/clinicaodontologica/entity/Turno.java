package com.backend.clinicaodontologica.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
public class Turno {

    @Entity
    @Table(name = "TURNOS")
    public class Turno {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private LocalDateTime fechaYHora;

        @ManyToOne
        @JoinColumn(name = "odontologo_id")
        private Odontologo odontologo;
        @ManyToOne
        @JoinColumn(name = "paciente_id")
        private Paciente paciente;



        public Turno(LocalDateTime fechaYHora, Odontologo odontologo, Paciente paciente) {

            this.fechaYHora = fechaYHora;
            this.odontologo = odontologo;
            this.paciente = paciente;
        }

        public Long getId() {
            return id;
        }

        public LocalDateTime getFechaYHora() {
            return fechaYHora;
        }

        public Odontologo getOdontologo() {
            return odontologo;
        }

        public Paciente getPaciente() {
            return paciente;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setFechaYHora(LocalDateTime fechaYHora) {
            this.fechaYHora = fechaYHora;
        }

        public void setOdontologo(Odontologo odontologo) {
            this.odontologo = odontologo;
        }

        public void setPaciente(Paciente paciente) {
            this.paciente = paciente;
        }
    }
