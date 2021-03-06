import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @crli
 * @version 17 November 2015
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 6 rows and 6 columns
    private final int ROWS = 6;
    private final int COLS = 6;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X1 = 4, Y1 = 2;
        final int X2 = 2, Y2 = 3;
        final int X3 = 3, Y3 = 3;
        final int X4 = 1, Y4 = 4;
        final int X5 = 2, Y5 = 4;
        final int X6 = 5, Y6 = 3;
        final int X7 = 0, Y7 = 3;
        final int X8 = 0, Y8 = 2;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(Y6, X6);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(Y7, X7);
        grid.put(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(Y8, X8);
        grid.put(loc8, rock8);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        // insert magic here...
        ArrayList <Boolean> die = new ArrayList<Boolean>();
        ArrayList <Location> listOfLocs = grid.getOccupiedLocations();
        ArrayList <Location> listOfEmptyLocs = new ArrayList<Location>();
        ArrayList <Location> live = new ArrayList<Location>();
        
        for(Location location: listOfLocs)
        {
            if(grid.getOccupiedAdjacentLocations(location).size()>3||grid.getOccupiedAdjacentLocations(location).size()<2)
            {
                die.add(true);
            }
            else
            {
                die.add(false);
            }
        }
        
        for(Location location: listOfLocs)
        {
            listOfEmptyLocs = grid.getEmptyAdjacentLocations(location);
            
            for(Location location2: listOfEmptyLocs)
            {
                if(grid.getOccupiedAdjacentLocations(location2).size()==3)
                {
                    live.add(location2);
                }
            }
        }
        
        for(Location location: live)
        {
            grid.put(location, new Rock());
        }
        
        live.clear();
        
        for(int i = 0;
            i < listOfLocs.size();
            i++)
        {
            if(die.get(i)==true)
            {
                grid.remove(listOfLocs.get(i));
            }
        }
        
        world.show();
    }

    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Would you like to see the next generation?(y/n) ");
        String answer = scan.next();
        
        while(answer.equals("y"))
        {
            game.createNextGeneration();
            Thread.sleep(1000);
            System.out.print("Would you like to see the next generation?(y/n) ");
            answer = scan.next();
        }
    }
}