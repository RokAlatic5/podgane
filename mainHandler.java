package com.yellow.parser;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_COLOR_BURNPeer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class mainHandler extends Frame implements ActionListener{

    //discord invite elements

     static JLabel nsfwLevel;
     static JTextField inviteText;
     static JLabel labelInviter;
     static JLabel labelInfo;
     static JLabel labelInfo3;
     static JLabel labelInfo2;
     static JLabel labelIsBot;
     static JLabel labelInfo4;
     static JButton button;
     static JButton buttonBack;
     static String code;

    static ActionListener actionListener = new discordInviteChecker();

    //url scan elements

    static JTextField textF;
    static JLabel labelHost;
    static JLabel labelPort;
    static JLabel labelIp;
    static JLabel location;
    static JLabel city ;
    static JButton ScanButton;
    static JButton ScanButtonBack;
    static JButton ipInfo;
    static JLabel labelProt;
    static JLabel countryName;
    static JLabel cityName;
    static JLabel postal;
    static JLabel state;
    static JLabel continent;
    static JLabel timeZone;
    static JLabel longitude;
    static JLabel latitude;
    static JLabel accuracyRadius;
    static JLabel population;
    static JLabel income;
    static JLabel hashCode;
    static JLabel geoName;

    static ActionListener urlActionListener = new urlInfo();

    //main menu elements

    static JButton urlScanButton;
    static JButton tokenScanButton;
    static JButton discordInviteCheckButton;
    static JButton virusScan;

    static JPanel panel = new JPanel();



    static JFrame frame = new JFrame();


    public static void main(String args[]){

        new mainHandler();

    }

    public mainHandler(){

        panel.setSize(300, 300);
        panel.setVisible(true);

        //Main Menu Elements
        frame.setSize(300,300);
        frame.setVisible(true);

        urlScanButton = new JButton();
        urlScanButton.setText("URL Scan");
        urlScanButton.addActionListener(this);
        urlScanButton.setSize(95, 30);
        urlScanButton.setVisible(true);

        tokenScanButton = new JButton();
        tokenScanButton.setText("Token Scan");
        tokenScanButton.addActionListener(this);
        tokenScanButton.setSize(105, 30);
        tokenScanButton.setVisible(true);

        discordInviteCheckButton = new JButton();
        discordInviteCheckButton.setText("Discord Invite Checker");
        discordInviteCheckButton.addActionListener(this);
        discordInviteCheckButton.setSize(170, 30);
        discordInviteCheckButton.setVisible(true);

        virusScan = new JButton();
        virusScan.setText("Virus Scan");
        virusScan.addActionListener(this);
        virusScan.setSize(100, 30);
        virusScan.setVisible(true);

        //Discord invite elements

        inviteText = new JTextField();
        inviteText.setBounds(50,30, 150,20);
        inviteText.setVisible(false);

        buttonBack = new JButton();
        buttonBack.setBounds(50,285,95,30);
        buttonBack.addActionListener(actionListener);
        buttonBack.setText("Back");
        buttonBack.setVisible(false);

        labelInviter = new JLabel();
        labelInviter.setBounds(50,100, 350,20);
        labelInviter.setVisible(false);

        labelIsBot = new JLabel();
        labelIsBot.setBounds(50,115, 350,20);
        labelIsBot.setVisible(false);

        button = new JButton();
        button.setText("Find Info");
        button.setBounds(50,250,95,30);
        button.addActionListener(actionListener);
        button.setVisible(false);

        labelInfo = new JLabel();
        labelInfo.setBounds(50,130, 350,20);
        labelInfo.setVisible(false);

        labelInfo2 = new JLabel();
        labelInfo2.setBounds(50,145, 350,20);
        labelInfo2.setVisible(false);

        labelInfo3 = new JLabel();
        labelInfo3.setBounds(50,160, 350,20);
        labelInfo3.setVisible(false);

        labelInfo4 = new JLabel();
        labelInfo4.setBounds(50, 175, 350, 20);
        labelInfo4.setVisible(false);

        nsfwLevel = new JLabel();
        nsfwLevel.setBounds(50, 190, 350, 20);
        nsfwLevel.setVisible(false);

        //url scan components

        textF = new JTextField();
        textF.setBounds(50,50, 150,20);
        textF.setVisible(false);

        ScanButtonBack = new JButton();
        ScanButtonBack.setBounds(50,180,95,30);
        ScanButtonBack.addActionListener(urlActionListener);
        ScanButtonBack.setText("Back");
        ScanButtonBack.setVisible(false);

        labelHost = new JLabel();
        labelHost.setBounds(50,100, 250,20);
        labelHost.setVisible(false);

        labelPort = new JLabel();
        labelPort.setBounds(50,115, 250,20);
        labelPort.setVisible(false);

        labelProt = new JLabel();
        labelProt.setBounds(50,115, 250,20);
        labelProt.setVisible(false);

        labelIp = new JLabel();
        labelIp.setBounds(50,130, 250,20);
        labelIp.setVisible(false);

        city = new JLabel();
        city.setBounds(50, 160, 250, 20);
        city.setVisible(false);

        location = new JLabel();
        location.setBounds(50, 190, 250, 20);
        location.setVisible(false);

        countryName = new JLabel();
        countryName.setBounds(180, 85, 250, 20);
        countryName.setVisible(false);

        cityName = new JLabel();
        cityName.setBounds(180, 100, 250, 20);
        cityName.setVisible(false);

        postal = new JLabel();
        postal.setBounds(180, 115, 250, 20);
        postal.setVisible(false);

        state = new JLabel();
        state.setBounds(180, 130, 250, 20);
        state.setVisible(false);

        continent = new JLabel();
        continent.setBounds(180, 145, 250, 20);
        continent.setVisible(false);

        timeZone = new JLabel();
        timeZone.setBounds(180, 160, 250, 20);
        timeZone.setVisible(false);

        longitude = new JLabel();
        longitude.setBounds(180, 175, 250, 20);
        longitude.setVisible(false);

        latitude = new JLabel();
        latitude.setBounds(180, 190, 250, 20);
        latitude.setVisible(false);

        accuracyRadius = new JLabel();
        accuracyRadius.setBounds(180, 205, 250, 20);
        accuracyRadius.setVisible(false);

        population = new JLabel();
        population.setBounds(180, 220, 250, 20);
        population.setVisible(false);

        income = new JLabel();
        income.setBounds(180, 235, 250, 20);
        income.setVisible(false);

        hashCode = new JLabel();
        hashCode.setBounds(180, 250, 250, 20);
        hashCode.setVisible(false);

        geoName = new JLabel();
        geoName.setBounds(180, 265, 250, 20);
        geoName.setVisible(false);

        ScanButton = new JButton();
        ScanButton.setText("Find Info");
        ScanButton.setBounds(50,150,95,30);
        ScanButton.addActionListener(urlActionListener);
        ScanButton.setVisible(false);


        ipInfo = new JButton();
        ipInfo.setText("Get IP Info");
        ipInfo.setBounds(50, 210, 95, 30);
        ipInfo.addActionListener(urlActionListener);
        ipInfo.setVisible(false);

        //url scan components

        frame.add(location);
        frame.add(city);
        frame.add(ScanButton);
        frame.add(ScanButtonBack);
        frame.add(textF);
        frame.add(labelPort);
        frame.add(ipInfo);
        frame.add(labelHost);
        frame.add(labelIp);
        frame.add(labelPort);

        frame.add(countryName);
        frame.add(cityName);
        frame.add(postal);
        frame.add(state);
        frame.add(continent);
        frame.add(timeZone);
        frame.add(longitude);
        frame.add(latitude);
        frame.add(accuracyRadius);
        frame.add(population);
        frame.add(income);
        frame.add(hashCode);
        frame.add(geoName);

        //discord invite scan components

        frame.add(nsfwLevel);
        frame.add(button);
        frame.add(buttonBack);
        frame.add(inviteText);
        frame.add(labelInviter);
        frame.add(labelInfo4);
        frame.add(labelInfo2);
        frame.add(labelInfo3);
        frame.add(labelInfo);
        frame.add(nsfwLevel);

        frame.add(panel);

        //adding main menu components
        panel.add(urlScanButton);
        panel.add(tokenScanButton);
        panel.add(discordInviteCheckButton);
        panel.add(virusScan);


    }


    public void hideMainMenuElements() {
        urlScanButton.setVisible(false);
        virusScan.setVisible(false);
        discordInviteCheckButton.setVisible(false);
        tokenScanButton.setVisible(false);
    }

    static void showMainMenuElements() {
        urlScanButton.setVisible(true);
        virusScan.setVisible(true);
        discordInviteCheckButton.setVisible(true);
        tokenScanButton.setVisible(true);
    }


    public void showDiscordInviteElements() {
        inviteText.setVisible(true);
        inviteText.setLayout(null);
        buttonBack.setVisible(true);
        buttonBack.setLayout(null);
        button.setVisible(true);
        button.setLayout(null);
        labelInviter.setVisible(true);
        labelInfo4.setVisible(true);
        labelInfo3.setVisible(true);
        labelInfo2.setVisible(true);
        labelInfo.setVisible(true);
    }

    static void hideDiscordElements() {
        inviteText.setVisible(false);
        buttonBack.setVisible(false);
        button.setVisible(false);
        labelInviter.setVisible(false);
        labelInfo4.setVisible(false);
        labelInfo3.setVisible(false);
        labelInfo2.setVisible(false);
        labelInfo.setVisible(false);
    }

    static void hideUrlScanElements() {
        frame.setSize(300,300);
        textF.setVisible(false);
        ScanButton.setVisible(false);
        ScanButtonBack.setVisible(false);
        labelHost.setVisible(false);
        labelPort.setVisible(false);
        labelIp.setVisible(false);
        city.setVisible(false);
        location.setVisible(false);
        ipInfo.setVisible(false);
        countryName.setVisible(false);
        cityName.setVisible(false);
        postal.setVisible(false);
        state.setVisible(false);
        continent.setVisible(false);
        timeZone.setVisible(false);
        longitude.setVisible(false);
        latitude.setVisible(false);
        accuracyRadius.setVisible(false);
        population.setVisible(false);
        income.setVisible(false);
        hashCode.setVisible(false);
        geoName.setVisible(false);
    }

    static void showUrlScanElements() {
        frame.setSize(370, 370);
        textF.setVisible(true);
        ScanButton.setVisible(true);
        ScanButtonBack.setVisible(true);
        labelHost.setVisible(true);
        labelPort.setVisible(true);
        labelIp.setVisible(true);
        city.setVisible(true);
        location.setVisible(true);
        countryName.setVisible(true);
        cityName.setVisible(true);
        postal.setVisible(true);
        state.setVisible(true);
        continent.setVisible(true);
        timeZone.setVisible(true);
        longitude.setVisible(true);
        latitude.setVisible(true);
        accuracyRadius.setVisible(true);
        population.setVisible(true);
        income.setVisible(true);
        hashCode.setVisible(true);
        geoName.setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()){

            case "URL Scan":
                System.out.println("URL SCAN BUTTON CLICKEd");
                panel.setVisible(false);
                showUrlScanElements();
                break;
            case "Token Scan":
                System.out.println("Clicked Token Scanner");
                break;
            case "Discord Invite Checker":
                System.out.println("Clicked invite checker");
                hideMainMenuElements();
                showDiscordInviteElements();
                break;
            case "IP Resolver":
                System.out.println("Clicked IP Resolver");
                break;
            case "Virus Scan":
                System.out.println("Clicked Virus Scan");
                break;
        }
    }
}
