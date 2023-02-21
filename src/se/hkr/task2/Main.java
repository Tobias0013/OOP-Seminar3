package se.hkr.task2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        ArrayList<Competitor> competitors = main.letsRun("participants.txt");

        Collections.sort(competitors);

        main.printResults(competitors);

        main.writeToFile(competitors, "RunningTimeResults.ser");
    }

    public ArrayList<Competitor> letsRun(String path){
        ArrayList<Competitor> competitors = new ArrayList<>();
        File file = new File(path);
        Random rnd = new Random();

        try (Scanner sc = new Scanner(file)){
            while (sc.hasNextLine()){
                String[] line = sc.nextLine().split(",");

                competitors.add(new Competitor(line[0], Integer.parseInt(line[1]), line[2],
                        new Time(rnd.nextInt(1, 3), rnd.nextInt(0, 59),rnd.nextInt(0, 59))));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        return competitors;
    }
    
    public void writeToFile(ArrayList<Competitor> competitors, String path){
        try (FileOutputStream fs = new FileOutputStream(path)){
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(competitors);

            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printResults(ArrayList<Competitor> competitors){
        System.out.println("Running Result:");
        for (Competitor c :
                competitors) {
            System.out.println(c.toString());
        }
    }
}
