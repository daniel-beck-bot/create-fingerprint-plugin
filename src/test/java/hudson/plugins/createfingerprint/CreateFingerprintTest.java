package hudson.plugins.createfingerprint;

import hudson.model.FreeStyleProject;
import org.jvnet.hudson.test.HudsonTestCase;

/**
 * @author Marc Sanfacon
 */
public class CreateFingerprintTest extends HudsonTestCase {
    public void testConfigRoundtrip() throws Exception {
        FreeStyleProject p = createFreeStyleProject();
/*        Python before = new Python("print 5");
        p.getBuildersList().add(before);

        configRoundtrip(p);

        Python after = p.getBuildersList().get(Python.class);

        assertNotSame(before,after);
        assertEqualDataBoundBeans(before,after);

        assertBuildStatusSuccess(p.scheduleBuild2(0));
*/    }
}
