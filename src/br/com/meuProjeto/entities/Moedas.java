package br.com.meuProjeto.entities;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

/**
 * Enumeração que representa diversas moedas e seus nomes completos.
 */
public enum Moedas {
    USD("Dólar Americano"),
    BRL("Real Brasileiro"),
    EUR("Euro"),
    AED("Dirham dos Emirados Arabes Unidos"),
    AFN("Afegane"),
    ALL("Lek Albanês"),
    AMD("Dram Armênio"),
    ANG("Florim das Antilhas Neerlandesas"),
    AOA("Kwanza Angolano"),
    ARS("Peso Argentina"),
    AUD("Dólar Australiano"),
    AWG("Florim Arubano"),
    AZN("Manat Azerbaijano"),
    BAM("Marco Convertível da Bósnia e Herzegovina"),
    BBD("Dólar de Barbados"),
    BDT("Taka de Bangladesh"),
    BGN("Lev Búlgaro"),
    BHD("Dinar Bareinita"),
    BIF("Franco Burundiano"),
    BMD("Dólar Bermudense"),
    BND("Dólar de Brunei"),
    BOB("Boliviano"),
    BSD("Dólar Bahamense"),
    BTN("Ngultrum Butanês"),
    BWP("Pula de Botswana"),
    BYN("Rublo Bielorrusso"),
    BZD("Dólar do Belize"),
    CAD("Dólar Canadense"),
    CDF("Franco Congolês"),
    CHF("Franco Suíço"),
    CLP("Peso Chileno"),
    CNY("Renminbi Chinês"),
    COP("Peso Colombiano"),
    CRC("Colón Costa-riquenho"),
    CUP("Peso Cubano"),
    CVE("Escudo Cabo-verdiano"),
    CZK("Coroa Checa"),
    DJF("Franco do Djibouti"),
    DKK("Coroa Dinamarquesa"),
    DOP("Peso Dominicano"),
    DZD("Dinar Argelino"),
    EGP("Libra Egípcia"),
    ERN("Nakfa da Eritreia"),
    ETB("Birr Etíope"),
    FJD("Dólar de Fiji"),
    FKP("Libra das Malvinas"),
    FOK("Coroa Feroesa"),
    GBP("Libra Esterlina"),
    GEL("Lari Georgiano"),
    GGP("Libra de Guernsey"),
    GHS("Cedi Ganense"),
    GIP("Libra de Gibraltar"),
    GMD("Dalasi da Gâmbia"),
    GNF("Franco da Guiné"),
    GTQ("Quetzal da Guatemala"),
    GYD("Dólar da Guiana"),
    HKD("Dólar de Hong Kong"),
    HNL("Lempira Hondurenha"),
    HRK("Kuna Croata"),
    HTG("Gourde Haitiano"),
    HUF("Florim Húngaro"),
    IDR("Rupia Indonésia"),
    ILS("Shekel Israelita"),
    IMP("Libra da Ilha de Man"),
    INR("Rupia Indiana"),
    IQD("Dinar Iraquiano"),
    IRR("Rial Iraniano"),
    ISK("Coroa Islandesa"),
    JEP("Libra de Jersey"),
    JMD("Dólar Jamaicano"),
    JOD("Dinar Jordaniano"),
    JPY("Iene Japonês"),
    KES("Xelim Queniano"),
    KGS("Som Quirguistanês"),
    KHR("Riel Cambojano"),
    KID("Dólar de Kiribati"),
    KMF("Franco Comoriano"),
    KRW("Won Sul-Coreano"),
    KWD("Dinar Kuwaitiano"),
    KYD("Dólar das Ilhas Caimão"),
    KZT("Tenge Cazaque"),
    LAK("Kip Laociano"),
    LBP("Libra Libanesa"),
    LKR("Rupia do Sri Lanka"),
    LRD("Dólar Liberiano"),
    LSL("Loti do Lesoto"),
    LYD("Dinar Líbio"),
    MAD("Dirham Marroquino"),
    MDL("Leu Moldávio"),
    MGA("Ariary Malgaxe"),
    MKD("Dinar Macedônio"),
    MMK("Kyat de Mianmar"),
    MNT("Tugrik Mongol"),
    MOP("Pataca de Macau"),
    MRU("Ouguiya Mauritana"),
    MUR("Rupia de Maurícia"),
    MVR("Rupia das Maldivas"),
    MWK("Kwacha do Malaui"),
    MXN("Peso Mexicano"),
    MYR("Ringgit Malaio"),
    MZN("Metical de Moçambique"),
    NAD("Dólar Namibiano"),
    NGN("Naira Nigeriana"),
    NIO("Córdoba Nicaraguense"),
    NOK("Coroa Norueguesa"),
    NPR("Rupia Nepalesa"),
    NZD("Dólar Neozelandês"),
    OMR("Rial Omanense"),
    PAB("Balboa Panamenho"),
    PEN("Sol Peruano"),
    PGK("Kina Papua-Nova-Guinéense"),
    PHP("Peso Filipino"),
    PKR("Rupia Paquistanesa"),
    PLN("Złoty Polonês"),
    PYG("Guarani Paraguaio"),
    QAR("Rial Catariano"),
    RON("Leu Romeno"),
    RSD("Dinar Sérvio"),
    RUB("Rublo Russo"),
    RWF("Franco Ruandês"),
    SAR("Rial Saudita"),
    SBD("Dólar das Ilhas Salomão"),
    SCR("Rupia Seichelense"),
    SDG("Libra Sudanesa"),
    SEK("Coroa Sueca"),
    SGD("Dólar de Singapura"),
    SHP("Libra de Santa Helena"),
    SLE("Leone de Serra Leoa"),
    SLL("Leone de Serra Leoa (antiga)"),
    SOS("Xelim Somali"),
    SRD("Dólar Surinamês"),
    SSP("Libra Sul-Sudanesa"),
    STN("Dobra São-Tomense"),
    SYP("Libra Síria"),
    SZL("Lilangeni da Suazilândia"),
    THB("Baht Tailandês"),
    TJS("Somoni do Tajiquistão"),
    TMT("Manat Turcomeno"),
    TND("Dinar Tunisiano"),
    TOP("Pa'anga Tonganesa"),
    TRY("Lira Turca"),
    TTD("Dólar de Trinidad e Tobago"),
    TVD("Dólar Tuvaluano"),
    TWD("Novo Dólar Taiwanês"),
    TZS("Xelim Tanzaniano"),
    UAH("Hryvnia Ucraniano"),
    UGX("Xelim Ugandense"),
    UYU("Peso Uruguaio"),
    UZS("Som Usbeque"),
    VES("Bolívar Venezuelano"),
    VND("Dong Vietnamita"),
    VUV("Vatu de Vanuatu"),
    WST("Tala Samoano"),
    XAF("Franco CFA (BEAC)"),
    XCD("Dólar do Caribe Oriental"),
    XDR("Direitos Especiais de Saque"),
    XOF("Franco CFA (BCEAO)"),
    XPF("Franco CFP"),
    YER("Rial Iemenita"),
    ZAR("Rand Sul-Africano"),
    ZMW("Kwacha Zambiano"),
    ZWL("Dólar Zimbabuense");

