/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sermed.agenda.model;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author joão.furtado
 */
@Data
@Builder
@Document("agendas")
public class Agenda {

    @Id
    private String id;
    private String nome;
    private LocalDateTime data_agenda;

}
