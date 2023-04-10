package com.example.nbatrivia;

import java.util.ArrayList;

public class QuestionBank {

    private ArrayList<Question> questions;

    public QuestionBank() {
        questions = new ArrayList<>();
        // Level 1 Questions
        questions.add(new Question("Which player is known as \"His Airness\"?", new String[]{"Michael Jordan", "Kobe Bryant", "LeBron James", "Larry Bird"}, 0));
        questions.add(new Question("How many points is a three-pointer worth?", new String[]{"1", "2", "3", "4"}, 2));
        questions.add(new Question("How many teams are in the NBA?", new String[]{"30", "25", "32", "28"}, 0));
        questions.add(new Question("Which team has won the most NBA championships?", new String[]{"Los Angeles Lakers", "Chicago Bulls", "Boston Celtics", "Golden State Warriors"}, 2));
        questions.add(new Question("In which city are the Rockets based?", new String[]{"Houston", "Los Angeles", "New York", "Boston"}, 0));

        // Level 2 Questions
        questions.add(new Question("Which player has the nickname \"The Greek Freak\"?", new String[]{"Giannis Antetokounmpo", "Luka Doncic", "Nikola Jokic", "Zion Williamson"}, 0));
        questions.add(new Question("Who is the NBA's all-time leading scorer?", new String[]{"Kareem Abdul-Jabbar", "Karl Malone", "LeBron James", "Michael Jordan"}, 0));
        questions.add(new Question("Which team drafted Kobe Bryant?", new String[]{"Los Angeles Lakers", "Charlotte Hornets", "Philadelphia 76ers", "Chicago Bulls"}, 1));
        questions.add(new Question("Which player is known for his skyhook shot?", new String[]{"Kareem Abdul-Jabbar", "Larry Bird", "Hakeem Olajuwon", "Shaquille O'Neal"}, 0));
        questions.add(new Question("What are the two conferences in the NBA?", new String[]{"East and West", "North and South", "Atlantic and Pacific", "American and National"}, 0));

        // Level 3 Questions
        questions.add(new Question("Who holds the NBA record for most points scored in a single game?", new String[]{"Michael Jordan", "Kobe Bryant", "Wilt Chamberlain", "Elgin Baylor"}, 2));
        questions.add(new Question("Which team won the first NBA championship?", new String[]{"New York Knicks", "Boston Celtics", "Philadelphia Warriors", "Minneapolis Lakers"}, 2));
        questions.add(new Question("Which player is known as \"The Answer\"?", new String[]{"Allen Iverson", "Shaquille O'Neal", "Carmelo Anthony", "Dwyane Wade"}, 0));
        questions.add(new Question("Who is the youngest player to score 30,000 career points?", new String[]{"LeBron James", "Kobe Bryant", "Michael Jordan", "Kevin Durant"}, 0));
        questions.add(new Question("Which team won the NBA championship in 2004?", new String[]{"Los Angeles Lakers", "San Antonio Spurs", "Detroit Pistons", "Miami Heat"}, 2));

        // Level 4 Questions (continued)
        questions.add(new Question("Which player has the most triple-doubles in NBA history?", new String[]{"Magic Johnson", "Oscar Robertson", "LeBron James", "Russell Westbrook"}, 3));
        questions.add(new Question("Who is the all-time leader in assists?", new String[]{"John Stockton", "Magic Johnson", "Steve Nash", "Jason Kidd"}, 0));
        questions.add(new Question("What team did Michael Jordan play for when he returned to the NBA after retiring?", new String[]{"Chicago Bulls", "Washington Wizards", "Charlotte Hornets", "Miami Heat"}, 1));
        questions.add(new Question("Who was the first non-American player to win the NBA MVP award?", new String[]{"Dirk Nowitzki", "Hakeem Olajuwon", "Steve Nash", "Yao Ming"}, 1));

        // Level 5 Questions
        questions.add(new Question("Who holds the record for the most blocks in a single NBA game?", new String[]{"Hakeem Olajuwon", "Dikembe Mutombo", "Manute Bol", "Elmore Smith"}, 3));
        questions.add(new Question("What team did Wilt Chamberlain play for when he scored 100 points in a single game?", new String[]{"Philadelphia Warriors", "San Francisco Warriors", "Los Angeles Lakers", "Philadelphia 76ers"}, 0));
        questions.add(new Question("Which player was nicknamed \"Pistol\"?", new String[]{"Pete Maravich", "Jerry West", "Bob Cousy", "George Gervin"}, 0));
        questions.add(new Question("Who holds the NBA record for most seasons played?", new String[]{"Kevin Garnett", "Vince Carter", "Robert Parish", "Kareem Abdul-Jabbar"}, 1));
        questions.add(new Question("What team did Bill Russell play for during his entire NBA career?", new String[]{"Boston Celtics", "New York Knicks", "Philadelphia 76ers", "Minneapolis Lakers"}, 0));
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getSize() {
        return questions.size();
    }
}