    private final String nome;

    /**
     * Construtor do enum Moedas.
     * @param nome Nome completo da moeda.
     */
    Moedas(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o nome completo da moeda.
     * @return O nome completo da moeda.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Busca a sigla da moeda pelo nome completo.
     * @param nomeMoeda Nome completo da moeda a ser buscada.
     * @return A sigla da moeda correspondente ao nome completo fornecido.
     */
    public static String siglaPeloNome(String nomeMoeda) {
        String nomeMoedaNormalizado = Normalizer.normalize(nomeMoeda, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .toLowerCase(); // Remove acentos e converte para minúsculas

        for (Moedas moeda : Moedas.values()) {
            String nomeMoedaEnumNormalizado = Normalizer.normalize(moeda.getNome(), Normalizer.Form.NFD)
                    .replaceAll("[^\\p{ASCII}]", "")
                    .toLowerCase(); // Remove acentos e converte para minúsculas

            if (nomeMoedaEnumNormalizado.equalsIgnoreCase(nomeMoedaNormalizado)) {
                return moeda.name(); // Retorna a sigla se o nome completo da moeda for encontrado
            }
        }

        // Se não encontrou pelo nome completo, tenta encontrar por parte do nome
        List<String> siglasEncontradas = new ArrayList<>();
        for (Moedas moeda : Moedas.values()) {
            String nomeMoedaEnumNormalizado = Normalizer.normalize(moeda.getNome(), Normalizer.Form.NFD)
                    .replaceAll("[^\\p{ASCII}]", "")
                    .toLowerCase(); // Remove acentos e converte para minúsculas

            if (nomeMoedaEnumNormalizado.contains(nomeMoedaNormalizado)) {
                siglasEncontradas.add(moeda.name());
            }
        }

        if (!siglasEncontradas.isEmpty()) {
            System.out.println("Moedas encontradas:");
            for (String sigla : siglasEncontradas) {
                System.out.println(sigla + " - " + Moedas.valueOf(sigla).getNome());
            }
        } else {
            System.out.println("Não foi possível encontrar a moeda correspondente. \nPor favor, insira manualmente a sigla da moeda corrente.");
        }

        return null;
    }
}
