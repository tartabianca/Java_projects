package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static ArrayList<Planet> planets=new ArrayList<Planet>();
    public static ArrayList<Character> characters=new ArrayList<Character>();
    public static int idPlanet=0,idVillain=0,idSuperhero=0;

    public static void main(String[] args) {
        readFromFile();

        int opt = -1;
        while (opt != 8) {
            System.out.println("Choose:\n1. Print the list of Planets\n2. Print the list of Villains\n3. Print the list of Superheroes\n4. Choose the planet\n5. Choose the Superhero\n6. Choose the Villain\n7. Fight\n8. Exit");
            System.out.println("Your option: ");
            Scanner in = new Scanner(System.in);
            opt = in.nextInt();

            switch (opt) {
                case 1:
                    displayPlanets();
                    break;
                case 2:
                    displayVillain();
                    break;
                case 3:
                    displaySuperhero();
                    break;
                case 4:
                    choosePlanet();
                    break;
                case 5:
                    chooseSuperhero();
                    break;
                case 6:
                    chooseVillain();
                    break;
                case 7:
                    fight();
                    break;
                case 8:
                    break;
                default:
                    break;
            }
        }

    }

    static void fight()
    {
        Team t=new Team();
        if(idPlanet==0||idVillain==0||idSuperhero==0)
            System.out.println("Firstly you have to choose the Planet, the Superhero and the Villain!");
        else
        {
            t.setP(planets.get(idPlanet));
            t.setS(characters.get(idSuperhero));
            t.setV(characters.get(idVillain));
        }
        t.display();
        t.fight();


    }

    static void choosePlanet(){
        System.out.println("id= ");
        Scanner in = new Scanner(System.in);
        idPlanet = in.nextInt();
    }

    static void chooseVillain(){
        System.out.println("id= ");
        Scanner in = new Scanner(System.in);
        idVillain = in.nextInt();
    }

    static void chooseSuperhero(){
        System.out.println("id= ");
        Scanner in = new Scanner(System.in);
        idSuperhero = in.nextInt();
    }

    static void displayVillain()
    {
        for(int i=0;i<characters.size();i++)
        {
            if(characters.get(i).isVillain)
                 characters.get(i).display();
        }
    }

    static void displaySuperhero()
    {
        for(int i=0;i<characters.size();i++)
        {
            if(!characters.get(i).isVillain)
                characters.get(i).display();
        }
    }

    static void displayPlanets()
    {
        for(int i=0;i<planets.size();i++)
        {
            planets.get(i).display();
        }
    }

    static void readFromFile()
    {
        try
        {
            File file = new File("C:\\Users\\Bianca\\Desktop\\Marvel_superheroes_wars\\characters.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("character");

            for (int i = 0; i < nodeList.getLength(); i++)
            {
                Node node = nodeList.item(i);
                Element eElement = (Element) node;
                Character c=new Character(Integer.parseInt(eElement.getElementsByTagName("attack").item(0).getTextContent()),
                        Integer.parseInt(eElement.getElementsByTagName("health").item(0).getTextContent()),
                        Integer.parseInt(eElement.getElementsByTagName("id").item(0).getTextContent()),
                        eElement.getElementsByTagName("description").item(0).getTextContent(),
                        eElement.getElementsByTagName("name").item(0).getTextContent(),
                        Boolean.parseBoolean(eElement.getElementsByTagName("isVillain").item(0).getTextContent()));
                characters.add(c);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            File file = new File("C:\\Users\\Bianca\\Desktop\\Marvel_superheroes_wars\\planets.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("planet");

            for (int i = 0; i < nodeList.getLength(); i++)
            {
                Node node = nodeList.item(i);
                Element eElement = (Element) node;
                Planet p=new Planet(eElement.getElementsByTagName("description").item(0).getTextContent(),
                        eElement.getElementsByTagName("name").item(0).getTextContent(),
                        Integer.parseInt(eElement.getElementsByTagName("heroAttackModifier").item(0).getTextContent()),
                        Integer.parseInt(eElement.getElementsByTagName("heroHealthModifier").item(0).getTextContent()),
                        Integer.parseInt(eElement.getElementsByTagName("villainAttackModifier").item(0).getTextContent()),
                        Integer.parseInt(eElement.getElementsByTagName("villainHealthModifier").item(0).getTextContent()),
                        Integer.parseInt(eElement.getElementsByTagName("id").item(0).getTextContent()));
                planets.add(p);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
