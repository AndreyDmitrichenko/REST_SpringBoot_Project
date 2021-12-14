package com.example.rest_springboot_project.service;

import com.example.rest_springboot_project.model.Client;

import java.util.List;

public interface ClientService {
    void create(Client client);
    List<Client> readAll();
    Client read(int id);
    boolean update(Client client, int id);
    boolean delete(int id);


}
