package com.PrepList.servlets.data;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.PrepList.servlets.data.DBConnection;


@WebServlet("/List")
public class List extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        try {
            // Initialize the database
            Connection con = DBConnection.initializeDatabase();

            // Create a SQL query to insert data into table, consists of two columns
            PreparedStatement st = con
                    .prepareStatement("insert into demo values(?, ?)");

            // For the first parameter, get the data using request object
            // sets the data to st pointer
            st.setInt(1, Integer.valueOf(request.getParameter("id")));

            // Same for second parameter
            st.setString(2, request.getParameter("string"));

            // Execute the insert command using executeUpdate()
            // to make changes in database
            st.executeUpdate();

            // Close all the connections
            st.close();
            con.close();

            // Get a writer pointer
            // to display the succesful result
            PrintWriter out = response.getWriter();
            out.println("<html><body><b>Successfully Inserted"
                    + "</b></body></html>");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
