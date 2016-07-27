package net.boukhalfa.gottalovealgeria;

/**
 * Created by Hamza on 23/07/2016.
 */
public class RestoData {
    private String[] RestoName ={"OXYGENE cafétaria-snack",
            "Titta lunch",
            "César Gelateria",
            "Café Riche Lounge",
            "Khaymat el hodna plats traditionnelles",
            "café time constantine",
            "restaurant dasine",
            "le casbah turkish restaurant",
            "Restaurant hour in lebanon",
            "Restaurant le chalet du lac ",
            "Restaurant al bustan",
            "Restaurant arabesque ",
            "L'equinoxe restaurant",
            "TAMAGHRA AQUAPARC",
            "l'emporter ",
            "Restaurant le grand bleu",
            "chic chic restaurant",
            "LA MAISON DU COUSCOUS",
            "GRIAL CAFé RESTAURANT",
            "AQUAFORLAND",
            "restaurant pizzeria l'hacienda",
            "MEKERRA RESTAURANT",
            "restaurant l'olivier ",
            "sun rise ",
            "ZENOBIA",
            "MAHARAJA INDIAN RESTAURANT",
            "LE JARDIN D'Italie ",
    };
    private String[] RestoPhone ={"031 87 61 96/ 0772 82 54 85",
            "0552 03 06 03",
            "",
            "031 87 11 22",
            "",
            "031 86 61 13",
            "0791 16 08 71",
            "0770 51 79 54",
            "0777 74 74 50",
            "055 68 04 10",
            "043 40 11 11",
            "043 40 11 11",
            "043 38 45 48",
            "026 21 73 22",
            "0554 83 30 33",
            "021 30 65 61",
            "0661 57 52 22",
            "0770 12 25 03",
            "0770 70 16 16",
            "0976 75 76 77",
            "036 51 20 18",
            "0550 71 22 94",
            "0666 02 11 06",
            "038 88 25 46",
            "045 30 91 50",
            "041 42 72 22",
            "0550 96 60 01",

    };
    private String[] RestoCity ={"08, Rue SI EL Haoues El Casbah, constantine",
            "Sidi Mebrouk, Superieur, Constantine",
            "Nouvelle Ville , constantine",
            "casbah , constantine",
            "nouvelle Ville , constantine",
            "nouvelle Ville , constantine",
            "Bejaia",
            "05 Boulevard larbi tebessi , Blida",
            "zabana devant mosquée ibn badis, BLIDA",
            "sur le plateau de lala setti TELEMCEN",
            "hotel renaissance, lalla setti, TELEMCEN",
            "hotel renaissance, lalla setti, TELEMCEN",
            "Bd,Med V (face hopital) 13000, TELEMCEN",
            "lotissement veuve amirouche-quartier A_ nouvelle ville, TIZI OUZOU",
            "a coté du trésor public TIZI OUZOU",
            "118, route du port B djamila (ex la madrague) ALGER",
            "avenue sidi yahia , hyDra; ALGER",
            "5, rue salah rasdi, Alger",
            "Villa 3- Val d'hydra ,",
            "56 RN 24 bordj el kiffen",
            "boulevard de l'aln bel air, SETIF",
            "Sidi djillali  SIDI BEL ABBES",
            "seraidi 23000 ANNABA",
            "15 hai rizzi amor oued kouba, plage chapuis, bel azur , ANNABA",
            "ROUTE d'oran en face du tribunal MOSTAGHANEM",
            "02, cite courbet , hai seddikia, ORAN",
            "es seddikia au boulevard trait d'union ORAN",

    };

    public String getRestoName(int id) {
        return RestoName[id];
    }

    public String getRestoPhone(int id) {
        return RestoPhone[id];
    }

    public String getRestoCity(int id) {
        return RestoCity[id];
    }
    public int getTotalRestoCount(){
        int total = RestoName.length;
        return total;
}
}