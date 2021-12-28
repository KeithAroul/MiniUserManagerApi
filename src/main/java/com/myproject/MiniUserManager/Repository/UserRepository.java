package com.myproject.MiniUserManager.Repository;

import com.myproject.MiniUserManager.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
