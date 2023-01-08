package application;

import model.dao.DaoFActory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFActory.createSellerDao();

        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
    }
}
