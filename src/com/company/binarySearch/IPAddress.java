package com.company.binarySearch;

public class IPAddress implements Comparable<Long> {

    private long ipFrom;
    private long ipTo;
    public String countryCode;
    public String countryName;
    public String regionName;
    public String cityName;

    public IPAddress(long ipForm, long ipTo, String countryCode, String countryName, String regionName, String cityName) {
        this.ipFrom = ipForm;
        this.ipTo = ipTo;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.regionName = regionName;
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "\"" + ipFrom
                + "\"" + "," + "\"" + ipTo + "\"" + "," + "\"" + countryCode + "\"" + "," + "\"" + countryName + "\"" + "," + "\"" + regionName + "\"" + "," + "\"" + cityName + "\"" ;

    }

    @Override
    public int compareTo(Long number) {
        if (this.ipFrom <= number && number <= this.ipTo) {
            return 0;
        }
        else if (this.ipFrom > number) {
            return -1;
        }
        else {
            return 1;
        }
    }

}
