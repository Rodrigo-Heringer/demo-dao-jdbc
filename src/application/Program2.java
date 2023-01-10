package application;

import java.util.List;

import model.dao.DaoFActory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFActory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findById(2);

        System.out.println(department);

        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println("\n=== TEST 3: insert =======");
        Department newDepartMent = new Department(null, "Music");
        departmentDao.insert(newDepartMent);
        System.out.println("Inserted! New id = " + newDepartMent.getId());
    };
}
