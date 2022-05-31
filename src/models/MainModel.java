/*
* File: MainModel.java
* Author: Bognár Dávid
* Copyright: 2022, Bognár Dávid
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/BognarDavidMark/
* Licenc: GNU GPL
*/

package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {

    public Group[] groupArray = {
        new Group(1, "Főnök"),
        new Group(2, "Részlegvezető"),
        new Group(3, "Osztályvezető"),
        new Group(4, "Csoportvezető"),
        new Group(5, "Programozó"),
        new Group(6, "Könyvelő"),
        new Group(7, "Rendszergazda"),
        new Group(8, "Portás"),
        new Group(9, "Takarító"),
        new Group(10, "Vagyonőr")
    };

    public Vector<Group> groupList = new Vector<>(Arrays.asList(groupArray));

    public Dolgozok[] dolgozokArray = {
        new Dolgozok(1, "Kala Pál", 1),
        new Dolgozok(2, "Heu Réka", 2),
        new Dolgozok(3, "Fá Zoltán", 3),
        new Dolgozok(4, "Kandisz Nóra", 4),
        new Dolgozok(5, "Körm Ödön", 5),
        new Dolgozok(6, "Aloe Vera", 6),
        new Dolgozok(7, "Git Áron", 5),
        new Dolgozok(8, "Vég Béla", 8),
        new Dolgozok(9, "Har Mónika", 9),
        new Dolgozok(10, "Lev Elek", 10),
        new Dolgozok(11, "Ipsz Ilonka", 4),
        new Dolgozok(12, "Metall Ica", 6),
        new Dolgozok(13, "Ria Dóra", 9),
        new Dolgozok(14, "Riz Ottó", 10),
        new Dolgozok(15, "Mor Zsolt", 7),
    };

    public Vector<Dolgozok> dolgozokList = new Vector<>(Arrays.asList(dolgozokArray));
}
