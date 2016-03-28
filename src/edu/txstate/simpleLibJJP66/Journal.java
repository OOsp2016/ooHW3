package edu.txstate.simpleLibJJP66;

public class Journal extends Document{

	/**
	 * 
	 */
	private static final long serialVersionUID = -249610661948403768L;

	// Journal variables
	private int Volume;

	private int Issue;

	// Array list of articles for object Journal
	private ArticleCollection ArticleListForJournal = null;

	// Default constructor
	public Journal() {

		ArticleListForJournal = new ArticleCollection();

		setTitle("Default Title");
		setDate("Default Date");
		setVolume(1);
		setIssue(1);
		setPublisher("Default Publisher");
		setCopies(1);

		// create article object
		Article DefaultArticle = new Article();
		ArticleListForJournal.addArticle(DefaultArticle);

	}

	// Parameter constructor
	public Journal(String ConstructTitle, String ConstructDate, int ConstructVolume, int ConstructIssue,
			String ConstructPublisher, int ConstructCopies, String ConstructArticle) {

		ArticleListForJournal = new ArticleCollection();

		setTitle(ConstructTitle);
		setDate(ConstructDate);
		setVolume(ConstructVolume);
		setIssue(ConstructIssue);
		setPublisher(ConstructPublisher);
		setCopies(ConstructCopies);

		// creates article object, and assigns it via parameters
		Article SpecifiedArticle = new Article(ConstructArticle);
		ArticleListForJournal.addArticle(SpecifiedArticle);
	}

	// Getters and Setters for the variables
	public int getVolume(){
		return Volume;
	}
	
	public void setVolume(int volume){
		this.Volume = volume;
	}
	
	public int getIssue(){
		return Issue;
	}
	
	public void setIssue(int issue){
		this.Issue = issue;
	}

	// End getters and setters for variables

	// displays journal
	public String displayJournal() {
		return "Title: " + title + "\nPublisherDate: " + date + "\nVolume: " + Volume + "\nIssue: " + Issue + "\nPublisher: "
				+ publisher + "Copies: " + copies + "\nArticle(s): " + getArticles();
	}

	// Gets list of articles
	public String getArticles() {
		return ArticleListForJournal.displayArticles();
	}

	// adds an article
	public void addAnArticle(String NewArticle) {
		Article newArticle = new Article();
		newArticle.setArticleName(NewArticle);
		ArticleListForJournal.addArticle(newArticle);
	}

	// removes an article
	public void removeAnArticle(String ArticleToRemove) {
		Article removeArticle = new Article();
		removeArticle.setArticleName(ArticleToRemove);
		ArticleListForJournal.removeArticle(removeArticle);
	}

	// find an article
	public Boolean findArticle(String input) {
		return ArticleListForJournal.searchArticles(input);
	}

	// end class
}
