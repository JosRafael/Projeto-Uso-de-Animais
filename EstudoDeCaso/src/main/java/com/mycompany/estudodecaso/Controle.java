package com.mycompany.estudodecaso;

public class Controle {
    public static void main(String[] args) throws Exception {
        EstudoDAO estudoDAO = new EstudoDAO();
        Estudo es = new Estudo();
        
        //EMITIR
        es.setDataEmissaoProtocolo("2022-07-25");
        es.setDataInicioExperimento("2022-07-25");
        es.setDataFimExperimento("2022-07-25");
        es.setJustificativaUsoAnimais("ASDASD");
        es.setResumoPortugues("portugues");
        es.setResumoIngles("ingles");
        
        //ENVIAR PARECER
        
        
        estudoDAO.emitir(es);
    }
}
