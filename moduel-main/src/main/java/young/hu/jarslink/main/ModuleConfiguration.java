package young.hu.jarslink.main;

import com.alipay.jarslink.api.impl.ModuleLoaderImpl;
import com.alipay.jarslink.api.impl.ModuleManagerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModuleConfiguration {
    @Bean
    public ModuleLoaderImpl moduleLoader() {
        return new ModuleLoaderImpl();
    }

    @Bean
    public ModuleManagerImpl moduleManager() {
        return new ModuleManagerImpl();
    }

    @Bean
    public ModuleRefreshSchedulerImpl moduleRefreshScheduler() {
        ModuleRefreshSchedulerImpl moduleRefreshScheduler = new ModuleRefreshSchedulerImpl();
        moduleRefreshScheduler.setModuleLoader(moduleLoader());
        moduleRefreshScheduler.setModuleManager(moduleManager());
        return moduleRefreshScheduler;
    }
}
