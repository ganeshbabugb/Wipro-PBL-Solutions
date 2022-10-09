package program3;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;

public class FileWordCount {

	public static void main(String args[]) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file name");
		String inputFilename = sc.nextLine();
		System.out.println("Enter the output file name");
		String outputFilename = sc.nextLine();
	
		File filein = new File(inputFilename);
		File fileout = new File(outputFilename);
		
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
		
		Map<String, Integer> map = new TreeMap<>();
		
		String str;
		while ((str = br.readLine()) != null) {
			str = str.trim();
			String[] words = str.split(" ");
			
			for (String word : words) {
				if (!map.containsKey(word))
					map.put(word, 1);
				else
					map.put(word, map.get(word) + 1);
			}		
		};
		
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> me = it.next();
			
			bw.write(me.getKey() + " : " + me.getValue() + "\n");
		}
		System.out.println("Output has been created..");
		br.close();
		bw.close();
	}

}