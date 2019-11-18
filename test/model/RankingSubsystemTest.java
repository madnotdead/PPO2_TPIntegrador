package model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import auxiliarObjects.ReviewCategory;

class RankingSubsystemTest {

	RankingSubsystem rankingSystem = RankingSubsystem.getInstance();
	ReviewCategory category = mock(ReviewCategory.class);

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
