/*
* File: MainController.java
* Author: Bognár Dávid
* Copyright: 2022, Bognár Dávid
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/BognarDavidMark/
* Licenc: GNU GPL
*/

package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.mainFrame.groupModel.addElement("Bognár Dávid");
        this.mainModel.groupList.forEach(group -> {
            this.mainFrame.groupModel.addElement(group.nev);
        });
        this.setEvents();
    }

    public void setEvents() {
        this.mainFrame.groupCombo.addActionListener(e -> onActionGroupCombo());
    }
    
    private void onActionGroupCombo() {
        int index = this.mainFrame.groupCombo.getSelectedIndex();
        int selectedGroupId = index;
        this.mainFrame.dolgozokModel.clear();
        this.mainModel.dolgozokList.forEach(Dolgozok -> {
            System.out.println(Dolgozok.groupId);

            if(selectedGroupId == Dolgozok.groupId) {
                this.mainFrame.dolgozokModel.addElement(Dolgozok.nev);
            }
        });
    }
}
