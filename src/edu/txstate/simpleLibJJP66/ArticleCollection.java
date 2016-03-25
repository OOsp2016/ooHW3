package edu.txstate.simpleLibJJP66;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArticleCollection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7565528179984240662L;
	//Creation of new list of articles
	private List<Article> ListOfArticles;
	
	//Constructor of list of articles
	public ArticleCollection(){
		ListOfArticles = new ArrayList<Article>();
	}
	
	//adds a new article
	public void addArticle(Article newArticle){
		ListOfArticles.add(newArticle);
	}
	
	//removes an article
	public void removeArticle(Article removeArticle){
		ListOfArticles.remove(removeArticle);
	}
	
	//displays list of authors
	public String displayArticles(){
		//String to contain list of articles
		String Articles = "";
		
		//for loop to navigate the list of articles
		for(int i = 0; i < ListOfArticles.size(); i++){
			//temporary article object to get article
			Article TempArticle = ListOfArticles.get(i);
			// adds Article list to string
			Articles = Articles + TempArticle.getArticleName() + "\n";
		}
		
		return Articles;
	}
	
	//searches through list of articles and returns boolean
	public Boolean searchArticles(String input){
		//Article string
		String article = "";
		for (int i = 0; i < ListOfArticles.size(); i++){
			Article TempArticle = ListOfArticles.get(i);
			article = TempArticle.getArticleName();
			if (article.equals(input)) {
				return true;
			}
		}
		return false;
	}
	//end class
}
