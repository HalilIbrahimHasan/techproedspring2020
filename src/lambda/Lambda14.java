package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda14 {
	   //Course class should be created

	public static void main(String[] args) {
		
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
		
		List<Course> courseList = new ArrayList<>();
		courseList.add(courseTurkishDay);
		courseList.add(courseTurkishNight);
		courseList.add(courseEnglishDay);
		courseList.add(courseEnglishNight);
		System.out.println(courseList); //Prints the list elements on the console
		
		//Check if all averageScores are greater than 90
		System.out.println(courseList.stream().allMatch(t->t.getAverageScore()>90)); //true
		
		//Check if all course names containing the word "Day"
		System.out.println(courseList.stream().allMatch(t->t.getCourseName().contains("Day"))); //false
		
		//Check if any number of Students is equal to 154
		System.out.println(courseList.stream().anyMatch(t->t.getNumberOfStudents()==154)); //true
		
		//Check if any season contains Autumn
		System.out.println(courseList.stream().anyMatch(t->t.getSeason().contains("Autumn"))); //false
		
		//Check if no number of Students is equal to 100
		System.out.println(courseList.stream().noneMatch(t->t.getNumberOfStudents()==100)); //true
		
		//Check if no season contains Spring
		System.out.println(courseList.stream().noneMatch(t->t.getSeason().contains("Spring"))); //false
		
		//Sort the list elements according to the number of students
		Comparator<Course> comparatorForNum = Comparator.comparing(Course::getNumberOfStudents);
		System.out.println(courseList.stream().sorted(comparatorForNum).collect(Collectors.toList()));
		
		//Sort the list elements according to the name of the course in reverse order
		Comparator<Course> comparatorForName = Comparator.comparing(Course::getCourseName).reversed();
		System.out.println(courseList.stream().sorted(comparatorForName).collect(Collectors.toList()));
		
		//Sort the list elements according to the season and average score
		Comparator<Course> comparatorForSeasonAndScore = Comparator.comparing(Course::getSeason).thenComparing(Course::getAverageScore);
		System.out.println(courseList.stream().sorted(comparatorForSeasonAndScore).collect(Collectors.toList()));
		
		//Sort the list elements according to the season and average score and limit the elements by 2
		Comparator<Course> comparatorForSeasonAndScoreLimTwo = Comparator.comparing(Course::getSeason).thenComparing(Course::getAverageScore);
		System.out.println(courseList.stream().sorted(comparatorForSeasonAndScoreLimTwo).limit(2).collect(Collectors.toList()));
		
		//Sort the list elements according to the season and average score and skip first 3 elements
		Comparator<Course> comparatorForSeasonAndScoreSkipThree = Comparator.comparing(Course::getSeason).thenComparing(Course::getAverageScore);
		System.out.println(courseList.stream().sorted(comparatorForSeasonAndScoreSkipThree).skip(3).collect(Collectors.toList()));
		
		//Sort the list elements according to the season and average score and skip first element and limit the elements by 2
		Comparator<Course> comparatorForSeasonAndScoreSkipFirstLimTwo = Comparator.comparing(Course::getSeason).thenComparing(Course::getAverageScore);
		System.out.println(courseList.stream().sorted(comparatorForSeasonAndScoreSkipFirstLimTwo).skip(1).limit(2).collect(Collectors.toList()));
		
		//Get the element whose average score is max
		Comparator<Course> comparatorForMaxScore = Comparator.comparing(Course::getAverageScore);
		System.out.println(courseList.stream().max(comparatorForMaxScore));
		
		//Get the element whose number of students is min
		Comparator<Course> comparatorForMinStudent = Comparator.comparing(Course::getNumberOfStudents);
		System.out.println(courseList.stream().min(comparatorForMinStudent).orElse(new Course("No Season", "No Course", 0, 0)));
		//If list is empty it returns orElse() part, otherwise it returns Optional.empty
		
		//Get the first element
		System.out.println(courseList.stream().findFirst().orElse(new Course("No Season", "No Course", 0, 0)));
		
		//Sort in natural order according to the season name Get the last element
		System.out.println(courseList.stream().sorted(Comparator.comparing(Course::getSeason).reversed()).findFirst().orElse(new Course("No Season", "No Course", 0, 0)));
		
		//findAny() is free to select any element in the stream, returns empty if the stream is empty
		System.out.println(courseList.stream().findAny());
		
		//Find the sum of the number of students whose average grades are more than 95
		System.out.println(courseList.stream().filter(t->t.getAverageScore()>95).mapToInt(Course::getNumberOfStudents).sum());
		
		//Find the average of the number of students whose average grades are more than 93
		System.out.println(courseList.stream().filter(t->t.getAverageScore()>93).mapToInt(Course::getNumberOfStudents).average());
		
		//Find the number of courses whose average grades are more than 93
		System.out.println(courseList.stream().filter(t->t.getAverageScore()>93).count());
		
		//Find the max number of students whose average grades are more than 93
		System.out.println(courseList.stream().filter(t->t.getAverageScore()>93).mapToInt(Course::getNumberOfStudents).max());
		
		//Find the min number of students whose average grades are more than 93
		System.out.println(courseList.stream().filter(t->t.getAverageScore()>93).mapToInt(Course::getNumberOfStudents).min());
		
		//Group the courses according to the season
		System.out.println(courseList.stream().collect(Collectors.groupingBy(Course::getSeason)));
		
		//Find the numbers of the courses according to the season
		System.out.println(courseList.stream().collect(Collectors.groupingBy(Course::getSeason, Collectors.counting())));
		
		//Find the max average score of the courses for every season
		System.out.println(courseList.stream().collect(Collectors.groupingBy(Course::getSeason, Collectors.maxBy(Comparator.comparing(Course::getAverageScore)))));
		       
		//Group the courses according to the season but print just the course names on the console
		System.out.println(courseList.stream().collect(Collectors.groupingBy(Course::getSeason, Collectors.mapping(Course::getCourseName, Collectors.toList()))));
	}

}
