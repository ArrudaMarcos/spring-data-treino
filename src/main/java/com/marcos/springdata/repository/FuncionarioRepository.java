package com.marcos.springdata.repository;

import com.marcos.springdata.orm.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {
}
