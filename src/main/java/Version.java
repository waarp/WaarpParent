// DO NOT MODIFY - WILL BE OVERWRITTEN DURING THE BUILD PROCESS
package;

/**
 * Provides the version information of WaarpParent.
 */
public final class Version {
    /**
     * The version identifier.
     */
    public static final String ID = "1.6";

    private Version() {
        super();
    }

    /**
     * Prints out the version identifier to stdout.
     */
    public static void main(String[] args) {
        System.out.println(ID);
    }
}
