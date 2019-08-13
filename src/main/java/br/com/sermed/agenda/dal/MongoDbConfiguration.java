/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sermed.agenda.dal;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 *
 * @author
 *
 */
@Configuration
public class MongoDbConfiguration extends AbstractMongoConfiguration {

    @Override
    public MongoClient mongoClient() {
        return new MongoClient(new MongoClientURI("mongodb+srv://joao:23230303@cluster0-huzee.mongodb.net/test?retryWrites=true&w=majority"));
    }

    @Override
    protected String getDatabaseName() {
        return "agenda";
    }

}
