package features;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bookings.Listing;
import properties.City;

class SearchManagerTest {

	public List<Listing> listings;
	public Listing listing;
	public City city;
	
	@BeforeEach
	void setUp() {
		city = mock(City.class);

		listing = mock(Listing.class);
		when(listing.getCity()).thenReturn(city);
		when(listing.getAvailableFrom()).thenReturn(LocalDate.of(2018, 1, 1));
		when(listing.getAvailableTo()).thenReturn(LocalDate.of(2018, 3, 1));

		listings = new ArrayList<Listing>();
		listings.add(listing);
	}

	@Test
	void testSearchWithRequiredCriteria() {
		SearchManger searchManager = new SearchManger(city, LocalDate.of(2018, 2, 1), LocalDate.of(2018, 2, 15));
		assertTrue(searchManager.doSearch(listings).contains(listing));
	}

	@Test
	void testSearchWithoutListings() {
		SearchManger searchManager = new SearchManger(city, LocalDate.of(2018, 2, 1), LocalDate.of(2018, 2, 15));
		assertTrue(searchManager.doSearch(new ArrayList<Listing>()).isEmpty());
	}

	@Test
	void testSearchOnLimitDates() {
		SearchManger searchManager = new SearchManger(city, LocalDate.of(2018, 1, 1), LocalDate.of(2018, 2, 1));
		assertTrue(searchManager.doSearch(listings).contains(listing));
	}

	@Test
	void testSearchForDifferentCity() {
		City otherCity = mock(City.class);
		SearchManger searchManager = new SearchManger(otherCity, LocalDate.of(2018, 1, 1), LocalDate.of(2018, 2, 1));
		assertTrue(searchManager.doSearch(listings).isEmpty());
	}
}
