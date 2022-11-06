/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package one.digitalinnovation.pattern.repository;

import one.digitalinnovation.pattern.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author barpo
 */
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}