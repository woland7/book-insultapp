package org.openshift;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int r1 = 500, c1 = 1000;
        int r2 = 1000, c2 = 500;
        int[][] firstMatrix = new int[r1][c1];
        int[][] secondMatrix = new int[r2][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                firstMatrix[i][j] = j + 2;
            }
        }
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                secondMatrix[i][j] = j + 1;
            }
        }
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        response.getWriter().println("The element in the position (0,0) of the product matrix is: " + product[0][1]);
    }

}