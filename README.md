# articleWeb

![image](https://github.com/RandomErwin/articleWeb/blob/main/後端工程.png)

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
```
## Service
``` java
public interface ArticleService(){

       Article saveArticle(Article article);   ＃新增
       Article updateArticle(Article article); ＃更新
       Article findArticle(Long id); ＃查詢
       void deleteArticle(Long id);  ＃刪除

} 
```
## ServiceImpl
``` java
＃使用 implements 繼承 interface ArticleService
public class ArticleServiceImpl implements ArticleService{

       @Autowired  ＃讓 Spring 從容器取得 Repository 介面，引入操作功能
       private ArticleRepository articleRepositry;

       @Override  ＃覆寫父類別方法
       public Article saveArticle(Article article){

              return articleRepository.save(article);
       }  

       @Override
       public Aritcle updateArticle(Article article){

              return articleRepository.update(article);
       }
       
       ＃findById、deleteById
}
```
## Unit Test
``` java
@SpringBootTest
public class ArticleTest{

       @Autowired
       private ArticleService articleService;

       @Test
       public void saveArticle(Article article){
              Article article = new Article();              article.setTitle(“國家為什麼會失敗”）;
              article.setContent(“闡述廣納型與搾取型制度導致的經濟結果”);
              articleService.saveArticle(article);
       }
       ＃updateArticle、findArticle、deleteArticle
}
```
![image](https://github.com/RandomErwin/articleWeb/blob/main/實體關係圖.png)
