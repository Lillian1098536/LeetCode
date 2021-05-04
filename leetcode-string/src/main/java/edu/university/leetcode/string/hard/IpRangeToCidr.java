package edu.university.leetcode.string.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * IP Range to CIDR (Classless Inter-Domain Routing)
 * a method for allocating IP addresses and for IP routing
 * https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing
 */
public class IpRangeToCidr {
    public List<String> ipRange2Cidr(String startIp, int range) {
        List<String> result = new ArrayList<>();
        return result;
    }
    private long ipToLong(String strIp) {

        return 0;
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
}
