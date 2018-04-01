package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.Datum;


import java.util.List;

public interface ApiService {

    List<Datum> getUsers(Integer limit);
}
