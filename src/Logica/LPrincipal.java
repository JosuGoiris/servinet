/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;

/**
 *
 * @author josug
 */
public class LPrincipal {
    public static void main(String [] args) {
        Connection cn = LConnection.getConnection();
    }
}