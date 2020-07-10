package com.company;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.creatSellerDao();

        Seller seller = sellerDao.findyById(5);


        System.out.println(seller);
    }
}
