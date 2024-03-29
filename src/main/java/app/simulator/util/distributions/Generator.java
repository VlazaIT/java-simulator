package app.simulator.util.distributions;

/**
 * A generic Generator class which delegates its Seedable ability to a <code>Distributions</code> object.
 */
public abstract class Generator implements Seedable {
    protected Distributions distrib;
    Generator () { distrib = new Distributions(); }
    Generator (long seed) { distrib = new Distributions(seed); }
    
    public long getSeed() { return distrib.source.getSeed(); }

    // ----- implements Seedable { -----
    public void setSeed(long seed) { distrib.source.setSeed(seed); }

    public void reseed() { distrib.source.reseed(); }
    // ----- } implements Seedable -----
}
