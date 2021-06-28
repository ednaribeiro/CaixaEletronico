
package caixaeletronico_ui;


public class Conta {
   /*
    ATRIBUTOS: SÃO ESTRUTURAS QUE REPRESENTAM E  ARMAZENA OS DADOS DA CLASSE.
    EX: AGENCIA, CONTA, SALDO, SENHA
    ATRIBUTOS POSSUEM DUAS ESTRUTURAS BÁSICAS: VISIBILIDADE E TIPO DE DADO
    VISIBILIDADE: DEFINE O NIVEL DE ACESSO NO PROJETO.(CAPACIDADE DE ACESSO)
    TIPO DE DADO: DEFINE A CAPACIDADE DE ARMAZENAMENTO DE DADOS DO ATRIBUTO.
    */
    /*DECLARAÇÃO DOS ATRIBUTOS DA CLASSE CONTA
    ESTRUTURA DE DECLARAÇÃO DE UM ATRIBUTO:
    1º PARTES - VISIBILIDADE
    2º PARTES - TIPO
    3º PARTES - NOME
    OPICIONAL
    4º PARTE - ATRIBUIÇÃO DE VALOR OU DE DADO
    */
    /*
    TIPOS DE VISIBILIDADES:
    PUBLIC - PERMITE ACESSO DE QUALQUER ESTRUTURA DO CÓDIGO
    PROTECTED
    PRIVATE
    */
    public String agencia = "000-20-X";
    public String nroConta = "1234-0002-B";
    public float saldo = 6000;
    
    
    /*
    MÉTODOS: SÃO ESTRUTURAS QUE REPRESENTAM AS
    AÇÕES QUE A CLASSE É CAPAZ DE EXECUTAR,
    EX: VERIFICAR SALDOS, REALIZAR DEPÓSITOS, REALIZAR SAQUE...
    */
    /*
    DECLARAÇÃO DE MÉTODOS:
    1º PARTE - VISIBILIDADE
    2º PARTE - TIPO RETORNO DO MÉTODO
    3º PARTE - NOME DO MÉTODO
    4º PARTE - CABEÇALHO DE PARAMETROS
    5º PARTE - CORPO DO MÉTODO
    */
    public float verificarSaldo() {
    
    //SAIDA DE TEXTO DO MÉTODO verificarSaldo
    
     return this.saldo;
    
    }//FECHAMENTO DO MÉTODO           
    
    /*MÉTODO DE REALIZAR DEPOSITO*/
    public void realizarDeposito(float valor){
    
        /*PRIMEIRA FORMA*/
       //this.saldo = this.saldo + valor;
       
       /*SEGUNDA FORMA*/
       this.saldo += valor; //MAIS USADO NO DIA A DIA
        
    }
            
    /*MÉTODO DE REALIZAR SAQUE*/
    public void realizarSaque(float valor){
    
    this.saldo -= valor;    
    
    }
    
     
} //FECHAMENTO DA CLASSE
