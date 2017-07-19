package r418;

/**
 * Find the optimal number of tiles and gaps at each end of the queue in order
 * to ensure that the 1st and last tile has the same colour.
 *
 * @author josan.c
 */
public class TilesQueue {

    private int tileWidth;
    private int tilePairs;
    private int totalWidth;
    private int freeSpace;
    private int numberOfPairs;
    private int totalNumberOfTiles;

    /**
     * Constructs a tile queue with a given width, tile width and the amount of
     * tiles that follow the same pattern in a pair
     *
     * @param tileWidth the width of one tile
     * @param tilePairs the amount of tiles that follow the same pattern, hence
     * constituting a pair
     * @param totalWidth the total width of the tile queue
     */
    public TilesQueue(int tileWidth, int tilePairs, int totalWidth) {
        this.tileWidth = tileWidth;
        this.tilePairs = tilePairs;
        this.totalWidth = totalWidth;
    }

    public void findFreeSpace() {
        freeSpace = totalWidth - tileWidth;
    }

    public void findNumberOfPairs() {
        numberOfPairs = freeSpace / (tilePairs * tileWidth);
    }

    public int getTiles() {
        this.findFreeSpace();
        this.findNumberOfPairs();
        totalNumberOfTiles = 1 + (numberOfPairs * tilePairs);
        return totalNumberOfTiles;
    }

    public double getGap() {
        return (totalWidth - (totalNumberOfTiles * tileWidth)) / 2.0;
    }
}