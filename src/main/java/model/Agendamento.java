package src.main.java.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import utils.ModelBase;

@MappedSuperclass
public abstract class Agendamento extends ModelBase {
	@Column(length=20, nullable=false)
	private Date dataAtendimento;
	@Column(length=20, nullable=true)
	private String hora;
	@ManyToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	public Date getDataAtendimento() {
		return dataAtendimento;
	}
	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
