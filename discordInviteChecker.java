package com.yellow.parser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class discordInviteChecker implements ActionListener {



    private void discord_invite() throws Exception {

        String url = "https://discord.com/api/v6/invite/" + mainHandler.inviteText.getText();
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");

        con.setRequestProperty("User-Agent", "Mozilla/5.0");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        String jsonObject = response.toString();

        System.out.println(jsonObject);

        String[] jsonObjArr = jsonObject.split(",", -2);

        int jsonObjLenght = jsonObjArr.length;

        String lastObject = jsonObjArr[jsonObjLenght - 1].replace("\"", "").replace("}}", "").replace(" bot: true", "yes");

        int usernameNum = 48;
        int idNum = 47;
        int tagNum = 50;
        int nsfwNum = 42;
        int nsfwLNum = 43;

        if (lastObject.equals("yes")) {
            idNum = jsonObjLenght - 6;
            usernameNum = jsonObjLenght - 5;
            tagNum = jsonObjLenght - 3;
            nsfwNum = jsonObjLenght - 11;
            nsfwLNum = jsonObjLenght - 10;
            System.out.println("worked");
            mainHandler.nsfwLevel.setText("Bot: true");
        }



        String getInviterUsername = jsonObjArr[usernameNum].replace("\"", "").replace("username: ", "");

        String getInviterID = jsonObjArr[idNum].replace("\"", "").replace(" inviter: {id: ", "");

        String getInviterTag = jsonObjArr[tagNum].replace("\"", "").replace(" discriminator: ", "");

        String getGuildName = jsonObjArr[4].replace("\"", "").replace(" name: ", "");

        String getGuildDescription = jsonObjArr[7].replace("\"", "").replace(" description: ", "");

        String getGuildNsfw = jsonObjArr[nsfwNum].replace("\"","").replace(" nsfw:", "");

        String nsfwLevell = jsonObjArr[nsfwLNum].replace("\"", "").replace(" nsfw_level:", "");


        if (getGuildNsfw.equals("true")) {
            mainHandler.nsfwLevel.setText("Nsfw Level: " + nsfwLevell);
        }

        mainHandler.labelInviter.setText("Inviter:" + getInviterUsername + "#" + getInviterTag + " (" + getInviterID + ")");
        mainHandler.labelInfo.setText("Guild Info:");
        mainHandler.labelInfo2.setText("Guild name: " + getGuildName);
        mainHandler.labelInfo3.setText("Guild Description: " + getGuildDescription.replace("null", "None"));
        mainHandler.labelInfo4.setText("Nsfw: " + getGuildNsfw);


        for (String a : jsonObjArr)
            System.out.println(a);

    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Find Info":
                try {
                    String code = mainHandler.inviteText.getText();
                    discord_invite();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(mainHandler.frame,ex,"Alert",JOptionPane.WARNING_MESSAGE);
                }
                break;
            case "Back":
                System.out.println("ok: " + mainHandler.inviteText.getText());
                mainHandler.hideDiscordElements();
                mainHandler.showMainMenuElements();
                break;
        }
    }

    public static void main(String[] args) {
        new discordInviteChecker();

    }
}
