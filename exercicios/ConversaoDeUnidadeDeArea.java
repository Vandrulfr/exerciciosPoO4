package exercicios;

class ConversaoDeUnidadeDeArea {
    public static float metro_pe(float metro){
        return (metro * 10.76f);
    }
    public static float pe_cm(float pe){
        return (pe * 929);
    }
    public static float milha_acre(float milha){
        return (milha * 640);
    }
    public static float acre_pe(float acre){
        return (acre * 43.560f);
    }
    public static float pe_acre(float pe){
        return (pe/43.560f);
    }
    public static float cm_metro(float cm) {
        return (cm/10000);
    }
    public static float metro_cm(float metro){
        return (metro*10000);
    }
    
}