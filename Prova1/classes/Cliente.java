package Prova1.classes;
public class Cliente {

        private String nome;
        private String cpf;
        private String email;

        public Cliente(String nome, String email, String cpf){
            this.nome = nome;
            this.email = email;
            this.cpf = cpf;

        }
        public Cliente(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }
    
        public Cliente(String nome) {
            this.nome = nome;
        }


        public String getNome(){
            return this.nome;
        }

        public String getcpf(){
            return this.nome;
        }

        public String getemail(){
            return this.email;
        }
    
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public void setcpf(String cpf){
            this.cpf = cpf;
        }

        public void setemail(String email){
            this.email = email;
        }
    
        @Override
        public String toString(){
            return "Nome: " + this.nome +"\n" + "E-mail:" + this.email + "\n" + "CPF:" + this.cpf;
        }
}