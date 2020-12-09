package com.cbp.cbpportal.repository;
import com.cbp.cbpportal.Models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

    /**
     * Apparently an interface referring to all Admins in the CBP
     *
     * We have to parameterize the JpaRepository with our
     * entity and the data type of the id parameter in our entity.
     *
     * @Author mpp04
     */



}
