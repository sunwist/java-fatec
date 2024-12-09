package imobiliaria;

public class Imobiliaria {

    public static void main(String[] args) {
        Imovel imv1 = new Comercial("Escritorio", 01, "Rua", 133, "Joao");
        Imovel imv2 = new Residencial(2, 40, 02, "Rua", 133, "Lucas");
        
        ListaImoveis lista = new ListaImoveis(5);
        
        lista.cadastrarImovel(imv1);
        lista.cadastrarImovel(imv2);
        
        lista.listarImoveis("DISPONIVEIS", true, false);
        lista.listarImoveis("DISPONIVEIS", false, true);
        
        
    }
    
}
