# articleWeb
author has many article and comment form others

＃＃Entity
``` java
@Entity ＃建立實體物件：數據模型層宣告
public class Article{

       @Id ＃資料表的 Primary Key
       @GeneratedValue ＃對應到欄位的名稱： Generation.AUTO 容器自動生成
       private Long id;
       private String title;
       private String content;

       @OneToMany(mappedBy = ’article’) ＃一對多關聯建立; CascadeType.PERSIST
       private List<Comment> comments = new ArrayList<>();

       public void addComment(Comment comment){
              comment.setArticle(this);
              comments.add(comment)
       }
       ＃ 建構子：作為類別物件初始化; new Article();無傳回值
       public Article(){
       }
       public Long getId(){return id;}
       public void setId(){this.id = id;}

       略～
```
![image](https://github.com/RandomErwin/articleWeb/blob/main/後端工程.png)
![image](https://github.com/RandomErwin/articleWeb/blob/main/實體關係圖.png)
