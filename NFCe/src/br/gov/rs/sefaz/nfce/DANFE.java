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

package br.gov.rs.sefaz.nfce;

import java.awt.image.BufferedImage;

/**
 *
 * @author Renato Krause <renatokrause@gmail.com>
 */
public class DANFE {
    
    public DivisaoIClass DivisaoI;
    public DivisaoIIClass DivisaoII;
    public DivisaoIIIClass DivisaoIII;
    public DivisaoIVClass DivisaoIV;
    public DivisaoVClass DivisaoV;
    public DivisaoVIClass DivisaoVI;
    public DivisaoVIIClass DivisaoVII;
    public DivisaoVIIIClass DivisaoVIII;
    
    public DANFE() {
        this.DivisaoI = new DivisaoIClass();
        this.DivisaoII = new DivisaoIIClass();
        this.DivisaoIII = new DivisaoIIIClass();
        this.DivisaoIV = new DivisaoIVClass();
        this.DivisaoV = new DivisaoVClass();
        this.DivisaoVI = new DivisaoVIClass();
        this.DivisaoVII = new DivisaoVIIClass();
        this.DivisaoVIII = new DivisaoVIIIClass();
    }
    
    public class DivisaoIClass {
        
    }
    
    public class DivisaoIIClass {
        
    }
    
    public class DivisaoIIIClass {
        
    }
    
    public class DivisaoIVClass {
        
    }
    
    public class DivisaoVClass {
        
    }
    
    public class DivisaoVIClass {
        
    }
    
    public class DivisaoVIIClass {
        
        private final String TextoObrigatorioI = "CONSUMIDOR";
        public String getTextoObrigatorioI() {
            return this.TextoObrigatorioI;
        }
        
        private final String TextoObrigatorioII = "CNPJ/CPF/ID Estrangeiro:";
        public String getTextoObrigatorioII() {
            return this.TextoObrigatorioII;
        }
        
        private String CNPJCPFIdEstrangeiro;
        public String getCNPJCPFIdEstrangeiro() {
            return this.CNPJCPFIdEstrangeiro;
        }
        public void setCNPJCPFIdEstrangeiro(String value) {
            this.CNPJCPFIdEstrangeiro = value;
        }
        
        private String CNPJCPFIdEstrangeiroNomeDoConsumidor;
        public String getCNPJCPFIdEstrangeiroNomeDoConsumidor() {
            return this.CNPJCPFIdEstrangeiroNomeDoConsumidor;
        }
        public void setCNPJCPFIdEstrangeiroNomeDoConsumidor(String value) {
            this.CNPJCPFIdEstrangeiroNomeDoConsumidor = value;
        }

        private String CNPJCPFIdEstrangeiroEnderecoLogradouro;
        public String getCNPJCPFIdEstrangeiroEnderecoLogradouro() {
            return this.CNPJCPFIdEstrangeiroEnderecoLogradouro;
        }
        public void setCNPJCPFIdEstrangeiroEnderecoLogradouro(String value) {
            this.CNPJCPFIdEstrangeiroEnderecoLogradouro = value;
        }
        
        private String CNPJCPFIdEstrangeiroEnderecoNumero;
        public String getCNPJCPFIdEstrangeiroEnderecoNumero() {
            return this.CNPJCPFIdEstrangeiroEnderecoNumero;
        }
        public void setCNPJCPFIdEstrangeiroEnderecoNumero(String value) {
            this.CNPJCPFIdEstrangeiroEnderecoNumero = value;
        }
        
        private String CNPJCPFIdEstrangeiroEnderecoBairro;
        public String getCNPJCPFIdEstrangeiroEnderecoBairro() {
            return this.CNPJCPFIdEstrangeiroEnderecoBairro;
        }
        public void setCNPJCPFIdEstrangeiroEnderecoBairro(String value) {
            this.CNPJCPFIdEstrangeiroEnderecoBairro = value;
        }
        
        private String CNPJCPFIdEstrangeiroEnderecoMunicipio;
        public String getCNPJCPFIdEstrangeiroEnderecoMunicipio() {
            return this.CNPJCPFIdEstrangeiroEnderecoMunicipio;
        }
        public void setCNPJCPFIdEstrangeiroEnderecoMunicipio(String value) {
            this.CNPJCPFIdEstrangeiroEnderecoMunicipio = value;
        }
        
    }
    
    public class DivisaoVIIIClass {
        
        private final String TextoObrigatorioI = "Consulta via leitor de QR Code";
        public String getTextoObrigatorioI() {
            return this.TextoObrigatorioI;
        }
        
        private final String TextoObrigatorioII = "Protocolo de autorização:";
        public String getTextoObrigatorioII() {
            return this.TextoObrigatorioII;
        }
        
        private int QRCodeWidth;        
        public int getQRCodeWidth() {
            return this.QRCodeWidth;
        }
        public void setQRCodeWidth(int value) {
            this.QRCodeWidth = value;
            
        }        
        
        private int QRCodeHeight;
        public int getQRCodeHeight() {
            return this.QRCodeHeight;
        }
        public void setQRCodeHeight(int value) {
            this.QRCodeHeight = value;
        }        
        
        private BufferedImage QRCode;
        public BufferedImage getQRCode() {
            return this.QRCode;
        }
        public void setQRCode(BufferedImage value) {
            this.QRCode = value;
        }                
        
        private String ProcoloDeAutorizacao;
        public String getProcoloDeAutorizacao() {
            return this.ProcoloDeAutorizacao;
        }
        public void setProcoloDeAutorizacao(String value) {
            this.ProcoloDeAutorizacao = value;
        }
        
        private String ProcoloDeAutorizacaoDataHora;                
        public String getProcoloDeAutorizacaoDataHora() {
            return this.ProcoloDeAutorizacaoDataHora;
        }
        public void setProcoloDeAutorizacaoDataHora(String value) {
            this.ProcoloDeAutorizacaoDataHora = value;
        }
        
    }

}
