public class tester {
	public static void main(String[] args) {
		System.out.println(PimAPI("22994632vtg957", "Benikn"));
	}

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
				System.out.println("Pays introuvable por le moment");
				return false;
			}
			if (phone.length() != selected.getNumlength()
					&& phone.length() != (selected.getCodelength() + selected.getNumlength())) {
				System.out.println("Numero invalide, eurreur de longueur");
				return false;
			}

			if (phone.length() == (selected.getCodelength() + selected.getNumlength())) {
				String cocode = phone.substring(0, selected.getCodelength());
				if (!cocode.equals(String.valueOf(selected.getCode()))) {
					System.out.println("Numero invalide, eurreur de code");
					return false;
				}
			}
			System.out.println("ç'est un bon numero !!");
			return true;

		} catch (NumberFormatException exc) {
			System.out.println("Numero invalide");
			return false;

		}

	}

}
