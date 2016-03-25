package edu.txstate.simpleLibJJP66;

public class TestJournals {
	static JournalCollection ListOfJournals = new JournalCollection();
	
	public static void StartTests(){
		//TestJournalOne
				Journal TestJournalOne = new Journal();
				//Test to add books to a list. 
				ListOfJournals.addJournal(TestJournalOne);
				
				//Test Display of TestJournalOne
				System.out.println("***Test Display TestJournalOne***");
				System.out.println(TestJournalOne.getTitle());
				System.out.println(TestJournalOne.getDate());
				System.out.println(TestJournalOne.getVolume());
				System.out.println(TestJournalOne.getIssue());
				System.out.println(TestJournalOne.getPublisher());
				System.out.println(TestJournalOne.getCopies());
				System.out.println(TestJournalOne.getArticles());
				
				//Test to add another Article to TestJournalOne
				System.out.println("***Test adding an Article***");
				System.out.println(TestJournalOne.getTitle());
				System.out.println(TestJournalOne.getDate());
				System.out.println(TestJournalOne.getVolume());
				System.out.println(TestJournalOne.getIssue());
				System.out.println(TestJournalOne.getPublisher());
				System.out.println(TestJournalOne.getCopies());
				TestJournalOne.addAnArticle("B1");

				System.out.println(TestJournalOne.getArticles());

				
				//Test to remove Article from TestJournalOne
				System.out.println("***Test for removing an Article***");
				System.out.println(TestJournalOne.getTitle());
				System.out.println(TestJournalOne.getDate());
				System.out.println(TestJournalOne.getVolume());
				System.out.println(TestJournalOne.getIssue());
				System.out.println(TestJournalOne.getPublisher());
				System.out.println(TestJournalOne.getCopies());
				TestJournalOne.removeAnArticle("B1");
				System.out.println(TestJournalOne.getArticles());	
				
				//Test to add second Journal with specific parameters
				Journal TestJournalTwo = new Journal("Common Framework", "08-19-2014", 10, 11, "Elsevier", 3, "a3");
				
				ListOfJournals.addJournal(TestJournalTwo);
				
				System.out.println("***Test Display TestJournalTwo***");
				System.out.println(TestJournalTwo.getTitle());
				System.out.println(TestJournalTwo.getDate());
				System.out.println(TestJournalTwo.getVolume());
				System.out.println(TestJournalTwo.getIssue());
				System.out.println(TestJournalTwo.getPublisher());
				System.out.println(TestJournalTwo.getCopies());
				System.out.println(TestJournalTwo.getArticles());

				//Test to display multiple journals from the ListOfJournals
				System.out.println("***Test Display ListOfJournals***");
				System.out.println(ListOfJournals.listJournalCollection());
				
				//Test to add articles to Journal one and two and see if they display correctly
				System.out.println("***Test Display ListOfJournals with multiple Articles***");
				TestJournalOne.addAnArticle("B2");
				TestJournalTwo.addAnArticle("A2");
				System.out.println(ListOfJournals.listJournalCollection());
				
				//Test to search ListOfJournals and display specified Journal
				System.out.println("***Test search for Journal***");
				ListOfJournals.searchJournals("Common Framework");
				ListOfJournals.searchJournals("Default Publisher");

	}
	//end class
}
