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

package genqrcodenfce;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 *
 * @author Renato Krause <renatokrause@gmail.com>
 */
public class GenQRCodeNFCe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        QRCodeNFCe qRCodeNFCe = new QRCodeNFCe();
        qRCodeNFCe.setChNFe("43120910585504000174650010000000541123456781");
        qRCodeNFCe.setNVersao("100");
        qRCodeNFCe.setTpAmb("2");
        qRCodeNFCe.setDhEmi("2012-09-27T16:20:34-03:00");
        qRCodeNFCe.setVNF("1000.00");
        qRCodeNFCe.setVICMS("180.00");
        qRCodeNFCe.setDigVal("37327151612b623074616f514f3966414a7766646c5875715176383d");
        qRCodeNFCe.setCIdToken("000001");
        qRCodeNFCe.setToken("1058550420130001");
        qRCodeNFCe.calcCHashQRCode();
        BufferedImage bufferedImage = qRCodeNFCe.generateQRCode("https://www.sefaz.rs.gov.br/NFCE/NFCE-COM.aspx?", 0, 0);
        ImageIO.write(bufferedImage, "jpg", new java.io.File("C:\\Users\\renatoj\\Documents\\GitHub\\EmissorNFCe\\GenQRCodeNFCe\\output.jpg"));
    }
    
}
