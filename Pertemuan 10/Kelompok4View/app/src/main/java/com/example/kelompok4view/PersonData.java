package com.example.kelompok4view;

import java.util.ArrayList;

public class PersonData {
    private static String[] personNames ={
            "Isabel Rose",
            "Dwi Krisdiyanto",
            "Pelangi Dwi Mawarni",
            "Pangestu Dwi Panggo"
    };

    private static String[] personDetails = {
            "Isabel Rose, lahir di Jakarta pada tanggal 9 Desember 2002, tetapi dia sekarang tinggal di Manila, Filipina. Hobi utamanya adalah membantu orang, yang mencerminkan kepribadiannya yang peduli dan empatik. Cita-citanya adalah memiliki raket senilai 5 juta, mungkin sebagai hadiah atau keinginan pribadi yang unik",
            "Dwi Krisdiyanto adalah seorang yang lahir di Jakarta pada tanggal 20 Januari 2003. Dia tinggal di Kota Bekasi, Bekasi Utara. Hobi utamanya adalah bermain game RPG, yang membuatnya sering terlibat dalam petualangan seru di dunia maya. Cita-citanya adalah hidup dengan kenyamanan sebagai prioritas utama.",
            "Pelangi Dwi Mawarni lahir di Bekasi pada tanggal 5 Januari 2004. Saat ini, dia tinggal di Depok, Jawa Barat. Hobi favoritnya adalah menonton film, mungkin dia suka mengeksplorasi berbagai cerita yang berbeda melalui layar. Cita-citanya adalah menjadi orang kaya, mungkin sebagai hasil dari usaha dan kesuksesan di masa depan.",
            "Pangestu Dwi Panggo lahir di Jakarta pada tanggal 3 September 2002 dan saat ini tinggal di Srenseng Sawah, Jakarta Selatan. Hobi yang dia nikmati adalah Zumba, menunjukkan minatnya pada kebugaran dan tarian. Cita-citanya adalah melakukan perjalanan haji bersama keluarganya, suatu tujuan spiritual yang luhur."
    };

    private static int[] personImages = {
            R.drawable.isabel,
            R.drawable.dwi,
            R.drawable.pelangi,
            R.drawable.pangestu,
    };

    static ArrayList<Person> getListData(){
        ArrayList<Person> list = new ArrayList<>();
        for (int position = 0; position < personNames.length; position++){
            Person person = new Person();
            person.setName(personNames[position]);
            person.setDetail(personDetails[position]);
            person.setPhoto(personImages[position]);
            list.add(person);
        }
        return list;
    }
}
