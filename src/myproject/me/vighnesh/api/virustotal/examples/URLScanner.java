/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject.me.vighnesh.api.virustotal.examples;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import myproject.me.vighnesh.api.virustotal.VirusTotalAPI;
import myproject.me.vighnesh.api.virustotal.dao.URLScan;
import myproject.me.vighnesh.api.virustotal.dao.URLScanMetaData;
import myproject.me.vighnesh.api.virustotal.dao.URLScanReport;

/**
 *
 * @author BVR vigneshb1210@gmail.com
 */
public class URLScanner {

    public static void main(String[] args) throws IOException {
        String url = "http://www.cacms.in";
        VirusTotalAPI virusTotal = VirusTotalAPI.configure("d0a843dcf7cac059f19e94c6fa5bad627e031a08df959e3f406d5682a8b63d6a");
        URLScanMetaData scanURL = virusTotal.scanURL(new URL(url));
        System.out.println("---SCAN META DATA---");
        System.out.println("");
        System.out.println("URL : " + scanURL.getUrl());
        System.out.println("Resource : " + scanURL.getResource());
        System.out.println("Scan Date : " + scanURL.getScanDate());
        System.out.println("Scan Id : " + scanURL.getScanId());
        System.out.println("Response Code : " + scanURL.getResponseCode());
        System.out.println("Permalink : " + scanURL.getPermalink());
        System.out.println("VerboseMessage : " + scanURL.getVerboseMsg());
        URLScanReport urlReport = virusTotal.getURLReport(url);
        System.out.println("---SCAN META DATA---");
        System.out.println("");
        System.out.println("Response Code : " + urlReport.getResponseCode());
        System.out.println("Resource : " + urlReport.getResource());
        System.out.println("Scan ID : " + urlReport.getScanId());
        System.out.println("Permalink : " + urlReport.getPermalink());
        System.out.println("Scan Date : " + urlReport.getScanDate());
        System.out.println("Positives : " + urlReport.getPositives());
        System.out.println("Total : " + urlReport.getTotal());
        System.out.println("File Scan Id : " + urlReport.getFilescanId());

        Map<String, URLScan> scans = urlReport.getScans();
        System.out.println("---URL REPORT---");
        System.out.println("");
        scans.keySet().stream().forEach((String scan) -> {
            URLScan report = scans.get(scan);
            System.out.println(scan + "\t:" + report.getReport());
        });
    }
}
