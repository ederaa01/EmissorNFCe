/*
GenQRCodeNFCe - Gerador de QR Code para NFC-e
Copyright (C) 2014  Renato Krause

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package genqrcode;

import br.gov.rs.sefaz.nfce.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Renato Krause <renatokrause@gmail.com>
 */
public class GenQRCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) showHelp();
        else {
            boolean NothingToDo = true;
            boolean InvalidSyntax = false;
            String BaseURL = "";
            int Width = 0;
            int Height = 0;
            BufferedImage bufferedImage = null;
            File SaveAs = null;
            QRCode qRCode = new QRCode();
            for (int i = 0; i < args.length; i++) {
                String argParam = args[i];
                if (argParam.charAt(0) == '-') {
                    if (argParam.charAt(1) != '-') {
                        InvalidSyntax = true;
                        System.err.println("Invalid syntax.");
                    }
                    String argValue = "";
                    if (((i+1) < args.length) && (args[i+1].charAt(0) != '-')) argValue = args[i+1];
                    switch (argParam) {
                        case "--chNFe":
                            if (argValue != "") {
                                qRCode.setChNFe(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;
                        break;
                        case "--nVersao":
                            if (argValue != "") {
                                qRCode.setNVersao(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;
                        case "--tpAmb":
                            if (argValue != "") {
                                qRCode.setTpAmb(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;
                        case "--cDest":
                            if (argValue != "") {
                                qRCode.setCDest(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;                            
                        case "--dhEmi":
                            if (argValue != "") {
                                qRCode.setDhEmi(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;                            
                        case "--vNF":
                            if (argValue != "") {
                                qRCode.setVNF(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;                            
                        case "--vICMS":
                            if (argValue != "") {
                                qRCode.setVICMS(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;                            
                        case "--digVal":
                            if (argValue != "") {
                                qRCode.setDigVal(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;                            
                        case "--cIdToken":
                            if (argValue != "") {
                                qRCode.setCIdToken(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;                            
                        case "--token":
                            if (argValue != "") {
                                qRCode.setToken(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;
                        case "--cHashQRCode":
                            if (argValue != "") {
                                qRCode.setCHashQRCode(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;
                        case "--baseURL":
                            if (argValue != "") {
                                BaseURL = argValue;
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;                            
                        case "--width":
                            if (argValue != "") {
                                Width = Integer.parseInt(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;                            
                        case "--height":
                            if (argValue != "") {
                                Height = Integer.parseInt(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;                                                        
                        case "--saveAs":
                            if (argValue != "") {
                                SaveAs = new File(argValue);
                                NothingToDo = false;
                            } else InvalidSyntax = true;                            
                        break;                                                        
                    }
                }
            }
            if (qRCode.getCHashQRCode() == "") qRCode.calcCHashQRCode();
            if (BaseURL != "") bufferedImage = qRCode.generateQRCode(BaseURL, Width, Height);
            else InvalidSyntax = true;
            if (NothingToDo || InvalidSyntax || (bufferedImage == null) || (SaveAs == null)) showHelp();
            else ImageIO.write(bufferedImage, "jpg", SaveAs);
        }
        /*
        java -jar GenQRCode.jar --chNFe 43120910585504000174650010000000541123456781 --nVersao 100 --tpAmb 2 --cDest 12345678909 --dhEmi 2012-09-27T16:20:34-03:00 --vNF 1000.00 --vICMS 180.00 --digVal 37327151612b623074616f514f3966414a7766646c5875715176383d --cIdToken 000001 --token 1058550420130001 --baseURL https://www.sefaz.rs.gov.br/NFCE/NFCE-COM.aspx? --saveAs C:\Users\renatoj\Documents\GitHub\EmissorNFCe\GenQRCode\dist\output.jpg
        */
    }
    
    private static void showHelp() {
        System.out.println(">HELP<");
    }
    
}
