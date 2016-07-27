package net.boukhalfa.gottalovealgeria;

/**
 * Created by Hamza on 23/07/2016.
 */
public class TaxiData {
    private String[] TaxiName ={"EURL TAXI ANES & ZOHER",
            "CHABAB AURES TRANSPORT SARL",
            "EL MINZEH SERVICES EURL",
            "RADIO TAXI COMPANY",
            "SARL TAXI SUD",
            "BENALI ETS",
            "ELAN",
            "CITY TAXI SARL",
            "MIXTE TAXI",
            "EL BAHDJA TAXIS RADIO EURL",
            "ENTREPRISE EL YAKIN 24/24 EUR",
            "ENTREPRISE DE TAXI RADIO LOCAT",
            "ABOU SOUFIANE SERVICE TAXI EURL",
            "EL MAJD EURL",
            "MEGAHAR EURL",
            "ABDELAZIZ SERVICES EURL ",
            "ALPHA TAXI SARL ",
            "TAXI BORDJ EURL ",
            "BEDRANE SAAD EURL",
            "SOUFIA TAXI EURL",
            "RADIO TAXI RHUMMEL",
            "RADIO TAXI CIRTA",
            "RADIO TAXI TIDDIS",
    };
    private String[] TaxiPhone ={"027 79 94 94",
            "033 86 48 88",
            "049 81 11 11",
            "0670 15 21 27",
            "0664 30 52 64",
            "043 21 12 12",
            "0555 00 56 54",
            "021 79 01 28",
            "021 95 85 37",
            "021 96 12 12",
            "0560 94 44 80",
            "038 51 16 02",
            "045 26 80 89",
            "045 81 18 18",
            "029 75 55 60",
            "041 41 76 59",
            "041 28 68 83",
            "035 68 92 54",
            "0560 06 90 36",
            "032 24 44 44",
            "031 66 60 60",
            "030 80 20 20",
            "030 20 10 10",
    };
    private String[] TaxiCity={"chlef",
            "Batna",
            "Béchar",
            "Bouira",
            "Tamanrasset",
            "TELEMCEN",
            "tizi ouzou",
            "alger",
            "alger",
            "alger",
            "sidi bel abbès",
            "annaba",
            "mostaganem",
            "mascara",
            "ourgla",
            "oran",
            "oran",
            "cbordj bou arreridj",
            "tissemsilt",
            "el oued",
            "constantine",
            "constantine",
            "constantine",
    };

    public String getTaxiName(int id) {
        return TaxiName[id];
    }

    public String getTaxiPhone(int id) {
        return TaxiPhone[id];
    }

    public String getTaxICity(int id) {
        return TaxiCity[id];
    }
    public int getTotalTaxiCount(){
        int total = TaxiName.length;
        return total;
}

}