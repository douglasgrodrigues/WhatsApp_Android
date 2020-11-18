package com.example.whatsapp.activity.model;

import com.example.whatsapp.activity.config.ConfiguracaoFirebase;
import com.google.firebase.database.DatabaseReference;

public class Conversa {

    private String idRemetenta;
    private String idDestinatario;
    private String ultimaMensagem;
    private Usuario usuarioExibicao;

    public Conversa() {
    }

    public void salvar() {
        DatabaseReference database = ConfiguracaoFirebase.getFirebaseDataBase();
        DatabaseReference conversaRef = database.child("conversas");

        conversaRef.child(this.getIdRemetenta())
                .child(this.getIdDestinatario())
                .setValue(this);
    }

    public String getIdRemetenta() {
        return idRemetenta;
    }

    public void setIdRemetenta(String idRemetenta) {
        this.idRemetenta = idRemetenta;
    }

    public String getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(String idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public String getUltimaMensagem() {
        return ultimaMensagem;
    }

    public void setUltimaMensagem(String ultimaMensagem) {
        this.ultimaMensagem = ultimaMensagem;
    }

    public Usuario getUsuarioExibicao() {
        return usuarioExibicao;
    }

    public void setUsuarioExibicao(Usuario usuarioExibicao) {
        this.usuarioExibicao = usuarioExibicao;
    }
}
