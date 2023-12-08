package publpack;

import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.TreeSet;
public class Demo{
				
				public static void main(String[] args) {
								
								String [] planets = new String[] {"mercury","venus","earth","mars","jupiter"};
								
								System.out.println(planets.length);
								Arrays.sort(planets);
					System.out.println(Arrays.toString(planets));
								TreeSet gh = new TreeSet();
								gh.add(45);
								gh.add(27);
								gh.add(100);
								gh.add(37);
							System.out.println(gh.add(45));
								System.out.println(gh.add(10));
								
								
								
				}
				
}