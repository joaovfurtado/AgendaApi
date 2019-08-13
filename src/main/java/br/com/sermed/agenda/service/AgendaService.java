/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sermed.agenda.service;

import br.com.sermed.agenda.model.Agenda;
import br.com.sermed.agenda.repository.AgendaRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joão.furtado
 */
@Service
@Slf4j
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public List<Agenda> list() {
        log.info("Listando todas as agendas");
        return agendaRepository.findAll();
    }

    public Agenda create(Agenda agenda) {

        return agendaRepository.save(agenda);

    }
}
