package Udemy1.Udemy1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;

public class Javastream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Anushaa");
		name.add("Aikya");
		name.add("johnnn");
		name.add("Abijna");
		

		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("rishi");
		name1.add("kavya");
	
		/*	int count =0;
		for(int i=0; i<name.size(); i++)
		{
			if(name.get(i).startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);*/
		//Lamda expression with java stream
	   Long c=	name.stream().filter(i->i.startsWith("A")).count();
	   System.out.println(c);
	   Long d= Stream.of("nish", "acharya").filter(i->i.startsWith("n")).count();
	   System.out.println(d);
	//   name.stream().filter(i->i.length()>4).forEach(i->System.out.println(i));
	//   name.stream().filter(i->i.length()>4).limit(1).forEach(i->System.out.println(i));
	//   name.stream().filter(i->i.startsWith("j")).map(i->i.toUpperCase()).forEach(i->System.out.println(i));
	//   name.stream().map(i->i.toUpperCase()).sorted().forEach(i->System.out.println(i));
       Stream<String> newName = Stream.concat(name.stream(), name1.stream());
      // newName.sorted().forEach(i->System.out.print(i+"\n"));
      List<String>ls = newName.collect(Collectors.toList());
      ls.get(1);
     // boolean flg= newName.anyMatch(s->s.equalsIgnoreCase("kavya"));
      
    //  Assert.assertTrue(flg);
   
	
	}

}
