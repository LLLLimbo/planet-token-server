package com.planet.token.repo;

import com.planet.token.model.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepo extends CrudRepository<Ticket,Long> {

    Ticket findByAppId(String appId);

    List<Ticket> findAll();

}
