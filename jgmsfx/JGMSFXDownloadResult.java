// JGMSFX Download Result. JGMSFX: Subproject of GMSFX3.

package jgmsfx;

/**
 * Download result.
 */
public class JGMSFXDownloadResult {
    protected String sfxPath;

    protected String[] error;

    /**
     * Initialize download result.
     */
    public JGMSFXDownloadResult(String sfxPath_, String[] error_) {
        sfxPath = sfxPath_;

        error = error_;
    }

    /**
     * Get path to SFX.
     */
    public String getSFX() {
        return sfxPath;
    }

    /**
     * Get error (check <code>isSuccess</code>).
     */
    public String[] getError() {
        return error;
    }

    /**
     * Is SFX downloaded successfully.
     */
    public boolean isSuccess() {
        return sfxPath != null && error == null;
    }
}
