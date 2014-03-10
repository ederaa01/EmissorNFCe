/*
GenQRCodeNFCe - Gerador de QR Code para NFC-e
Copyright (C) 2014  Renato Krause <renatokrause@gmail.com>

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

/**
 *
 * @author Renato Krause <renatokrause@gmail.com>
 */
public class QRCodeNFCe {
    
    private String chNFe;   //Chave de Acesso da NFC-e [44 bytes*]
    public void setChNFe(String value) throws Exception {
        if (value.length() != 44) throw new Exception("Campo chNFe não possui 44 bytes.");
        else this.chNFe = value;
    }    
    public String getChNFe() {
        return this.chNFe;
    }

    private String nVersao;   //Versão do QR Code [3 bytes*]
    public void setNVersao(String value) throws Exception {
        if (value.length() != 3) throw new Exception("Campo nVersao não possui 3 bytes.");
        else this.nVersao = value;
    }    
    public String getNVersao() {
        return this.nVersao;
    }
    
    private String tpAmb;   //Identificação do Ambiente (1-Produção, 2-Homologação) [1 bytes*]
    public void setTpAmb(String value) throws Exception {
        if (value.length() != 1) throw new Exception("Campo tpAmb não possui 1 bytes.");
        else this.tpAmb = value;
    }    
    public String getTpAmb() {
        return this.tpAmb;
    }

    private String cDest;   //Documento de Identificação do consumidor (CNPJ/CPF/ID Estrangeiro) [11 - 20 ou null bytes]
    public void setCDest(String value) throws Exception {
        if ((value != null) && ((value.length() < 11) || (value.length() > 20))) throw new Exception("Campo cDest não possui entre 11 e 20 bytes e não é nulo.");
        else this.cDest = value;
    }    
    public String getCDest() {
        return this.cDest;
    }
    
    private String dhEmi;   //Data e Hora de Emissão da NFC-e [50 bytes]
    public void setDhEmi(String value) throws Exception {
        if (value.length() > 50) throw new Exception("Campo dhEmi excedeu 50 bytes.");
        else this.dhEmi = value;
    }    
    public String getDhEmi() {
        return this.dhEmi;
    }

    private String vNF;   //Valor Total da NFC-e [15 bytes]
    public void setVNF(String value) throws Exception {
        if (value.length() > 15) throw new Exception("Campo vNF excedeu 15 bytes.");
        else this.vNF = value;
    }    
    public String getVNF() {
        return this.vNF;
    }

    private String vICMS;   //Valor Total ICMS na NFC-e [15 bytes]
    public void setVICMS(String value) throws Exception {
        if (value.length() > 15) throw new Exception("Campo vICMS excedeu 15 bytes.");
        else this.vICMS = value;
    }    
    public String getVICMS() {
        return this.vICMS;
    }
    
    private String digVal;   //Digest Value da NFC-e [56 bytes*]
    public void setDigVal(String value) throws Exception {
        if (value.length() != 56) throw new Exception("Campo digVal não possui 56 bytes.");
        else this.digVal = value;
    }    
    public String getDigVal() {
        return this.digVal;
    }

    private String cIdToken;   //[6 bytes*]
    public void setCIdToken(String value) throws Exception {
        if (value.length() != 6) throw new Exception("Campo cIdToken não possui 6 bytes.");
        else this.cIdToken = value;
    }    
    public String getCIdToken() {
        return this.cIdToken;
    }
    
    private String cHashQRCode;   //[40 bytes*]
    public void setCHashQRCode(String value) throws Exception {
        if (value.length() != 40) throw new Exception("Campo cHashQRCode não possui 40 bytes.");
        else this.cHashQRCode = value;
    }    
    public String getCHashQRCode() {
        return this.cHashQRCode;
    }
    
}