package org.lyk.domain;

import java.sql.Date;

public class BoardVO {

   private int bno;
   private String writer,content,title;
   private int viewCount,commentCount;
   private Date regdate,modifydate;
   private String deleteState;
   
   public int getBno() {
      return bno;
   }
   public void setBno(int bno) {
      this.bno = bno;
   }
   public String getWriter() {
      return writer;
   }
   public void setWriter(String writer) {
      this.writer = writer;
   }
   public String getContent() {
      return content;
   }
   public void setContent(String content) {
      this.content = content;
   }
   public String getTitle() {
      return title;
   }
   public void setTitle(String title) {
      this.title = title;
   }
   public int getViewCount() {
      return viewCount;
   }
   public void setViewCount(int viewCount) {
      this.viewCount = viewCount;
   }
   public int getCommentCount() {
      return commentCount;
   }
   public void setCommentCount(int commentCount) {
      this.commentCount = commentCount;
   }
   public Date getRegdate() {
      return regdate;
   }
   public void setRegdate(Date regdate) {
      this.regdate = regdate;
   }
   public Date getModifydate() {
      return modifydate;
   }
   public void setModifydate(Date modifydate) {
      this.modifydate = modifydate;
   }
   public String getDeleteState() {
      return deleteState;
   }
   public void setDeleteState(String deleteState) {
      this.deleteState = deleteState;
   }
   @Override
   public String toString() {
      return "BoardVO [bno=" + bno + ", writer=" + writer + ", content=" + content + ", title=" + title
            + ", viewCount=" + viewCount + ", commentCount=" + commentCount + ", regdate=" + regdate
            + ", modifydate=" + modifydate + ", deleteState=" + deleteState + "]";
   }
   
   
}