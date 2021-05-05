package edu.university.leetcode.string.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * IP Range to CIDR (Classless Inter-Domain Routing)
 * a method for allocating IP addresses and for IP routing
 * https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing
 * Example 1: Input: 1.1.1.0 4 Output: 1.1.1.0/30
 * Example 2: Input: 1.1.1.1 4 Output: 1.1.1.1/32 1.1.1.2/31 1.1.1.4/32
 */
public class IpRangeToCidr {
    public List<String> ipRange2Cidr(String startIp, int range) {
        String tmp = "";
        long start = ipToLong(startIp), end = start + range - 1;
        List<String> result = new ArrayList<>();
        while (start <= end) {
            long locOfFirstOne = start & (-start);
            int curMask = 32 - (int)(Math.log(locOfFirstOne) / Math.log(2));
            double curRange = Math.log(end - start + 1) / Math.log(2);
            int curRangeMsk = 32 - (int)Math.floor(curRange);
            curMask = Math.max(curRangeMsk, curMask);
            String ip = longToIp(start);
            result.add(ip + "/" +curMask);
            start += Math.pow(2, (32- curMask));
        }
        return result;
    }
    private long ipToLong(String strIp) {
        long[] ip = new long[4];
        String[] ipSec = strIp.split("\\.");
        for (int i = 0; i < 4; i++) {
            ip[i] = Long.parseLong(ipSec[i]);
        }
        return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
    }
    private String longToIp(long longIp) {
        StringBuilder sb = new StringBuilder();
        sb.append(longIp >>> 24);
        sb.append(".");
        sb.append((longIp & 0x00FFFFFF) >>> 16);
        sb.append(".");
        sb.append((longIp & 0x0000FFFF) >>> 8);
        sb.append(".");
        sb.append(longIp & 0x000000FF);
        return sb.toString();
    }

    public static void main(String[] args) {
        IpRangeToCidr test = new IpRangeToCidr();
        System.out.println("input 1.1.1.0 4 " + test.ipRange2Cidr("1.1.1.0", 4));
        System.out.println("input 1.1.1.1 4 " + test.ipRange2Cidr("1.1.1.1", 4));
    }
}
