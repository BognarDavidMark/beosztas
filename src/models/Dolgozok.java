/*
* File: Dolgozok.java
* Author: Bognár Dávid
* Copyright: 2022, Bognár Dávid
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/BognarDavidMark/
* Licenc: GNU GPL
*/

package models;

public class Dolgozok {
    public int id;
    public String nev;
    public int groupId;

    public Dolgozok(int id, String nev, int groupId) {
        this.id = id;
        this.nev = nev;
        this.groupId = groupId;

    }
}