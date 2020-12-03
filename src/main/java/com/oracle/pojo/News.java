package com.oracle.pojo;
public class News {
    private Integer id;
    private String title;
    private String content;
    private java.util.Date createdate;
    private java.util.Date modifydate;
    public News() {
        super();
    }
    public News(Integer id,String title,String content,java.util.Date createdate,java.util.Date modifydate) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdate = createdate;
        this.modifydate = modifydate;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public java.util.Date getCreatedate() {
        return this.createdate;
    }

    public void setCreatedate(java.util.Date createdate) {
        this.createdate = createdate;
    }

    public java.util.Date getModifydate() {
        return this.modifydate;
    }

    public void setModifydate(java.util.Date modifydate) {
        this.modifydate = modifydate;
    }

}
