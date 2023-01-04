package array_examples;

public class BuilderBufferString {

	public static void main(String[] args) {
		char[] ch = {'p','r','o','x','y','m','o'};
		String s = new String(ch);
		System.out.println(ch);
		
		String name = "Pritam";
		String name1 = "Pritam"; //it doesnot create a new instance
		System.out.println(name==name1);
		String str = "Mondal";
		System.out.println(name==str);
		name = name.concat(str);	//joins the string
		System.out.println(name.length());
		
		String msg = "Good Morning Buddy";
		
		char c = msg.charAt(0);	//0--> index 
		System.out.println(c);
		
		String s1 = new String("Annie");
		String s2 = new String("Annie");
		String s3 = new String("Daksh");
		String s4 = new String("Pritam");
		String s5 = new String("Primo");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s4.compareTo(s3));
		System.out.println(s4.compareTo(s5));
		
		String a ="Hello Java";
		System.out.println(a.contains("Java"));
		System.out.println(a.endsWith("e"));
		
	/*
		Student stu1 = new Student(1,"Pritam","Mondal");	//roll;fname,lname
		Student stu2 = new Student(2,"Pritam","Sarkar");
	*/	
		//String Builder
		
		StringBuilder builder = new StringBuilder("Hello World");	//mutable
		builder.append(" i am learning Java.");
		System.out.println(builder);
		builder.insert(11, ",");
		System.out.println(builder);
		builder.replace(13, 17, "I Love");
		System.out.println(builder);
		builder.reverse();
		System.out.println(builder);
		StringBuilder hello = new StringBuilder("Hello");
		hello.delete(1, 3);
		System.out.println(hello);
		
		
		//String Buffer
		
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer.capacity());
		buffer.append(" Java i love programming");
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		buffer.insert(10, ",");
		System.out.println(buffer);
		System.out.println(buffer.indexOf("love"));
		
		//substring can be done in two ways
		System.out.println(buffer.substring(14));	//start index
		System.out.println(buffer.substring(6, 10));	//start end index
		buffer.delete(6, 10);
		System.out.println(buffer);
	}

}
