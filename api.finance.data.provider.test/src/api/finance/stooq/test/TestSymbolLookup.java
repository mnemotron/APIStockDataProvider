package api.finance.stooq.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSymbolLookup
{

	public static void main(String[] args)
	{
	String input = "<b>G</b>BPPLN~British Pounds / Polish Zloty 1:1~Currency~4.72471~-0.28%~5|<b>G</b>C.F~<b>G</b>old - COMEX~Commodities Futures~1337.30~-1.08%~2|<b>G</b>NB~<b>G</b>etin Noble Bank SA~Warsaw SE~1.75~-1.69%~2|<b>G</b>BK~<b>G</b>etBack SA~Warsaw SE~18.10~0.11%~2|<b>G</b>BPUSD~British Pounds / U.S. Dollar 1:1~Currency~1.41212~-1.00%~5|<b>G</b>RI~<b>G</b>ino Rossi SA~Warsaw SE~1.21~-0.82%~2|<b>G</b>TN~<b>G</b>etin Holdin<b>g</b> SA~Warsaw SE~1.46~-2.67%~2|<b>G</b>CN~<b>G</b>roclin SA~Warsaw SE~5.83~0.52%~2|<b>G</b>BPJPY~British Pounds / Japanese Yen 1:1~Currency~155.481~-0.43%~3|<b>G</b>PW~<b>G</b>iełda Papierów Wartościowych w Warszawie SA~Warsaw SE~46.30~-2.73%~2";
		
	Pattern p = Pattern.compile("^(.*)\\|\\?");
//		 Matcher m = p.matcher("window.cmp_r('<b>G</b>BPPLN~British Pounds / Polish Zloty 1:1~Currency~4.72471~-0.28%~5|<b>G</b>C.F~<b>G</b>old - COMEX~Commodities Futures~1337.30~-1.08%~2|<b>G</b>NB~<b>G</b>etin Noble Bank SA~Warsaw SE~1.75~-1.69%~2|<b>G</b>BK~<b>G</b>etBack SA~Warsaw SE~18.10~0.11%~2|<b>G</b>BPUSD~British Pounds / U.S. Dollar 1:1~Currency~1.41212~-1.00%~5|<b>G</b>RI~<b>G</b>ino Rossi SA~Warsaw SE~1.21~-0.82%~2|<b>G</b>TN~<b>G</b>etin Holdin<b>g</b> SA~Warsaw SE~1.46~-2.67%~2|<b>G</b>CN~<b>G</b>roclin SA~Warsaw SE~5.83~0.52%~2|<b>G</b>BPJPY~British Pounds / Japanese Yen 1:1~Currency~155.481~-0.43%~3|<b>G</b>PW~<b>G</b>iełda Papierów Wartościowych w Warszawie SA~Warsaw SE~46.30~-2.73%~2');");
//		 Matcher m = p.matcher("p.split(input)
	
	String[] split = p.split(input);
	
	for (String string : split)
	{
//		String locSplit = new String();
//		locSplit.split("~");
		System.out.println(string);
	}
	}

}
