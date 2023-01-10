package application;

import model.dao.DaoFActory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFActory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findById(3);

        System.out.println(department);

    };
}
