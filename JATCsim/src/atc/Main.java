/*
 * Main.java
 *
 * Created on May 4, 2006, 4:26 PM
 *
 * Copyright 2006 David Ammerlaan
 *
 *    This file is part of jATC.
 *
 *  jATC is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  jATC is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with jATC; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 */

package atc;

import java.awt.*;
import javax.swing.*;
/**
 * Program starts here.
 * @author jminer2
 */
public class Main {

    /**
     * Begins execution of the program
     */
    public static void main(String[] args) {
  
    	String programTitle = "Air Traffic Control Simulator";
    	
    	new LoginWindow(programTitle);
    	
    }
    
}
