package com.example.myrecyclerview;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames ={
            "Atletico Madrid",
            "FC Barcelona",
            "Chelsea FC",
            "Arsenal",
            "Bayern Munich",
            "Dortmund",
            "Liverpool",
            "Manchester City",
            "Manchester United",
            "Paris Saint German"
    };

    private static String[] heroDetails = {
            "Klub sepakbola asal Spanyol yang berbasis di Madrid. Mereka dikenal sebagai pesaing kuat di La Liga dan telah meraih berbagai gelar domestik dan internasional.",
            "Klub sepakbola ternama dari Spanyol yang juga berbasis di Barcelona. Mereka memiliki sejarah panjang dan telah memenangkan banyak gelar domestik dan Liga Champions.",
            "Klub sepakbola asal Inggris yang bermarkas di London. Chelsea merupakan salah satu klub papan atas di Liga Inggris dan memiliki sejumlah prestasi dalam beberapa tahun terakhir.",
            "Klub sepakbola Inggris dari London yang memiliki basis penggemar yang besar. Arsenal telah meraih banyak gelar Liga Inggris dan Piala FA.",
            "Klub sepakbola dari Jerman yang merupakan salah satu klub terkuat di Bundesliga dan sering kali bersaing di Liga Champions. Mereka memiliki sejarah prestasi yang mengesankan.",
            " Merujuk pada Borussia Dortmund, klub sepakbola Jerman yang terkenal dengan basis penggemar yang fanatik. Mereka telah meraih gelar Bundesliga dan mencapai final Liga Champions",
            "Klub sepakbola Inggris yang berbasis di Liverpool. Mereka memiliki basis penggemar yang besar dan telah meraih banyak gelar domestik dan internasional.",
            "Salah satu klub sepakbola terkemuka dari Manchester, Inggris. Mereka telah menjadi kekuatan besar dalam sepakbola Inggris dan telah memenangkan Liga Inggris.",
            "Klub sepakbola terkenal dari Manchester, Inggris, yang memiliki sejarah panjang prestasi. Mereka telah meraih banyak gelar Liga Inggris dan Liga Champions.",
            "Klub sepakbola asal Prancis yang berbasis di Paris. PSG telah menjadi salah satu klub terkemuka di Prancis dan memiliki sejumlah pemain bintang internasional dalam skuad mereka."

    };

    private static int[] heroesImages = {
            R.drawable.atm,
            R.drawable.fcb,
            R.drawable.chelsea,
            R.drawable.arsenal,
            R.drawable.bayern,
            R.drawable.dvb,
            R.drawable.lvp,
            R.drawable.mc,
            R.drawable.mu,
            R.drawable.psg
    };

    static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++){
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}
