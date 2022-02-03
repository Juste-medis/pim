public class tester {
	public static Boolean PimAPI(String phone, String country) {
		try {
			Long.parseLong(phone);
			COUNTRIES selected = null;
			for (COUNTRIES lang : COUNTRIES.values()) {
				if (lang.getName() == country) {
					selected = lang;
					break;
				}
			}
			if (selected == null) {
				// ("Pays introuvable pour le moment");
				return false;
			}
			if (phone.length() != selected.getNumlength()
					&& phone.length() != (selected.getCodelength() + selected.getNumlength())) {
				// ("Numero invalide, eurreur de longueur");
				return false;
			}
			if (phone.length() == (selected.getCodelength() + selected.getNumlength())) {
				String cocode = phone.substring(0, selected.getCodelength());
				if (!cocode.equals(String.valueOf(selected.getCode()))) {
					// ("Numero invalide, eurreur de code");
					return false;
				}
			}
			// ("ç'est un bon numero !!");
			return true;
		} catch (NumberFormatException exc) {
			// ("Numero invalide");
			return false;
		}
	}

	public static void main(String[] args) {
		Boolean[] tests = {
				PimAPI("22994632957", "Benin"),
				PimAPI("23494632957", "Nigeria"),
				PimAPI("22894632957", "Togo"),
				PimAPI("33994632957", "France")
		};
		for (int index = 0; index < tests.length; index++) {
			System.out.println(tests[index]);
		}
	}

}
