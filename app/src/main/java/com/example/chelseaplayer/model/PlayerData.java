package com.example.chelseaplayer.model;

import java.util.ArrayList;

public class PlayerData {



    private static String[] playerName = {
            "Kepa Arrizabalaga",
            "Andreas Christensen",
            "Marcos Alonso Mendoza",
            "Kurt Happy Zouma",
            "Antonio Rüdiger",
            "Filho Jorge Luiz",
            "N'Golo Kanté",
            "Mason Tony Mount",
            "Callum Hudson-Odoi",
            "Tammy Abraham",
            "Christian Mate Pulisic"

    };

    private static String[] playerPosition = {
            "GK",
            "DF",
            "LB",
            "CB",
            "RB",
            "CM",
            "DM",
            "LW",
            "RW",
            "CF",
            "RW"
    };

        private static String[] playerCountry = {
            "https://s.hs-data.com/bilder/flaggen_neu/48.gif",
                "https://s.hs-data.com/bilder/flaggen_neu/9.gif",
                "https://s.hs-data.com/bilder/flaggen_neu/48.gif",
                "https://s.hs-data.com/bilder/flaggen_neu/16.gif",
                "https://s.hs-data.com/bilder/flaggen_neu/11.gif",
                "https://s.hs-data.com/bilder/flaggen_neu/60.gif",
                "https://s.hs-data.com/bilder/flaggen_neu/16.gif",
                "https://s.hs-data.com/bilder/flaggen_neu/12.gif",
                "https://s.hs-data.com/bilder/flaggen_neu/82.gif",
                "https://s.hs-data.com/bilder/flaggen_neu/12.gif",
                "https://s.hs-data.com/bilder/flaggen_neu/27.gif"
    };

    private static String[] playerPhoto = {
            "https://s.hs-data.com/bilder/spieler/gross/204234.jpg",
            "https://s.hs-data.com/bilder/spieler/gross/228880.jpg",
            "https://s.hs-data.com/bilder/spieler/gross/148653.jpg",
            "https://s.hs-data.com/bilder/spieler/gross/189533.jpg",
            "https://s.hs-data.com/bilder/spieler/gross/174182.jpg",
            "https://s.hs-data.com/bilder/spieler/gross/196268.jpg",
            "https://s.hs-data.com/bilder/spieler/gross/211506.jpg",
            "https://s.hs-data.com/bilder/spieler/gross/337447.jpg",
            "https://s.hs-data.com/bilder/spieler/gross/369994.jpg",
            "https://s.hs-data.com/bilder/spieler/gross/267144.jpg",
            "https://s.hs-data.com/bilder/spieler/gross/276767.jpg"
    };

    private static int[] playerHeight = {
            189,
            188,
            188,
            190,
            190,
            180,
            169,
            178,
            182,
            190,
            172
    };

    private static int[] playerWeight = {
            85,
            78,
            85,
            96,
            85,
            65,
            68,
            70,
            76,
            80,
            69
    };

    private static int[] playerAge = {
            26,
            23,
            29,
            25,
            27,
            28,
            29,
            21,
            17,
            22,
            21
    };



    private static int[] playerMatch = {
            61,
            15,
            79,
            22,
            13,
            26,
            18,
            29,
            17,
            25,
            16
    };

    private static int[] playerGoal = {
            0,
            0,
            5,
            0,
            2,
            4,
            3,
            6,
            1,
            13,
            5

    };


    public  static ArrayList<Player> getListData() {
        ArrayList<Player> list = new ArrayList<>();
        for (int position = 0; position < playerName.length; position++ ) {
            Player player = new Player();
            player.setAge(playerAge[position]);
            player.setCountry(playerCountry[position]);
            player.setGoal(playerGoal[position]);
            player.setHeight(playerHeight[position]);
            player.setMatch(playerMatch[position]);
            player.setName(playerName[position]);
            player.setPhoto(playerPhoto[position]);
            player.setPosition(playerPosition[position]);
            player.setWeight(playerWeight[position]);
            list.add(player);
        }
        return list;
    }




}
