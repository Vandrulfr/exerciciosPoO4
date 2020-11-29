package exercicios;

public class CampoFutebol {
    int area_metro = 8250;
    
    void converte_area(){
       System.out.println("Pes: "+ ConversaoDeUnidadeDeArea.metro_pe(area_metro));
       System.out.println("Acres: "+ ConversaoDeUnidadeDeArea.pe_acre(ConversaoDeUnidadeDeArea.metro_pe(area_metro)));
       System.out.println("Centrimetros: "+ ConversaoDeUnidadeDeArea.metro_cm(area_metro));
    }

    public CampoFutebol(int area_metro) {
        this.area_metro = area_metro;
    }

    public CampoFutebol() {
    }
}
