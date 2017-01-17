
object A {
  sealed trait Customer
  case object Regular extends Customer
  case object Rewards extends Customer

  sealed trait Day
  case object Weekday extends Day
  case object Weekend extends Day

  type Price = Int

  case class BookingRequest(customer: Customer, days: List[Day]) {
    def categories = days.map(day => (customer, day))
  }

  case class Hotel(name: String, rating: Int, rateCard: Map[(Customer, Day), Price]) {
    def priceFor(bookingRequest: BookingRequest): Int =
      bookingRequest.categories.map(rateCard).sum
  }

  class HotelRepo(hotels: Hotel*) {
    def getBestHotel(bookingRequest: BookingRequest): String =
      hotels.minBy(hotel => (hotel.priceFor(bookingRequest), -hotel.rating)).name
  }

  new HotelRepo(Hotel(
    "hotel1", 3, Map(
      (Regular, Weekday) -> 100,
      (Regular, Weekday) -> 120
    )
  ))
}
