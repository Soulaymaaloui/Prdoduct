package com.example.productmanagementsystem;

import java.io.*;

import com.example.productmanagementsystem.utils.Product;
import com.example.productmanagementsystem.utils.ProductList;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet(name = "ProductServlet", urlPatterns = {"/ProductServlet"})
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productName = request.getParameter("productName");
        int quantity;

        try {
            quantity = Integer.parseInt(request.getParameter("quantity"));
        } catch (NumberFormatException e) {
            response.getWriter().write("<h1>Error: Quantity must be a valid number.</h1>");
            return;
        }

        ProductList productList = new ProductList();
        Product product = productList.findByName(productName);

        response.setContentType("text/html");
        if (product != null) {
            double totalAmountTTC = quantity * product.getPriceExcludingTax() * (1 + product.getVAT());
            response.getWriter().write("<h1>Total Cost (TTC): " + totalAmountTTC + "</h1>");
        } else {
            response.getWriter().write("<h1>Product not found.</h1>");
        }
    }
}
