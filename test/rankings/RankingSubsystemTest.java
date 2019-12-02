package rankings;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class RankingSubsystemTest {

	public RankingSubsystem rankingSystem = RankingSubsystem.getInstance();
	public ReviewCategory category = mock(ReviewCategory.class);

	@Test
	void testUniqueInstance() {
		RankingSubsystem otherRankingSystem = RankingSubsystem.getInstance();
		
		assertEquals(rankingSystem, otherRankingSystem);
	}

	@Test
	void testResetInstance() {
		RankingSubsystem.reset();
		RankingSubsystem otherRankingSystem = RankingSubsystem.getInstance();

		assertNotEquals(rankingSystem, otherRankingSystem);
	}
	
	@Test
	void testAddingPropertyReviewCategory() {
		rankingSystem.addPropertyReviewCategory(category);
		assertTrue(rankingSystem.getPropertyReviewCategories().contains(category));
	}
	
	@Test
	void testAddingOwnerReviewCategory() {
		rankingSystem.addOwnerReviewCategory(category);
		assertTrue(rankingSystem.getOwnerReviewCategories().contains(category));
	}

	@Test
	void testAddingTenantReviewCategory() {
		rankingSystem.addTenantReviewCategory(category);
		assertTrue(rankingSystem.getTenantReviewCategories().contains(category));
	}
}
