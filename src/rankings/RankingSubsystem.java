package rankings;

import java.util.ArrayList;
import java.util.List;

import bookings.User;
import properties.Property;

public class RankingSubsystem {
	private static RankingSubsystem uniqueInstance;
	
	private List<ReviewCategory> propertyReviewCategories = new ArrayList<ReviewCategory>(); 
	private List<TenantToPropertyReview> tenantToPropertyReviews = new ArrayList<TenantToPropertyReview>();

	private List<ReviewCategory> ownerReviewCategories = new ArrayList<ReviewCategory>();
	private List<TenantToOwnerReview> tenantToOwnerReviews = new ArrayList<TenantToOwnerReview>();

	private List<ReviewCategory> tenantReviewCategories = new ArrayList<ReviewCategory>();
	private List<OwnerToTenantReview> ownerToTenantReviews = new ArrayList<OwnerToTenantReview>();

	private RankingSubsystem() {}

	public static synchronized RankingSubsystem getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new RankingSubsystem();
        }
        return uniqueInstance;
    }
	public static synchronized void reset() {
		uniqueInstance = null;
	}

	/* propiedades */
	public void addPropertyReviewCategory(ReviewCategory aCategory) {
		this.propertyReviewCategories.add(aCategory);
	}
	public List<ReviewCategory> getPropertyReviewCategories() {
		return propertyReviewCategories;
	}
	public Double getPropertyAverageRanking(Property aProperty) {
		// TODO completar
		return 1.0;
	};
	public Double getPropertyAverageRankingForCategory(Property aProperty, ReviewCategory aCategory) {
		// TODO completar
		return 1.0;
	};

	/* propietarios */
	public void addOwnerReviewCategory(ReviewCategory aCategory) {
		this.ownerReviewCategories.add(aCategory);
	}
	public List<ReviewCategory> getOwnerReviewCategories() {
		return ownerReviewCategories;
	}
	public Double getOwnerAverageRanking(User anOwner) {
		// TODO completar
		return 1.0;
	};
	public Double getOwnerAverageRankingForCategory(User anOwner, ReviewCategory aCategory) {
		// TODO completar
		return 1.0;
	};
	
	/* inquilinos */
	public void addTenantReviewCategory(ReviewCategory aCategory) {
		this.tenantReviewCategories.add(aCategory);
	}
	public List<ReviewCategory> getTenantReviewCategories() {
		return tenantReviewCategories;
	}
	public Double getTenantAverageRanking(User aTenant) {
		// TODO completar
		return 1.0;
	};
	public Double getTenantAverageRankingForCategory(User aTenant, ReviewCategory aCategory) {
		// TODO completar
		return 1.0;
	};
}
