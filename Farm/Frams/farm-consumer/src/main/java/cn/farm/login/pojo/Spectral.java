package cn.farm.login.pojo;

import java.util.Date;

public class Spectral {
    private Integer spectralid;

    private String name;

    private String format;

    private String description;

    private String author;

    private Date time;

    private String location;

    private String device;

    private String spectralfile;

    public Integer getSpectralid() {
        return spectralid;
    }

    public void setSpectralid(Integer spectralid) {
        this.spectralid = spectralid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public String getSpectralfile() {
        return spectralfile;
    }

    public void setSpectralfile(String spectralfile) {
        this.spectralfile = spectralfile == null ? null : spectralfile.trim();
    }
}