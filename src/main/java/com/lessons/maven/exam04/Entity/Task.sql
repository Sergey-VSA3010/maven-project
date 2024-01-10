



--1.
--SELECT b.name,ft.start_date,fc.fish_type,fc.quantity
--FROM Boat b
--JOIN tb_fishing_trip ft ON b.id=ft.boat_id
--JOIN tb_fishing_catch fc ON ft.id=fc.fishing_trip_id;

--1.
SELECT Boat.name AS BoatName, FishingTrip.departureDate, FishingCatch.fishType, FishingCatch.weight
FROM FishingTrip
JOIN Boat ON FishingTrip.boat_id = Boat.id
JOIN FishingCatch ON FishingTrip.id = FishingCatch.fishingtrip_id;
--2
SELECT Boat.name AS BoatName, COUNT(FishingTrip.id) AS NumberOfTrips
FROM Boat
JOIN FishingTrip ON Boat.id = FishingTrip.boat_id
GROUP BY Boat.id, Boat.name;
--3
SELECT Boat.name AS BoatName, SUM(FishingCatch.weight) AS TotalCatch
FROM Boat
JOIN FishingTrip ON Boat.id = FishingTrip.boat_id
JOIN FishingCatch ON FishingTrip.id = FishingCatch.fishingTrip_id
GROUP BY Boat.id, Boat.name
HAVING TotalCatch > 11;
--4
SELECT FishingCatch.fishType,FishingTrip.id AS TripID, FishingTrip.departureDate, FishingTrip.returnDate, FishingCatch.weight
FROM FishingCatch
JOIN FishingTrip ON FishingCatch.fishingTrip_id = FishingTrip.id
ORDER BY FishingCatch.fishType, FishingTrip.departureDate;