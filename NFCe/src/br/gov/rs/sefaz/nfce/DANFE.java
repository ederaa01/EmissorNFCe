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
        
        public final String TextoObrigatorioI = "CNPJ:";                
        public final String TextoObrigatorioII = "Inscrição Estadual:";
        private boolean ExibirLogo;
        private BufferedImage LogoDefault;
        private BufferedImage LogoContribuinte;
        private String EmitenteRazaoSocial;
        private String EmitenteCNPJ;
        private String EmitenteInscricaoEstadual;
        private String EmitenteEnderecoLogradouro;
        private String EmitenteEnderecoNumero;
        private String EmitenteEnderecoBairro;
        private String EmitenteEnderecoMunicipio;
        private String EmitenteEnderecoSiglaUF;

        public boolean isExibirLogo() {
            return ExibirLogo;
        }
        public void setExibirLogo(boolean ExibirLogo) {
            this.ExibirLogo = ExibirLogo;
        }

        public BufferedImage getLogoDefault() {
            return LogoDefault;
        }
        public void setLogoDefault(BufferedImage LogoDefault) {
            this.LogoDefault = LogoDefault;
        }

        public BufferedImage getLogoContribuinte() {
            return LogoContribuinte;
        }
        public void setLogoContribuinte(BufferedImage LogoContribuinte) {
            this.LogoContribuinte = LogoContribuinte;
        }

        public String getEmitenteRazaoSocial() {
            return EmitenteRazaoSocial;
        }
        public void setEmitenteRazaoSocial(String EmitenteRazaoSocial) {
            this.EmitenteRazaoSocial = EmitenteRazaoSocial;
        }

        public String getEmitenteCNPJ() {
            return EmitenteCNPJ;
        }
        public void setEmitenteCNPJ(String EmitenteCNPJ) {
            this.EmitenteCNPJ = EmitenteCNPJ;
        }

        public String getEmitenteInscricaoEstadual() {
            return EmitenteInscricaoEstadual;
        }
        public void setEmitenteInscricaoEstadual(String EmitenteInscricaoEstadual) {
            this.EmitenteInscricaoEstadual = EmitenteInscricaoEstadual;
        }

        public String getEmitenteEnderecoLogradouro() {
            return EmitenteEnderecoLogradouro;
        }
        public void setEmitenteEnderecoLogradouro(String EmitenteEnderecoLogradouro) {
            this.EmitenteEnderecoLogradouro = EmitenteEnderecoLogradouro;
        }

        public String getEmitenteEnderecoNumero() {
            return EmitenteEnderecoNumero;
        }
        public void setEmitenteEnderecoNumero(String EmitenteEnderecoNumero) {
            this.EmitenteEnderecoNumero = EmitenteEnderecoNumero;
        }

        public String getEmitenteEnderecoBairro() {
            return EmitenteEnderecoBairro;
        }
        public void setEmitenteEnderecoBairro(String EmitenteEnderecoBairro) {
            this.EmitenteEnderecoBairro = EmitenteEnderecoBairro;
        }

        public String getEmitenteEnderecoMunicipio() {
            return EmitenteEnderecoMunicipio;
        }
        public void setEmitenteEnderecoMunicipio(String EmitenteEnderecoMunicipio) {
            this.EmitenteEnderecoMunicipio = EmitenteEnderecoMunicipio;
        }

        public String getEmitenteEnderecoSiglaUF() {
            return EmitenteEnderecoSiglaUF;
        }
        public void setEmitenteEnderecoSiglaUF(String EmitenteEnderecoSiglaUF) {
            this.EmitenteEnderecoSiglaUF = EmitenteEnderecoSiglaUF;
        }
        
    }
    
    public class DivisaoIIClass {

        public final String TextoObrigatorioI = "DANFE NFC-e - Documento Auxiliar";                
        public final String TextoObrigatorioII = "da Nota Fiscal Eletrônica para Consumidor Final";
        public final String TextoObrigatorioIII = "Não permite aproveitamento de crédito de ICMS";
        
    }
    
    public class DivisaoIIIClass {
        
        private boolean ExibirDetalheDeVenda;
        private String DetalheDeVenda;

        public boolean isExibirDetalheDeVenda() {
            return ExibirDetalheDeVenda;
        }
        public void setExibirDetalheDeVenda(boolean ExibirDetalheDeVenda) {
            this.ExibirDetalheDeVenda = ExibirDetalheDeVenda;
        }

        public String getDetalheDeVenda() {
            return DetalheDeVenda;
        }
        public void setDetalheDeVenda(String DetalheDeVenda) {
            this.DetalheDeVenda = DetalheDeVenda;
        }
                
    }
    
    public class DivisaoIVClass {
        
    }
    
    public class DivisaoVClass {
        
    }
    
    public class DivisaoVIClass {
        
    }
    
    public class DivisaoVIIClass {
        
        private final String TextoObrigatorioI = "CONSUMIDOR";
        private final String TextoObrigatorioII = "CNPJ/CPF/ID Estrangeiro:";
        private String CNPJCPFIdEstrangeiro;
        private String CNPJCPFIdEstrangeiroNomeDoConsumidor;
        private String CNPJCPFIdEstrangeiroEnderecoLogradouro;
        private String CNPJCPFIdEstrangeiroEnderecoNumero;
        private String CNPJCPFIdEstrangeiroEnderecoBairro;
        private String CNPJCPFIdEstrangeiroEnderecoMunicipio;

        public String getCNPJCPFIdEstrangeiro() {
            return CNPJCPFIdEstrangeiro;
        }
        public void setCNPJCPFIdEstrangeiro(String CNPJCPFIdEstrangeiro) {
            this.CNPJCPFIdEstrangeiro = CNPJCPFIdEstrangeiro;
        }

        public String getCNPJCPFIdEstrangeiroNomeDoConsumidor() {
            return CNPJCPFIdEstrangeiroNomeDoConsumidor;
        }
        public void setCNPJCPFIdEstrangeiroNomeDoConsumidor(String CNPJCPFIdEstrangeiroNomeDoConsumidor) {
            this.CNPJCPFIdEstrangeiroNomeDoConsumidor = CNPJCPFIdEstrangeiroNomeDoConsumidor;
        }

        public String getCNPJCPFIdEstrangeiroEnderecoLogradouro() {
            return CNPJCPFIdEstrangeiroEnderecoLogradouro;
        }
        public void setCNPJCPFIdEstrangeiroEnderecoLogradouro(String CNPJCPFIdEstrangeiroEnderecoLogradouro) {
            this.CNPJCPFIdEstrangeiroEnderecoLogradouro = CNPJCPFIdEstrangeiroEnderecoLogradouro;
        }

        public String getCNPJCPFIdEstrangeiroEnderecoNumero() {
            return CNPJCPFIdEstrangeiroEnderecoNumero;
        }
        public void setCNPJCPFIdEstrangeiroEnderecoNumero(String CNPJCPFIdEstrangeiroEnderecoNumero) {
            this.CNPJCPFIdEstrangeiroEnderecoNumero = CNPJCPFIdEstrangeiroEnderecoNumero;
        }

        public String getCNPJCPFIdEstrangeiroEnderecoBairro() {
            return CNPJCPFIdEstrangeiroEnderecoBairro;
        }
        public void setCNPJCPFIdEstrangeiroEnderecoBairro(String CNPJCPFIdEstrangeiroEnderecoBairro) {
            this.CNPJCPFIdEstrangeiroEnderecoBairro = CNPJCPFIdEstrangeiroEnderecoBairro;
        }

        public String getCNPJCPFIdEstrangeiroEnderecoMunicipio() {
            return CNPJCPFIdEstrangeiroEnderecoMunicipio;
        }
        public void setCNPJCPFIdEstrangeiroEnderecoMunicipio(String CNPJCPFIdEstrangeiroEnderecoMunicipio) {
            this.CNPJCPFIdEstrangeiroEnderecoMunicipio = CNPJCPFIdEstrangeiroEnderecoMunicipio;
        }        
        
    }
    
    public class DivisaoVIIIClass {
        
        private final String TextoObrigatorioI = "Consulta via leitor de QR Code";
        private final String TextoObrigatorioII = "Protocolo de autorização:";
        private int QRCodeWidth;        
        private int QRCodeHeight;
        private BufferedImage QRCode;
        private String ProcoloDeAutorizacao;
        private String ProcoloDeAutorizacaoDataHora;                

        public int getQRCodeWidth() {
            return QRCodeWidth;
        }
        public void setQRCodeWidth(int QRCodeWidth) {
            this.QRCodeWidth = QRCodeWidth;
        }

        public int getQRCodeHeight() {
            return QRCodeHeight;
        }
        public void setQRCodeHeight(int QRCodeHeight) {
            this.QRCodeHeight = QRCodeHeight;
        }

        public BufferedImage getQRCode() {
            return QRCode;
        }
        public void setQRCode(BufferedImage QRCode) {
            this.QRCode = QRCode;
        }

        public String getProcoloDeAutorizacao() {
            return ProcoloDeAutorizacao;
        }
        public void setProcoloDeAutorizacao(String ProcoloDeAutorizacao) {
            this.ProcoloDeAutorizacao = ProcoloDeAutorizacao;
        }

        public String getProcoloDeAutorizacaoDataHora() {
            return ProcoloDeAutorizacaoDataHora;
        }
        public void setProcoloDeAutorizacaoDataHora(String ProcoloDeAutorizacaoDataHora) {
            this.ProcoloDeAutorizacaoDataHora = ProcoloDeAutorizacaoDataHora;
        }

    }

}
