/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newttt;

import javax.swing.JFrame;

/**
 *
 * @author saqib
 */
public class NewTTT {

 

//public class TicTacToeClientTest
//{
   public static void main( String[] args )
   {
      TicTacToeClient application; // declare client application

      // if no command line args
      if ( args.length == 0 )
         application = new TicTacToeClient( "192.168.8.102" ); // localhost
      else
         application = new TicTacToeClient( args[ 0 ] ); // use args

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   } // end main
} // end class T
//}
