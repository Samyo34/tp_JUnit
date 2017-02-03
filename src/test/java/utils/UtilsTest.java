package utils;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.hamcrest.core.Is;
import org.junit.Assert;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

public class UtilsTest {
	
	@Test
	public void testSumOk()
	{
		List<Integer> list = Arrays.asList(1,3,8,46,16,24);
		Utils u = new Utils();
		int sum = u.sum(list);
//		Assert.assertEquals(98, sum);
		Assert.assertThat(sum, Is.is(98));
	}
	
	@Test
	public void testSumWithNull()
	{
		List<Integer> list = Arrays.asList(1,3,8,46,16,24,null);
		Utils u = new Utils();
		int sum = u.sum(list);
		Assert.assertEquals(98, sum);
	}
	
	@Test
	public void testSumEmpty()
	{
		List<Integer> list = Arrays.asList();
		Utils u = new Utils();
		int sum = u.sum(list);
		Assert.assertEquals(0, sum);
	}
	
	@Test
	public void testSumNull()
	{
		Utils u = new Utils();
		int sum = u.sum(null);
		Assert.assertEquals(0, sum);
	}
	
	@Test
	public void testEmptyString()
	{
		String sEmpty = "";
		Utils u = new Utils();
		Assert.assertEquals(null,u.emptyString(sEmpty));
	}
	
	@Test
	public void testNullString()
	{
		String sEmpty = null;
		Utils u = new Utils();
		Assert.assertEquals(null,u.emptyString(sEmpty));
	}
	
	@Test
	public void testNonEmptyString()
	{
		String sNonEmpty = "String non vide";
		Utils u = new Utils();
		Assert.assertEquals(sNonEmpty,u.emptyString(sNonEmpty));
	}
	
	@Test
	public void testFilterEvenNumber()
	{
		List<Integer> list = Arrays.asList(1,3,8,46,16,24);
		List<Integer> res = Arrays.asList(8,46,16,24);
		Utils u = new Utils();
		//Assert.assertArrayEquals(res.toArray(), u.filterEvenNumbers(list).toArray());
		Assert.assertThat(u.filterEvenNumbers(list),containsInAnyOrder(res.toArray()));
	}
	
	@Test
	public void testFilterEvenNumberWithNullElement()
	{
		List<Integer> list = Arrays.asList(1,3,8,46,16,24,null);
		List<Integer> res = Arrays.asList(8,46,16,24);
		Utils u = new Utils();
		Assert.assertArrayEquals(res.toArray(), u.filterEvenNumbers(list).toArray());
	}
	
	@Test
	public void testFilterEvenNumberNullList()
	{
		Utils u = new Utils();
		Assert.assertEquals(null, u.filterEvenNumbers(null));
	}
	
	@Test
	public void testFilterEvenNumberEmptyList()
	{
		List<Integer> list = Arrays.asList();
		List<Integer> res = Arrays.asList();
		
		Utils u = new Utils();
		Assert.assertArrayEquals(res.toArray(), u.filterEvenNumbers(list).toArray());
	}

	@Test
	public void testTransformSquarePlusPointFive()
	{
		List<Integer> list = Arrays.asList(1,3,5,7,10);
		List<Float> res = Arrays.asList(1.5f,9.5f,25.5f,49.5f,100.5f);
		
		Utils u = new Utils();
		Assert.assertArrayEquals(res.toArray(), u.transformSquarePlusPointFive(list).toArray());
	}
	
	@Test
	public void testTransformSquarePlusPointFiveWithNull()
	{
		List<Integer> list = Arrays.asList(1,3,5,null,7,10);
		List<Float> res = Arrays.asList(1.5f,9.5f,25.5f,49.5f,100.5f);
		
		Utils u = new Utils();
		Assert.assertArrayEquals(res.toArray(), u.transformSquarePlusPointFive(list).toArray());
	}
	
	@Test
	public void testTransformSquarePlusPointFiveEmptyList()
	{
		List<Integer> list = Arrays.asList();
		List<Float> res = Arrays.asList();
		
		Utils u = new Utils();
		Assert.assertArrayEquals(res.toArray(), u.transformSquarePlusPointFive(list).toArray());
	}
	
	@Test
	public void testTransformSquarePlusPointFiveNullList()
	{		
		Utils u = new Utils();
		Assert.assertEquals(null, u.transformSquarePlusPointFive(null));
	}
	
}
