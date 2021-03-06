package net.ntworld.mergeRequestIntegration.provider.gitlab.response

import net.ntworld.foundation.Error
import net.ntworld.foundation.Response
import org.gitlab4j.api.models.Commit

data class GitlabGetMRCommitsResponse(
    override val error: Error?,
    val commits: List<Commit>
) : Response
