package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		//System.out.println("=== Teste 1: seller findById ====");
		//Seller seller = sellerDao.findById(3);
		//System.out.println(seller);
		
		//System.out.println("\n=== Teste 2: seller findByDepartment ====");
		//Department department = new Department(2, null);
		//List<Seller> list = sellerDao.findByDepartment(department);
		
	//	for (Seller sl : list) {
	//.out.println(sl);
		//}
		
		//System.out.println("\n=== Teste 3: seller findAll ====");
		// list = sellerDao.findAll();
		//for (Seller sl : list) {
	//	System.out.println(sl);
		//}
		
		
		System.out.println("\n=== Teste 4: Department insert ====");
		Department newDepartment = new Department(null, "Officer");
		departmentDao.insert(newDepartment);
		
		System.out.println("Inserted! New Id = " + newDepartment.getId());
		
		
	/*	System.out.println("\n=== Teste 5: seller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		
		System.out.println("update completed!");
		
		
		System.out.println("\n=== Teste 5: seller update ====");
		
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		
		System.out.println("seller deleted!");*/
		
		sc.close();
	}

}
