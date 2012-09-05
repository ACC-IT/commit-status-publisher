package jetbrains.teamcilty.github.api;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Eugene Petrenko (eugene.petrenko@gmail.com)
 * Date: 06.09.12 2:54
 */
public interface GitHubApiFactory {
  public static final String DEFAULT_URL = "https://api.github.com";

  @NotNull
  GitHubApi openGitHub(@NotNull final String url,
                       @NotNull final String username,
                       @NotNull final String password);
}
