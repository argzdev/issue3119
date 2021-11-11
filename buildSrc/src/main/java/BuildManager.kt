import com.google.firebase.appdistribution.gradle.AppDistributionProperties
import com.google.firebase.appdistribution.gradle.UploadDistributionTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.internal.impldep.org.apache.http.util.TextUtils
import java.io.File

class BuildManager : Plugin<Project> {
    override fun apply(project: Project) {
        project.task("uploadTask") {
            doLast {
                val appDistributionTask = project.tasks.register("TestDistributionTask", UploadDistributionTask::class.java).get()

                // This line below works when appdistribution version 2.1.0 is used
                // Using the latest version 2.2.0 causes compilation issues
                appDistributionTask.appDistributionProperties = AppDistributionProperties(null, null, null)
            }
        }
    }
}