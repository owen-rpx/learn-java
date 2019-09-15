package dl.ald.day20190914;
import java.time.LocalDate;

public class InitMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] acts = {"»Æ²³","¸ßË¬"};
		Movie movie = new Movie("É¨¶¾","¾¯·Ë",acts,120.5f,LocalDate.of(2018, 3, 21) );
		movie.doShow("´óÁ¬", 350);
	}

}
