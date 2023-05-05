# articleWeb
author has many article and comment form others

![image](https://github.com/RandomErwin/articleWeb/blob/main/後端工程.png)
![image](https://github.com/RandomErwin/articleWeb/blob/main/實體關係圖.png)

## Entity
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
## Repository(DAO)
``` java
＃ArticleRepository Interface 接口繼承 JpaRepository
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{
       
       Article findArticleById(Long id);
       void deleteArticleById(Long id);

}

＃KeywordSample                 SQL
  And  findByNameAndCountry    ...WHERE name=?1 AND country=?2
  
＃ORM(Object-Relational Mapping)框架
1.物件關聯對應『Model資料容器』 與『資料庫』
2.幫助使用者更簡便與安全地讀取資料庫資料，透過程式語言(Java)操作資料庫語言(SQL)

＃JPA(Java Persistence API)規範
1.SUN 針對 ORM 技術提出的規範，為簡化持久化的開發及整合各家 ORM 技術(Hibernate,…
  註：持久化，將數據保存在資料庫

＃Spring Data JPA 根據ORM框架與JPA規範的應用，降低存取資料的工作量
<img width="888" alt="image" src="https://user-images.githubusercontent.com/126307179/236442329-0aac66a6-6098-435d-9230-86968b812d9e.png">

```

