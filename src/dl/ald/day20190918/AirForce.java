package dl.ald.day20190918;

import java.util.Arrays;

public class AirForce extends Army {

	@Override
	public String toString() {
		return "AirForce [id=" + id + ", attr=" + attr + ", power=" + power
				+ ", history=" + Arrays.toString(history) + "]";
	}

}
