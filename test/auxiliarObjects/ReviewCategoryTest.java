package auxiliarObjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReviewCategoryTest {

	@Test
	void testReflexiveReviewCategory() {
		/* Reflexivo */
		ReviewCategory aReviewCategory = new ReviewCategory("Limpieza");
		assertTrue(aReviewCategory.equals(aReviewCategory));
		assertEquals(aReviewCategory, aReviewCategory);
	}
	
	@Test
	void testSymmetricReviewCategory() {
		/* Simétrico */
		ReviewCategory aReviewCategory = new ReviewCategory("Limpieza");
		ReviewCategory anotherReviewCategory = new ReviewCategory("Limpieza");
		assertEquals(aReviewCategory, anotherReviewCategory);
		assertTrue(aReviewCategory.equals(anotherReviewCategory));
		assertTrue(anotherReviewCategory.equals(aReviewCategory));
	}

	@Test
	void testNotNullReviewCategory() {
		ReviewCategory aReviewCategory = new ReviewCategory("Limpieza");
		assertFalse(aReviewCategory.equals(null));
	}

	@Test
	void testDifferentReviewCategory() {
		ReviewCategory aReviewCategory = new ReviewCategory("Limpieza");
		ReviewCategory anotherReviewCategory = new ReviewCategory("Amabilidad");
		assertFalse(aReviewCategory.equals(anotherReviewCategory));
	}
}
