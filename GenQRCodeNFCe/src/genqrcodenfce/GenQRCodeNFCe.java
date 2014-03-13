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

import br.gov.rs.sefaz.nfce.*;
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
        
        QRCode qRCode = new QRCode();
        qRCode.setChNFe("43120910585504000174650010000000541123456781");
        qRCode.setNVersao("100");
        qRCode.setTpAmb("2");
        qRCode.setDhEmi("2012-09-27T16:20:34-03:00");
        qRCode.setVNF("1000.00");
        qRCode.setVICMS("180.00");
        qRCode.setDigVal("37327151612b623074616f514f3966414a7766646c5875715176383d");
        qRCode.setCIdToken("000001");
        qRCode.setToken("1058550420130001");
        qRCode.calcCHashQRCode();
        BufferedImage bufferedImage = qRCode.generateQRCode("https://www.sefaz.rs.gov.br/NFCE/NFCE-COM.aspx?", 0, 0);
        ImageIO.write(bufferedImage, "jpg", new java.io.File("C:\\Users\\renatoj\\Documents\\GitHub\\EmissorNFCe\\GenQRCodeNFCe\\output.jpg"));
    }
    
}
