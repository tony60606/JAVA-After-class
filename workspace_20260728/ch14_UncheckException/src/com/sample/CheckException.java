
import java.io.IOException;
import java.util.Random;
import java.sql.SQLException ;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ttoon
 */
public class CheckException {
    public static void main(String[] args) {
        try {
            dotest() ;
        } catch (IOException ex) {
            System.out.println("main()：" + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("main()：" + ex.getMessage());
        } catch (Exception1 ex) {
            System.out.println("main()：" + ex.getMessage() + "，" + ex);
        }
    }

    private static void dotest() throws IOException, SQLException, Exception1 {
        double random = new Random().nextDouble() ;
        System.out.println("random = " + random);
        
        if (random >= 0.8) {
            throw new ArithmeticException("錯誤1") ;
        } else if (random >= 0.6) {
            throw new IOException("I/O錯誤") ;
        } else if (random >= 0.4) {
            try {
                throw new SQLException("SQL錯誤") ;
            } catch (SQLException ex) {
                throw ex ;
            }
        } else {
            throw new Exception1("XXX" , 12345) ;
        }
    }
}
