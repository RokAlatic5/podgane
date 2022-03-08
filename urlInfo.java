package com.yellow.parser;
import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.Country;
import com.maxmind.geoip2.record.Location;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;

public class urlInfo implements ActionListener {

        static void geoLocateIp() {
            try {
                String ip = mainHandler.labelIp.getText().replace("IP: ", "");
                String dbLocation = "src/main/java/com/yellow/parser/database/GeoLite2-City.mmdb";

                File database = new File(dbLocation);
                DatabaseReader dbReader = new DatabaseReader.Builder(database)
                        .build();

                InetAddress ipAddress = InetAddress.getByName(ip);
                CityResponse response = dbReader.city(ipAddress);

                String countryName = response.getCountry().getName();
                String cityName = response.getCity().getName();
                String postal = response.getPostal().getCode();
                String state = response.getLeastSpecificSubdivision().getName();
                String continent = response.getContinent().getCode();
                String timeZone = response.getLocation().getTimeZone();


                double longitude = response.getLocation().getLongitude();
                double latitude = response.getLocation().getLatitude();

                int accuracyRadius = response.getLocation().getAccuracyRadius();

                Integer population = response.getLocation().getPopulationDensity();
                Integer income = response.getLocation().getAverageIncome();

                Integer hashCode = response.hashCode();
                Integer geoName = response.getCity().getGeoNameId();


                mainHandler.countryName.setText("Country: " + countryName + " ("+continent+")");
                mainHandler.cityName.setText("City Name: " + cityName);
                mainHandler.postal.setText("Postal Code: " + postal);
                mainHandler.state.setText("State: " + state);
                mainHandler.timeZone.setText("Timezone: " + timeZone);
                mainHandler.longitude.setText("Longitude: " + longitude);
                mainHandler.latitude.setText("Latitude: " + latitude);
                mainHandler.accuracyRadius.setText("Accuracy Radius: " + accuracyRadius);
                mainHandler.population.setText("Population: " + population);
                mainHandler.income.setText("Income: " + income);
                mainHandler.hashCode.setText("Hash Code: " + hashCode);
                mainHandler.geoName.setText("Geo name id: " + geoName);

                mainHandler.countryName.setVisible(true);
                mainHandler.cityName.setVisible(true);
                mainHandler.postal.setVisible(true);
                mainHandler.state.setVisible(true);
                mainHandler.continent.setVisible(true);
                mainHandler.timeZone.setVisible(true);
                mainHandler.longitude.setVisible(true);
                mainHandler.latitude.setVisible(true);
                mainHandler.accuracyRadius.setVisible(true);
                mainHandler.population.setVisible(true);
                mainHandler.income.setVisible(true);
                mainHandler.hashCode.setVisible(true);
                mainHandler.geoName.setVisible(true);

            } catch (Exception ex) {
                System.out.println(ex);
            }
    }


    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Find Info":
                try {
                    String city;
                    String location;
                    String[] schemes = {"http", "https"};
                    String hostname = mainHandler.textF.getText();
                    URL host = new URL(hostname);
                    String new_hostname = hostname.replace("https://", "");
                    int port = host.getPort();
                    String protocol = host.getProtocol();
                    String ip = java.net.InetAddress.getByName(new_hostname).getHostAddress();
                    mainHandler.labelHost.setText("Host: " + hostname);
                    mainHandler.labelPort.setText("Port: " + port);
                    mainHandler.labelIp.setText("IP: " + ip);
                    mainHandler.labelProt.setText("Protocol: " + protocol);
                    mainHandler.ipInfo.setVisible(true);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                break;
            case "Back":
                mainHandler.hideUrlScanElements();
                mainHandler.panel.setVisible(true);
                break;
            case "Get IP Info":
                geoLocateIp();
                break;
        }
    }


    public static void main(String args[]) {
        new urlInfo();
    }
}
