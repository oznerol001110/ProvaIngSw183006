package it.ingsw.ProvaLab;
import static org.junit.Assert.*;
import org.joda.time.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

import it.ingsw.ProvaLab.MyListUtil;

public class MyListUtilTest {
	private static MyListUtil test;
	private static List<Integer> lista;
	private static List<Integer> listaOrdinataCres;
	private static List<Integer> listaOrdinataDecres;
	@BeforeClass
	public static void prepareAll() {
		test = new MyListUtil();
		lista = Arrays.asList(3,21,52,2);
		listaOrdinataCres = Arrays.asList(2,3,21,52);
		listaOrdinataDecres = Arrays.asList(52,21,3,2);
		DateTime t = new DateTime();
		String data = t.getDayOfMonth()+"/"+t.getMonthOfYear()+"/"+t.getYear();
		String ora = t.getHourOfDay()+":"+t.getMinuteOfDay()+":"+t.getSecondOfDay();
		System.out.println(data+" "+ora+" Inizio Test");
		
	}
	
	@AfterClass
	public static void closeAll() {
		DateTime t = new DateTime();
		String data = t.getDayOfMonth()+"/"+t.getMonthOfYear()+"/"+t.getYear();
		String ora = t.getHourOfDay()+":"+t.getMinuteOfDay()+":"+t.getSecondOfDay();
		System.out.println(data+" "+ora+" Test finiti");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Inizio test: ");
	}
	
	@After
	public void afterTest() {
		System.out.println("Fine del test: ");
	}
	
	@Test
	public void ordinaTest() {
		System.out.println("ordinaTest");
		assertEquals(listaOrdinataDecres, test.ordina(lista, false));
		assertEquals(listaOrdinataCres, test.ordina(lista, true));
	}
}
