package application;

 import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
 
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("---- Teste 1: seller findById -------");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n---- Teste 2: seller findByDepartment -------");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n---- Teste 3: seller findAll -------");
		list = sellerDao.findAll();		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n---- Teste 4: seller insert -------");
		Seller newSeller = new Seller(null, "teste name", "teste@kskd.com", new Date(), 3333.0, department) ;
		sellerDao.insert(newSeller);
		System.out.println("new id: " + newSeller.getId());
		
		
	}
	

}
