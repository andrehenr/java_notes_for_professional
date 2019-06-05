package java_notes_for_professionals.chapter1;

public class Team {
	
	private Member member;
	
	public Team(Member member) {
		this.member = member;
	}
	
	public static void main(String[] args) {
		Member member = new Member("Andre", "light", 1, 1000);
		Team myTeam = new Team(member);
		System.out.println(myTeam.member.getName());
		System.out.println(myTeam.member.getType());
		System.out.println(myTeam.member.getLevel());
		System.out.println(myTeam.member.getRank());
	}

}
