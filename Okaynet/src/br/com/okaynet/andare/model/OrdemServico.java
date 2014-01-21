/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author Erick
 */
@Entity
public class OrdemServico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataCadastro;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataVencimento;
    @ManyToOne(fetch = FetchType.EAGER)
    private Pessoa cliente;
    @ManyToOne(fetch = FetchType.EAGER)
    private Funcionario funcionario;
    @Basic
    @Column(length = 200)
    private String item1;
    @Basic
    @Column(length = 200)
    private String item2;
    @Basic
    @Column(length = 200)
    private String item3;
    @Basic
    @Column(length = 200)
    private String item4;
    private Double valor1;
    private Double valor2;
    private Double valor3;
    private Double valor4;
    private Double valorTotal;
    private String status;
    private Integer parcelas;
    private Integer parcelasRestantes;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.REMOVE)
    private Endereco endereco;
    private String banco;
    private String tipoCheque;
    private double juros;
    private String valorPorExtenso;

    private String nomeDoCheque;
    private String cnpjDoCheque;
    private String valorDoCheque;
    private String dataCheque;
    private String agenciaCheque;
    private String contaCheque;
    private String statusDoServivo;

    private String equipamento;
    private String modelo;
    private String marca;
    private String acessorio;
    private String serie;
    private String problemaInformado;
    private Double deslocamento;

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getProblemaInformado() {
        return problemaInformado;
    }

    public void setProblemaInformado(String problemaInformado) {
        this.problemaInformado = problemaInformado;
    }

    public Double getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(Double deslocamento) {
        this.deslocamento = deslocamento;
    }

    public String getStatusDoServivo() {
        return statusDoServivo;
    }

    public void setStatusDoServivo(String statusDoServivo) {
        this.statusDoServivo = statusDoServivo;
    }

    public String getNomeDoCheque() {
        return nomeDoCheque;
    }

    public void setNomeDoCheque(String nomeDoCheque) {
        this.nomeDoCheque = nomeDoCheque;
    }

    public String getCnpjDoCheque() {
        return cnpjDoCheque;
    }

    public void setCnpjDoCheque(String cnpjDoCheque) {
        this.cnpjDoCheque = cnpjDoCheque;
    }

    public String getValorDoCheque() {
        return valorDoCheque;
    }

    public void setValorDoCheque(String valorDoCheque) {
        this.valorDoCheque = valorDoCheque;
    }

    public String getDataCheque() {
        return dataCheque;
    }

    public void setDataCheque(String dataCheque) {
        this.dataCheque = dataCheque;
    }

    public String getAgenciaCheque() {
        return agenciaCheque;
    }

    public void setAgenciaCheque(String agenciaCheque) {
        this.agenciaCheque = agenciaCheque;
    }

    public String getContaCheque() {
        return contaCheque;
    }

    public void setContaCheque(String contaCheque) {
        this.contaCheque = contaCheque;
    }

    public OrdemServico() {
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public String getValorPorExtenso() {
        return valorPorExtenso;
    }

    public void setValorPorExtenso(String valorPorExtenso) {
        this.valorPorExtenso = valorPorExtenso;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTipoCheque() {
        return tipoCheque;
    }

    public void setTipoCheque(String tipoCheque) {
        this.tipoCheque = tipoCheque;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getParcelasRestantes() {
        return parcelasRestantes;
    }

    public void setParcelasRestantes(Integer parcelasRestantes) {
        this.parcelasRestantes = parcelasRestantes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Calendar getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valor) {
        this.valorTotal = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        this.item3 = item3;
    }

    public String getItem4() {
        return item4;
    }

    public void setItem4(String item4) {
        this.item4 = item4;
    }

    public Double getValor1() {
        return valor1;
    }

    public void setValor1(Double valor1) {
        this.valor1 = valor1;
    }

    public Double getValor2() {
        return valor2;
    }

    public void setValor2(Double valor2) {
        this.valor2 = valor2;
    }

    public Double getValor3() {
        return valor3;
    }

    public void setValor3(Double valor3) {
        this.valor3 = valor3;
    }

    public Double getValor4() {
        return valor4;
    }

    public void setValor4(Double valor4) {
        this.valor4 = valor4;
    }

    @Override
    public String toString() {
        return "OrdemServico{" + "id=" + id + ", dataCadastro=" + dataCadastro + ", dataVencimento=" + dataVencimento + ", cliente=" + cliente + ", funcionario=" + funcionario + ", item1=" + item1 + ", item2=" + item2 + ", item3=" + item3 + ", item4=" + item4 + ", valor1=" + valor1 + ", valor2=" + valor2 + ", valor3=" + valor3 + ", valor4=" + valor4 + ", valorTotal=" + valorTotal + ", status=" + status + ", parcelas=" + parcelas + ", parcelasRestantes=" + parcelasRestantes + ", endereco=" + endereco + ", banco=" + banco + ", tipoCheque=" + tipoCheque + ", juros=" + juros + ", valorPorExtenso=" + valorPorExtenso + '}';
    }

}
