public class TVShow{
    //data fields
    String name;
    String network;
    int length;


    // methods/behaviors
    //!  Construct a new default TV show.
    public TVShow(){
        name = "n/a";
        network = "n/a";
        length = 0;
    }

    //! Constructs a new TV show with given name, channel, and length.
    public TVShow(String aName, String aNetwork, int aLength){
        name = aName;
        network = aNetwork;
        length = aLength;
    }

    //! Return the length of the show in hours.
    public double getHours(){
        return length / 60.0;
    }

    public void printShow(){
        System.out.println("Name: " + name + "; Network: " + network + "; Length(mins): " + length);
    }


}