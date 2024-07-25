package com.product.ecommerce.repository;

import com.product.ecommerce.model.User;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.usertype.UserVersionType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);

    Optional<User> findByName(String name);

    User save(User Entity );
}
