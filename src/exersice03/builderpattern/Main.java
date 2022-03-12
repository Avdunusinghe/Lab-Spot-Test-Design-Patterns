package exersice03.builderpattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Query query1 = new QueryBuilder().select("name").from("student").build();
		System.out.println(query1.toString());
		
		Query query2 = new QueryBuilder().select("name").from("student").where("name = 'Name1'").build();
		System.out.println(query2.toString());
		
		Query query3 = new QueryBuilder().select("name").where("name = 'Name1'").build();
		System.out.println(query3.toString());
		
	}

}
