package imobiliaria;

public class ListaImoveis implements Control {
    private Imovel imoveis[];
    private int contador;
    private String nomeCorretor;

    public ListaImoveis(int capacidade) {
        imoveis = new Imovel[capacidade];
        this.contador = 0;
        this.nomeCorretor = null;
    }
    
    @Override
    public void cadastrarImovel(Imovel imv) {
        // if(contador >= imoveis.length) return throw new ArrayLotado();
        for (int i = 0; i < contador; i++) {
            if(imoveis[i].getCod() == imv.getCod()){
                //throw new CodigoExistente();
                return;
            }
        }
        imoveis[contador] = imv;
        contador++;
    }

    @Override
    public void alugarImovel(int codigo, String corretor) {
        for (int i = 0; i < contador; i++) {
            if(imoveis[i].getCod() == codigo){
                if(imoveis[i].isDisponivelAluguel() == false){
                    // throw new ImovelIndisponivel(); 
                    return;
                }
               imoveis[i].setDisponivelAluguel(false);
               this.nomeCorretor = corretor;
               return;
            }else{
                //throw new CodigoNaoExistente();
            }
        }
    }

    @Override
    public void venderImovel(int codigo, String corretor) {
        for (int i = 0; i < contador; i++) {
            if (imoveis[i].getCod() == codigo) {
                if(imoveis[i] instanceof Comercial){
                    
                    //throw new ImovelComercial();
                    return;
                }
                if(imoveis[i].isDisponivelVenda() == false){
                    // throw new ImovelIndisponivel();
                    return;
                }
                boolean result = false;
                imoveis[i].setDisponivelVenda(result);
                this.nomeCorretor = corretor;
            }else{
                    //throw new CodigoNaoExistente();
                    return;
            }
        }
    }

    @Override
    public void listarImoveis(String titulo, boolean apenasDisponiveis, boolean residenciais) {
        System.out.print("\n\n----- LISTAGEM DE IMOVEIS -----\n\n");
        System.out.println(titulo);
        
            /*if(apenasDisponiveis == true){
                for (int i = 0; i < contador; i++) {
                    if(imoveis[i].isDisponivelAluguel()){
                        imoveis[i].print();
                        System.out.print("\nNome do Corretor= " + this.nomeCorretor);
                        return;
                    }else{
                        imoveis[i].print();
                    }
                }
            }*/
            
            //if(residenciais == true){
                for (int i = 0; i < contador; i++) {
                    if(imoveis[i] instanceof Residencial){
                        imoveis[i].print();
                        System.out.print("Nome do Corretor= " + this.nomeCorretor);
                        return;
                    }
                }
            //}
            /*for (int i = 0; i < contador; i++) {
                imoveis[i].print();
                System.out.print("Nome do Corretor= " + this.nomeCorretor);
            }*/
        } 
}
