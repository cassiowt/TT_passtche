package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTES")
public class ClienteED extends PessoaED {

	@Column (name = "CPF", length = 14)
	private String cpf;
        
        @Column (name = "RG", length = 12)
	private String rg;
                
        @Column (name = "STATUS")
	private boolean status;

        public String getRg() {
            return rg;
        }

        public void setRg(String rg) {
            this.rg = rg;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "ClienteED{" +
				"cpf='" + cpf + '\'' +
                                ", rg='" + rg + '\'' +
                                ", status='" + status + '\'' +
				"} " + super.toString();
	}
}
