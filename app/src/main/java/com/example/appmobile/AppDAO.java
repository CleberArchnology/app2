package com.example.appmobile;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.appmobile.ui.ClienteDTO;
import com.example.appmobile.ui.ContratoDTO;
import com.example.appmobile.ui.SocioDTO;

import java.util.ArrayList;

public class AppDAO extends SQLiteOpenHelper {
    private final String TABELA_CLIENTE = "TB_CLIENTE";
    private final String TABELA_SOCIO = "TB_SOCIO";
    private final String TABELA_CARGO = "TB_LOGIN";
    private final String TABELA_SERVICO = "TB_SERVICO";
    private final String TABELA_CONTRATO = "TB_CONTRATO";
    private final String TABELA_ATIVIDADE = "TB_ATIVIDADE";
//        private final String TABELA_ATIVIDADE_SOCIO = "TB_ATIVIDADE_SOCIO";

    public AppDAO(@Nullable Context context) {
        super(context, "DB_AppArchnology", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String comandoCliente = "CREATE TABLE " + TABELA_CLIENTE + "(" +
                "CPF_CLIENTE VARCHAR(14) PRIMARY KEY," +
                "NOME_CLIENTE VARCHAR(50)," +
                "TELEFONE_CLIENTE VARCHAR(20)," +
                "EMAIL_CLIENTE VARCHAR(50)," +
                "ENDERECO VARCHAR(50)," +
                "COMPLEMENTO VARCHAR(30)," +
                "BAIRRO VARCHAR(50), " +
                "CIDADE VARCHAR(40)," +
                "CEP VARCHAR(14)," +
                "ESTADO VARCHAR(30))";
        db.execSQL(comandoCliente);

        String comandoSocio = "CREATE TABLE " + TABELA_SOCIO + "(" +
                "USUARIO_SOCIO VARCHAR(50) PRIMARY KEY, " +
                "NOME_SOCIO VARCHAR(50)," +
                "CARGO_SOCIO VARCHAR(30)," +
                "EMAIL_SOCIO VARCHAR(40)," +
                "TELEFONE_SOCIO VARCHAR(20)," +
                "SENHA_LOGIN VARCHAR(20))";
        db.execSQL(comandoSocio);

        String comandoCargo = "CREATE TABLE " + TABELA_CARGO + "(" +
                "NOME_CARGO VARCHAR(20) PRIMARY KEY," +
                "HORAS_CARGO CHAR(5)," +
                "USUARIO_SOCIO VARCHAR(50))";
        db.execSQL(comandoCargo);

        String comandoServico = "CREATE TABLE " + TABELA_SERVICO + "(" +
                "NOME_SERVICO VARCHAR(50) PRIMARY KEY," +
                "DESC_SERVICO VARCHAR(100))";
        db.execSQL(comandoServico);

        String comandoContrato = "CREATE TABLE " + TABELA_CONTRATO + "( " +
                "COD_CONTRATO INTEGER PRIMARY KEY ," +
                "DESC_CONTRATO VARCHAR(150)," +
                "CPF_CLIENTE VARCHAR(14)," +
                "USUARIO_SOCIO VARCHAR(45)," +
                "NOME_SERVICO VARCHAR(50)," +
                "FOREIGN KEY (NOME_SERVICO) REFERENCES " + TABELA_SERVICO + "(NOME_SERVICO))";

        db.execSQL(comandoContrato);

        String comandoAtividade = "CREATE TABLE " + TABELA_ATIVIDADE + "( " +
                "COD_ATIVIDADE INTEGER PRIMARY KEY," +
                "DATA_INICIO DATE," +
                "DATA_FIM DATE," +
                "CPF_CLIENTE VARCHAR(14)," +
                "NOME_SERVICO VARCHAR(50)," +
                "COD_CONTRATO INTEGER," +
                "NOME_CARGO VARCHAR(20)," +
                "USUARIO_SOCIO VARCHAR(50)," +
                "FOREIGN KEY (CPF_CLIENTE) REFERENCES " + TABELA_CLIENTE + "(CPF_CLIENTE)," +
                "FOREIGN KEY (NOME_SERVICO) REFERENCES " + TABELA_SERVICO + "(NOME_SERVICO)," +
                "FOREIGN KEY (COD_CONTRATO) REFERENCES " + TABELA_CONTRATO + "(CODIGO_CONTRATO)," +
                "FOREIGN KEY (NOME_CARGO) REFERENCES " + TABELA_CARGO + "(NOME_CARGO)," +
                "FOREIGN KEY (USUARIO_SOCIO) REFERENCES " + TABELA_SOCIO + "(USUARIO_SOCIO))";

        db.execSQL(comandoAtividade);

//        Tabela de relação da atividade com o sócio;
//        String comandoAtividadeSocio = "CREATE TABLE " + TABELA_ATIVIDADE_SOCIO + "( " +
//                "COD_ATIVIDADE INTEGER," +
//                "COD_SOCIO INTEGER," +
//                "HORA_TOTAL CHAR(8),"+
//                "HORAS_ATIVIDADE CHAR(8)," +
//                "COD_CARGO INTEGER," +
//                "PRIMARY KEY(COD_ATIVIDADE, COD_SOCIO)," +
//                "FOREIGN KEY (COD_ATIVIDADE) REFERENCES " + TABELA_ATIVIDADE + "(COD_ATIVIDADE)," +
//                "FOREIGN KEY (COD_SOCIO) REFERENCES " + TABELA_SOCIO + "(COD_SOCIO)," +
//                "FOREIGN KEY (COD_CARGO) REFERENCES " + TABELA_CARGO + "(COD_CARGO))";
//
//        db.execSQL(comandoAtividadeSocio);
    }

    public Long inserirCliente(com.example.appmobile.ui.ClienteDTO clienteDTO) {
        ContentValues values = new ContentValues();

        values.put("CPF_CLIENTE", clienteDTO.getCpfCliente());
        values.put("NOME_CLIENTE", clienteDTO.getNomeCliente());
        values.put("TELEFONE_CLIENTE", clienteDTO.getTelefoneCliente());
        values.put("EMAIL_CLIENTE", clienteDTO.getEmailCliente());
        values.put("ENDERECO", clienteDTO.getEndereco());
        values.put("COMPLEMENTO", clienteDTO.getComplemento());
        values.put("BAIRRO", clienteDTO.getBairro());
        values.put("CEP", clienteDTO.getCep());
        values.put("CIDADE", clienteDTO.getCidade());
        values.put("ESTADO", clienteDTO.getEstado());

        long nLinhas = getWritableDatabase().insert(TABELA_CLIENTE, null, values);
        return nLinhas;
    }

    public ArrayList<ClienteDTO> consultarCliente() {
        String comando = "SELECT * FROM " + TABELA_CLIENTE;
        Cursor cursor = getReadableDatabase().rawQuery(comando, null);
        ArrayList<ClienteDTO> arrayListCliente = new ArrayList<>();

        while (cursor.moveToNext()) {
            ClienteDTO clienteDTO = new ClienteDTO();
            clienteDTO.setCpfCliente(cursor.getString(0));
            clienteDTO.setNomeCliente(cursor.getString(1));
            clienteDTO.setTelefoneCliente(cursor.getString(2));
            clienteDTO.setEmailCliente(cursor.getString(3));
            clienteDTO.setEndereco(cursor.getString(4));
            clienteDTO.setComplemento(cursor.getString(5));
            clienteDTO.setBairro(cursor.getString(6));
            clienteDTO.setCep(cursor.getString(7));
            clienteDTO.setCidade(cursor.getString(8));
            clienteDTO.setEstado(cursor.getString(9));

            arrayListCliente.add(clienteDTO);
        }

        return arrayListCliente;
    }


    public Long inserirSocio(SocioDTO socioDTO) {
        ContentValues values = new ContentValues();

        values.put("USUARIO_SOCIO", socioDTO.getLoginSocio());
        values.put("NOME_SOCIO", socioDTO.getNomeSocio());
        values.put("CARGO_SOCIO", socioDTO.getCargoSocio());
        values.put("EMAIL_SOCIO", socioDTO.getEmailSocio());
        values.put("TELEFONE_SOCIO", socioDTO.getTelefoneSocio());
        values.put("SENHA_LOGIN", socioDTO.getSenhaLogin());

        long nLinhas = getWritableDatabase().insert(TABELA_SOCIO, null, values);
        return nLinhas;
    }

    public ArrayList<SocioDTO> consultarSocio() {
        String comando = "SELECT * FROM " + TABELA_SOCIO;
        Cursor cursor = getReadableDatabase().rawQuery(comando, null);
        ArrayList<SocioDTO> arrayListSocio = new ArrayList<>();

        while (cursor.moveToNext()) {
            SocioDTO socioDTO = new SocioDTO();
            socioDTO.setLoginSocio(cursor.getString(0));
            socioDTO.setNomeSocio(cursor.getString(1));
            socioDTO.setCargoSocio(cursor.getString(2));
            socioDTO.setEmailSocio(cursor.getString(3));
            socioDTO.setTelefoneSocio(cursor.getString(4));
            socioDTO.setSenhaLogin(cursor.getString(5));

            arrayListSocio.add(socioDTO);
        }

        return arrayListSocio;
    }

    public Long inserirCargo(com.example.appmobile.ui.CargoDTO cargoDTO){
        ContentValues values = new ContentValues();

        values.put("NOME_CARGO", cargoDTO.getNomeCargo());
        values.put("HORAS_CARGO", cargoDTO.getHorasCargo());
        values.put("USUARIO_SOCIO", cargoDTO.getUsuarioSocio());

        long nLinhas = getWritableDatabase().insert(TABELA_CARGO,  null, values);
        return nLinhas;
    }

    public Long inserirServico(com.example.appmobile.ui.ServicoDTO servicoDTO){
        ContentValues values = new ContentValues();

        values.put("NOME_SERVICO", servicoDTO.getNomeServico());
        values.put("DESC_SERVICO", servicoDTO.getDescServico());

        long nLinhas = getWritableDatabase().insert(TABELA_SERVICO,  null, values);
        return nLinhas;
    }

    public Long inserirContrato(com.example.appmobile.ui.ContratoDTO contratoDTO){
        ContentValues values = new ContentValues();

        values.put("DESC_CONTRATO", contratoDTO.getDescContrato());
        values.put("CPF_CLIENTE", contratoDTO.getCfpCliente());
        values.put("USUARIO_SOCIO", contratoDTO.getUsuarioSocio());
        values.put("NOME_SERVICO", contratoDTO.getNomeServico());

        long nLinhas = getWritableDatabase().insert(TABELA_CONTRATO,  null, values);
        return nLinhas;
    }

    public ArrayList<ContratoDTO> consultarContrato() {
        String comando = "SELECT * FROM " + TABELA_CONTRATO;
        Cursor cursor = getReadableDatabase().rawQuery(comando, null);
        ArrayList<ContratoDTO> arrayListContrato = new ArrayList<>();

        while (cursor.moveToNext()) {
            ContratoDTO contratoDTO = new ContratoDTO();
            contratoDTO.setDescContrato(cursor.getString(0));
            contratoDTO.setCfpCliente(cursor.getString(1));
            contratoDTO.setUsuarioSocio(cursor.getString(2));
            contratoDTO.setNomeServico(cursor.getString(3));

            arrayListContrato.add(contratoDTO);
        }

        return arrayListContrato;
    }

    public Long inserirAtividade(com.example.appmobile.ui.AtividadeDTO atividadeDTO){
        ContentValues values = new ContentValues();

        values.put("COD_ATIVIDADE", atividadeDTO.getCodAtividade());
        values.put("DATA_INICIO", atividadeDTO.getDataInicio());
        values.put("DATA_FIM", atividadeDTO.getDataFim());
        values.put("NOME_SERVICO", atividadeDTO.getNomeServico());
        values.put("CPF_CLIENTE", atividadeDTO.getCpfCliente());
        values.put("USUARIO_SOCIO", atividadeDTO.getUsuarioSocio());
        values.put("NOME_CARGO", atividadeDTO.getNomeCargo());
        values.put("COD_CONTRATO", atividadeDTO.getCodContrato());

        long nLinhas = getWritableDatabase().insert(TABELA_ATIVIDADE,  null, values);
        return nLinhas;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
