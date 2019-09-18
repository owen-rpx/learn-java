package dl.ald.day20190918;

import java.util.Arrays;

public class Navy extends Army {

	@Override
	public String toString() {
		return "Navy [id=" + id + ", attr=" + attr + ", power=" + power
				+ ", history=" + Arrays.toString(history) + "]";
	}

}
