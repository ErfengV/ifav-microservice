package com.yc.ifav.domain;


import java.io.Serializable;

public class FavDomain implements Serializable {
    private static final long serialVersionUID = 5168141800845369640L;

    private String fname;
    private String furl;
    private String fdesc;
    private String fdate;
    private String favator;

    private String []ftag;//界面录入标签     "体育,娱乐"
    private String tname;   // 根据 tname来查询 favorite


    public FavDomain(String fname, String furl, String fdesc, String fdate, String favator,String ftags) {
        this.fname = fname;
        this.furl = furl;
        this.fdesc = fdesc;
        this.fdate = fdate;
        this.favator = favator;
        this.ftag = ftags.split(",");
        this.tname = tname;
        this.type = type;
    }

    public String getFavator() {
        return favator;
    }

    public void setFavator(String favator) {
        this.favator = favator;
    }

    public String getFdate() {
        return fdate;
    }

    public void setFdate(String fdate) {
        this.fdate = fdate;
    }

    public String[] getFtag() {
        return ftag;
    }


    public void setFtag(String[] ftag) {
        this.ftag = ftag;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fdesc == null) ? 0 : fdesc.hashCode());
        result = prime * result + ((fname == null) ? 0 : fname.hashCode());
        result = prime * result + ((ftag == null) ? 0 : ftag.hashCode());
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
        FavDomain other = (FavDomain) obj;
        if (fdesc == null) {
            if (other.fdesc != null)
                return false;
        } else if (!fdesc.equals(other.fdesc))
            return false;
        if (fname == null) {
            if (other.fname != null)
                return false;
        } else if (!fname.equals(other.fname))
            return false;
        if (ftag == null) {
            if (other.ftag != null)
                return false;
        } else if (!ftag.equals(other.ftag))
            return false;
        if (furl == null) {
            if (other.furl != null)
                return false;
        } else if (!furl.equals(other.furl))
            return false;
        return true;
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



    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc;
    }

}
