package com.yc.ifav.entity;

import java.io.Serializable;

public class Favs implements Serializable {

    private static final long serialVersionUID = 5168141800845369640L;

    private Integer fid;
    private String fname;
    private String furl;
    private String fdesc;
    private String fdate;



    private String ftags="";  //界面录入标签     "体育,娱乐"
    private String tname;   // 根据 tname来查询 favorite

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getFdate() {
        return fdate;
    }

    public void setFdate(String fdate) {
        this.fdate = fdate;
    }

    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Favs{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", furl='" + furl + '\'' +
                ", fdesc='" + fdesc + '\'' +
                ", fdate='" + fdate + '\'' +
                ", ftags='" + ftags + '\'' +
                ", tname='" + tname + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fdesc == null) ? 0 : fdesc.hashCode());
        result = prime * result + ((fid == null) ? 0 : fid.hashCode());
        result = prime * result + ((fname == null) ? 0 : fname.hashCode());
        result = prime * result + ((ftags == null) ? 0 : ftags.hashCode());
        result = prime * result + ((furl == null) ? 0 : furl.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Favs other = (Favs) obj;
        if (fdesc == null) {
            if (other.fdesc != null)
                return false;
        } else if (!fdesc.equals(other.fdesc))
            return false;
        if (fid == null) {
            if (other.fid != null)
                return false;
        } else if (!fid.equals(other.fid))
            return false;
        if (fname == null) {
            if (other.fname != null)
                return false;
        } else if (!fname.equals(other.fname))
            return false;
        if (ftags == null) {
            if (other.ftags != null)
                return false;
        } else if (!ftags.equals(other.ftags))
            return false;
        if (furl == null) {
            if (other.furl != null)
                return false;
        } else if (!furl.equals(other.furl))
            return false;
        return true;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFurl() {
        return furl;
    }

    public void setFurl(String furl) {
        this.furl = furl;
    }

    public String getFtags() {
        return ftags;
    }

    public void setFtags(String ftags) {
        this.ftags = ftags;
    }

    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc;
    }
}
