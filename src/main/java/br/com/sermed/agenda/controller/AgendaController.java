/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sermed.agenda.controller;

import br.com.sermed.agenda.model.Agenda;
import br.com.sermed.agenda.service.AgendaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joão.furtado
 *
 */
@RequestMapping("v1/admin/agendas")
@RestController
public class AgendaController {

    @Autowired
    private AgendaService service;

    @GetMapping
    public ResponseEntity<List<Agenda>> list() {
        return new ResponseEntity(service.list(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<Agenda> save(@RequestBody Agenda agenda) {
        return new ResponseEntity(service.create(agenda), HttpStatus.OK);
    }
}
