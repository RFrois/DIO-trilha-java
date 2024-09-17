package PrincipalClass.ModificadoresClasse;

public class MsgModificadores {
	
	private String msgPrivate;
	private String msgDefault;
	private String msgProteced;
	private String msgPublic;
	private String msgInicio;
	
	
	
	
	public MsgModificadores() {
		super();
	}
	public MsgModificadores(String msgInicio) {
		super();
		this.msgInicio = msgInicio;
	}
	
	//Construtor para deixar ou não uma objeto com atributos fixos  
	
	
	public String getMsgInicio() {
		return msgInicio;
	}
	public String getMsgPrivate() {
		return msgPrivate;
	}
	public void setMsgPrivate(String msgPrivate) {
		this.msgPrivate = msgPrivate;
	}
	public String getMsgDefault() {
		return msgDefault;
	}
	public void setMsgDefault(String msgDefault) {
		this.msgDefault = msgDefault;
	}
	public String getMsgProteced() {
		return msgProteced;
	}
	public void setMsgProteced(String msgProteced) {
		this.msgProteced = msgProteced;
	}
	public String getMsgPublic() {
		return msgPublic;
	}
	public void setMsgPublic(String msgPublic) {
		this.msgPublic = msgPublic;
	}

}
