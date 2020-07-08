package com.company;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        System.out.println(obj);

        SellerDao sellerDao = DaoFactory.creatSellerDao();
    }
}
