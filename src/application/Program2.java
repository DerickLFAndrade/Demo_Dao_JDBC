package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== Teste 1: department findById ====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		
		
		/*System.out.println("\n=== Teste 4: Department insert ====");
		Department newDepartment = new Department(null, "Officer");
		departmentDao.insert(newDepartment);
		
		System.out.println("Inserted! New Id = " + newDepartment.getId());*/
		
		
	System.out.println("\n=== Teste 5: department update ====");
		department = departmentDao.findById(3);
		department.setName("Computers");
		departmentDao.update(department);
		
		System.out.println("update completed!");
		
		
		System.out.println("\n=== Teste 5: department delete ====");
		
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		
		System.out.println("department deleted!");
		
		sc.close();
	}

}
