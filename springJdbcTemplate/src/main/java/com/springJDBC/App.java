package com.springJDBC;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.dao.StudentDao;
import com.springJDBC.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program start" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("com/springJDBC/Config.xml");

        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        //Insertion method
//        Student student = new Student();
//        student.setId(103);
//        student.setName("ronak");
//        student.setCity("dewas");
//        
//        int result=studentDao.insert(student);
//        System.out.println("data inserted...");
//        System.out.println(result);
        
        //update data
//        Student student = new Student();
//        student.setId(12);
//        student.setName("shweta");
//        student.setCity("khargone");
//        int result = studentDao.change(student);
//        System.out.println("data changed");
//        System.out.println(result);
        
     //delete data
//        Scanner sc = new Scanner(System.in);
//        System.out.println("if you want to delete data please insert id: ");
//        int id = sc.nextInt();
//        int res = studentDao.delete(id);
//        System.out.println("data deleted successfully");
//        System.out.println(res);
        
        
        //select data  from database
//        Student student1 = studentDao.getstudent(102);
//        System.out.println(student1);
//        
//        Student student2 = studentDao.getstudent(101);
//        System.out.println(student2);
//        
//        Student student3 = studentDao.getstudent(103);
//        System.out.println(student3);
        
        
        //multiple data fetch
        List<Student> students = studentDao.getAllStudents();
        for(Student s:students)
        {
        System.out.println(s);
        }
        
        
    }
}
