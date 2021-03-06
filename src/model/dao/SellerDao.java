package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findyById(Integer id);
    List<Seller> findyAll();
    List<Seller> findyByDepartment(Department department);

}
