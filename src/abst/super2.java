package abst;

public class super2 extends Food{

	@Override
	public void kimch() {
		System.out.println("±èÄ¡Âî°³ : 4500¿ø");
	}

	@Override
	public void budae() {
		System.out.println("ºÎ´ëÂî°³ : 5000¿ø");
	}

	@Override
	public void bibim() {
		System.out.println("ºñºö¹ä : 6000¿ø");
	}

	@Override
	public void sundae() {
		System.out.println("¼ø´ë±¹ : 4000¿ø");
	}

	@Override
	public void gonggi() {
		System.out.println("°ø±ê¹ä : free");
	}

}
