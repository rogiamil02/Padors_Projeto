package model;

public abstract class AbstractMazeFactory {

    public AbstractMazeFactory() { };

    public abstract Maze makeMaze ();
    public abstract Wall makeWall ();
    public abstract Room makeRoom ();
    public abstract Door makeDoor ();

    //Construtor 
    public abstract MazeGame getmaze();

}
