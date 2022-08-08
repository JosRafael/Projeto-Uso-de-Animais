package com.mycompany.estudodecaso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudoDAO {
    public Conexao conexao;
    
    private Connection con;
    private PreparedStatement psts;
    private ResultSet rs;
    
    public EstudoDAO() {
        conexao = new Conexao();
    }
    
    public void emitir(Estudo e) throws Exception {
        String sql = "INSERT INTO protocolo (dataEmissaoProtocolo, dataInicioExperimento, dataFimExperimento, JustificativaUsoAnimais, resumoPortugues, resumoIngles, statusProtocolo) VALUES (curdate(), ?, ?, ?, ?, ?, 'Aguardando Envio')";
        
        con = Conexao.conexaoMySQL();
        psts = con.prepareStatement(sql);
        
        psts.setString(1, e.getDataInicioExperimento());
        psts.setString(2, e.getDataFimExperimento());
        psts.setString(3, e.getJustificativaUsoAnimais());
        psts.setString(4, e.getResumoPortugues());
        psts.setString(5, e.getResumoIngles());
        psts.execute();
    }
    
    public void enviarParaParecer(Estudo e) throws Exception {
        String sql ="UPDATE protocolo SET dataEnvioParecer = curdate(), statusProtocolo = 'Enviado' WHERE id = ?";
                
        con = Conexao.conexaoMySQL();
        psts = con.prepareStatement(sql);
        
        psts.setInt(1, e.getId());
        psts.execute();
    }
    
    public void emitirParecer(Estudo e) throws Exception {
        String sql ="UPDATE protocolo SET descricaoParecer = ?, statusParecer = ?, dataEmissaoParecer = curdate(), statusProtocolo = 'Aguardando Deliberação' WHERE id = ?";
                
        con = Conexao.conexaoMySQL();
        psts = con.prepareStatement(sql);
        
        psts.setString(1, e.getDescricaoParecer());
        psts.setString(2, e.getStatusParecer());
        psts.setInt(3, e.getId());
        
        psts.execute();
    }
    
    public void deliberarProtocolo(Estudo e) throws Exception {
        String sql ="UPDATE protocolo SET dataDeliberacaoProtocolo = curdate(), statusProtocolo = 'Deliberado', statusDeliberacao = ? WHERE id = ?";
        
        con = Conexao.conexaoMySQL();
        psts = con.prepareStatement(sql);
        
        psts.setString(1, e.getStatusDeliberacao());
        psts.setInt(2, e.getId());
        psts.execute();
    }
    
    public Estudo selecionar(int id) throws Exception {
        String sql = "SELECT * FROM protocolo WHERE id = ?";
        Estudo e = new Estudo();
        con = Conexao.conexaoMySQL();
        psts = con.prepareStatement(sql);
        psts.setInt(1, id);
        rs = psts.executeQuery();
        
        
        while (rs.next()) {
            e.setId(rs.getInt("id"));
            e.setDataEmissaoProtocolo(rs.getString("dataEmissaoProtocolo"));
            e.setDataInicioExperimento(rs.getString("dataInicioExperimento"));
            e.setDataFimExperimento(rs.getString("dataFimExperimento"));
            e.setJustificativaUsoAnimais(rs.getString("JustificativaUsoAnimais"));
            e.setResumoIngles(rs.getString("resumoIngles"));
            e.setResumoPortugues(rs.getString("resumoPortugues"));
            e.setDataEmissaoParecer(rs.getString("dataEmissaoParecer"));
            e.setDescricaoParecer(rs.getString("descricaoParecer"));
            e.setDataDeliberacaoProtocolo(rs.getString("dataDeliberacaoProtocolo"));
            e.setStatusParecer(rs.getString("statusParecer"));
            e.setStatusDeliberacao(rs.getString("statusDeliberacao"));
            e.setStatusProtocolo(rs.getString("statusProtocolo"));
        }
        
        rs.close();
        psts.close();
        return e;
        
    }
    
}
