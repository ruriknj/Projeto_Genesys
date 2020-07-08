package controle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "Calculadora")
@RequestScoped
public class CalculadoraBean {

	private double valor1;
	private double valor2;
	private double resultado;
	private String msg;

	public void somar() {
		this.resultado = this.valor1 + this.valor2;
		System.out.println("Executei a SOMA!!!");

	}

	public void subitrair() {
		this.resultado = this.valor1 - this.valor2;

	}

	public void dividir() {
		if (this.valor2 != 0) {
			this.resultado = this.valor1 / this.valor2;
			this.msg = " ";
		} else {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null,
					new FacesMessage("Valor Inválido", "Não é aceitável zero: " + "Digite outro número"));
			this.msg = "Erro: Não pode dividir por ZERO!!";
		}

	}

	public void multiplicar() {
		this.resultado = this.valor1 * this.valor2;

	}

	public void msg() {

		if (this.valor2 == 0) {
			this.msg = "Erro: Não pode dividir por ZERO!!";
		} else {
			this.msg = "";
		}
	}

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
