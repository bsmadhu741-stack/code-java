class YouTubeRunner
{
	public static void main(String [] youtube)
	{
		YouTube tube=new YouTube();
		boolean log=tube.login("Madhuhavana","Madhubhavana@19");
		System.out.println(log);
		String msg=tube.login("bsmadhu741@gmail.com","Madhubhavana@19","sin@19");
		System.out.println(msg);
		String msg1=tube.search("Ayya");
		System.out.println(msg1);
		String msg2=tube.search("Ayya","Challenging Star Darshan");
		System.out.println(msg2);
	}
}