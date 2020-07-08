package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(DepartmentDao obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findyById(Integer id);
    List<Department> finyAll();
}
