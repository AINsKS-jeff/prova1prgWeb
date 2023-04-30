package br.com.funcionarios.domain;

public class funcionarios {
private int codFuncionarios;
private String nome;
private String cpf;
private int Rg;
private String Endereco;
private int Fone;
private String Email;
private int DataNas;
private int codConjuge;
private int DataReg;

public int getCodFuncionarios() {
	return codFuncionarios;
}
public void setCodFuncionarios(int codFuncionarios) {
	this.codFuncionarios = codFuncionarios;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public int getRg() {
	return Rg;
}
public void setRg(int rg) {
	Rg = rg;
}
public String getEndereco() {
	return Endereco;
}
public void setEndereco(String endereco) {
	Endereco = endereco;
}
public int getFone() {
	return Fone;
}
public void setFone(int fone) {
	Fone = fone;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public int getDataNas() {
	return DataNas;
}
public void setDataNas(int dataNas) {
	DataNas = dataNas;
}
public int getCodConjuge() {
	return codConjuge;
}
public void setCodConjuge(int codConjuge) {
	this.codConjuge = codConjuge;
}
public int getDataReg() {
	return DataReg;
}
public void setDataReg(int dataReg) {
	DataReg = dataReg;
}
	
}
