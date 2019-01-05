/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclienttest;

import javax.swing.JFrame;

/**
 *
 * @author saqib
 */
public class TicTacToeClientTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TicTacToeClient application; // declare client application

      // if no command line args
      if ( args.length == 0 )
         application = new TicTacToeClient( "192.168.8.101" ); // localhost
      else
         application = new TicTacToeClient( args[ 0 ] ); // use args

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   } // end main
        
    }
    

