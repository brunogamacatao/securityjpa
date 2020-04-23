package br.brunocatao.regconfirm.service;

import br.brunocatao.regconfirm.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
