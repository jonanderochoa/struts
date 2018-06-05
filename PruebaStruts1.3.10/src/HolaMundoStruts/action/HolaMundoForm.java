package HolaMundoStruts.action;

import org.apache.struts.action.ActionForm;

public class HolaMundoForm extends ActionForm {

	private static final long serialVersionUID = 1L;
		private String mensaje;

		public String getMensaje() {
			return mensaje;
		}

		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}
}
