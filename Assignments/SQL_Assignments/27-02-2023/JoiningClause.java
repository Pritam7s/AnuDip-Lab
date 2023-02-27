package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JoiningClause {

	public static void main(String[] args) {

		try(Connection conn = DatabaseConnection.getConnected()){
//			Statement st = conn.createStatement();
//			String create = "create table jdcourse(c_id int primary key auto_increment, course_name varchar(10), teacher_id int, foreign key(teacher_id) references JDBC_EX(id))";
//			int row = st.executeUpdate(create);
//			System.out.println(row + " Table created Successfully.");
			
//			Statement st1 = conn.createStatement();
//			String sql = "insert into jdcourse(course_name, teacher_id) values('java', 102),('sql', 101),('dot net', null)";
//			int row = st1.executeUpdate(sql);
//			System.out.println(row + " Records Inserted Successfully.");
			
			Statement st2 = conn.createStatement();
			//EQUI JON 
			//String sql2 = "select e.id, e.name, c.course_name from JDBC_EX e, jdcourse c where e.id=c.teacher_id";
			
			//INNER JOIN
			//String sql2 = "select e.id, e.name, c.course_name from JDBC_EX e inner join jdcourse c on e.id=c.teacher_id";
			
			//LEFT JOIN
			//String sql2 = "select e.id, e.name, c.course_name from JDBC_EX e left join jdcourse c on e.id=c.teacher_id";
			
			//RIGHT JOIN
			String sql2 = "select e.id, e.name, c.course_name from JDBC_EX e right join jdcourse c on e.id=c.teacher_id";
			ResultSet rs = st2.executeQuery(sql2);
			while(rs.next()) {
				System.out.println("Teacher Id: "+ rs.getInt(1));
				System.out.println("Teacher Name: "+ rs.getString("name"));
				System.out.println("Course Name: "+ rs.getString("course_name"));
				System.out.println("====================================");
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
