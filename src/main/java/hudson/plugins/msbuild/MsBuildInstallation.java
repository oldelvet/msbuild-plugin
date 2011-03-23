package hudson.plugins.msbuild;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * MsBuild installation.
 * 
 * @author Gregory Boissinot - Zenika
*/
public final class MsBuildInstallation {
	
	
    private final String name;
    private final String pathToMsBuild;

    @DataBoundConstructor
    public MsBuildInstallation(String name, String pathToMsBuild) {
        this.name = name;
        this.pathToMsBuild = pathToMsBuild;
    }

    
	public String getPathToMsBuild() {
		return pathToMsBuild;
	}

	/**
     * Human readable display name.
     */
    public String getName() {
        return name;
    }
}
