package com.company.bubbleSort;

public class IPAddress implements Comparable<IPAddress> {

    private long ipFrom;
    private long ipTo;
    private String countryCode;
    private String countryName;
    private String regionName;
    private String cityName;

    public IPAddress(long ipForm, long ipTo, String countryCode, String countryName, String regionName, String cityName) {
        this.ipFrom = ipForm;
        this.ipTo = ipTo;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.regionName = regionName;
        this.cityName = cityName;
    }


    public long getIpFrom() {
        return ipFrom;
    }

    public long getIpTo() {
        return ipTo;
    }

    @Override
    public String toString() {
        return "IPAddress{" +
                "ipFrom=" + ipFrom +
                ", ipTo=" + ipTo +
                ", countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", regionName='" + regionName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    @Override
    public int compareTo(IPAddress that) {
        if (this.ipFrom > that.ipFrom) {
            return 1;
        } else if (this.ipFrom < that.ipFrom) {
            return -1;
        } else {
            return 0;
        }
    }
}
