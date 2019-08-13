/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sermed.agenda.repository;

import br.com.sermed.agenda.model.Agenda;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joão.furtado
 */
@Repository
public interface AgendaRepository extends MongoRepository<Agenda, String> {


}
